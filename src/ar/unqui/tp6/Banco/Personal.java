package ar.unqui.tp6.Banco;

public class Personal extends SolicitudDeCredito {
	
	public Personal(Client cliente, double monto, int cuotas) {
		super(cliente, monto, cuotas);
		// TODO Auto-generated constructor stub
	}

	public boolean evaluarSolicitud(Client cliente) {
		return (cliente.getSueldoAnual() >= 15000d) && (getMontoSolicitado() < (cliente.getSueldoMensual() * 0.70d));
	}
	
}
