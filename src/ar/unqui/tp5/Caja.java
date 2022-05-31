package ar.unqui.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Agencia {
	
	private List<Producto> productosRegistrados = new ArrayList<Producto>();
	private double dineroEnCaja;
	
	
	public double getTotalAPagar() {
		double totalAPagar = 0d;
		for (Producto producto : productosRegistrados) {
			totalAPagar = totalAPagar + producto.getPrecio();
		}
		return totalAPagar;
	}
	
	public void registrarProducto(Producto prod) {
		productosRegistrados.add(prod);
		prod.setStock(prod.stock - 1);
	}
	
	public void eliminarProducto(Producto prod) {
		productosRegistrados.remove(prod);
	}
	
	public void registrarPago(Factura factura) {
		dineroEnCaja = dineroEnCaja + factura.getPrecio();
	}
	
	public double getDineroEnCaja() {
		return dineroEnCaja;
	}
	
	public void setDineroEnCaja(double cantidad) {
		dineroEnCaja = cantidad;
	}
}