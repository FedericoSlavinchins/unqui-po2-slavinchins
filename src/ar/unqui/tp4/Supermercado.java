package ar.unqui.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String _nombre, String _direccion) {
		nombre = _nombre;
		direccion = _direccion;
	}

	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0d;
		for (Producto producto : productos) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		return precioTotal;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
}