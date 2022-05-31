package ar.unqui.tp6.Banco;

public abstract class SolicitudDeCredito {
	
	private Client client;
	private double montoSolicitado;
	private int plazoEnMeses;
	private boolean aceptable;
	
	
	public SolicitudDeCredito(Client cliente, double monto, int cuotas) {
		client 			 =  cliente;
		montoSolicitado  =  monto;
		plazoEnMeses 	 =  cuotas;
		aceptable		 =  this.evaluarSolicitud(cliente);
	}
	
	public abstract boolean evaluarSolicitud(Client cliente);

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}
	
}
