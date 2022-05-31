package ar.unqui.tp6.Banco;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Client> clients = new ArrayList<Client>();
	private List<SolicitudDeCredito> solicitudesDeCredito = new ArrayList<SolicitudDeCredito>();
	
	public void addClient(Client cliente) {
		clients.add(cliente);
	}
	
	
	public void addSolicitudCredito(SolicitudDeCredito solicitud) {
		solicitudesDeCredito.add(solicitud);
	}
	
}
