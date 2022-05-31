	package ar.unqui.tp4;

public class Sueldo {
	private String mes;
	private double montoPercibido;
	private int hsExtra;
	
	
	public Sueldo(String _mes, double _montoPercibido, int _hsExtra) {
		mes = _mes;
		montoPercibido = _montoPercibido;
		hsExtra = _hsExtra;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public double valorHoraExtra() {
		return 500d;
	}
	
	public int getHsExtraRealizadas() {
		return hsExtra;
	}
	
}
