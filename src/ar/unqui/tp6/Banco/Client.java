package ar.unqui.tp6.Banco;

public class Client {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoMensual;
	
	public Client(String _nombre, String _apellido, String _dir, int _edad, double _sueldoMensual) {
		nombre 		  = _nombre;
		apellido 	  = _apellido;
		direccion 	  = _dir;
		edad 		  = _edad;
		sueldoMensual = _sueldoMensual;
	}
	
	private void solicitarCredito(SolicitudDeCredito tipoCredito, double monto, int cuotas, Bank banco) {
		banco.addSolicitudCredito(new SolicitudDeCredito(this, monto, cuotas));
	}
	
	
	public double getSueldoAnual() {
		return sueldoMensual * 12;
	}
	
	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public int getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}
	
	

}
