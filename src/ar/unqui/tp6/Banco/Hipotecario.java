package ar.unqui.tp6.Banco;

public class Hipotecario extends SolicitudDeCredito {
	
	private Inmueble garantia;
	
	public Hipotecario(Client cliente, double monto, int cuotas, Inmueble _garantia) {
		super(cliente, monto, cuotas);
		garantia = _garantia;
	}
	
	

	public boolean evaluarSolicitud(Client client) {
		return (
				(getMontoSolicitado() <= (client.getSueldoMensual() / 2))
				&&
				(getMontoSolicitado() <= (garantia.getValorFiscal() * 0.70d))
				&&
				(client.getEdad() + (this.duracionDelCreditoEnAños()) <= 65));
	}
	
	private double duracionDelCreditoEnAños() {
		return getPlazoEnMeses() / 12;
	}
	
}
