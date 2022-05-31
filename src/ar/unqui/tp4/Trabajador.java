package ar.unqui.tp4;

public class Trabajador {
	private double ingresosAlAño;
	private int hsExtraAlMes;
	private List<Sueldo> sueldos = new ArrayList<Sueldo>();
	
	
	public double getTotalPercibido() { //Del primer mes trabajado
		return (this.getMontoImponible() - this.getImpuestoAPagar()) + (this.getPrimerSueldo.getHsExtraRealizadas * this.getPrimerSueldo.valorHoraExtra());
	}
	
	public Sueldo getPrimerSueldo() {
		return sueldos.get(1);
	}
	
	
	public double getMontoImponible() { //Del primer mes trabajado
		return this.getPrimerSueldo.getMontoPercibido();
	}
	
	
	public double getImpuestoAPagar() { //Del primer mes trabajado
		return this.getMontoImponible() * (0,98d);
	}
}
