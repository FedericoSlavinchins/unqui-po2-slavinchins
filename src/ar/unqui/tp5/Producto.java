package ar.unqui.tp5;

public class Producto {
	
	private String nombre;
	public double precio;
	public int stock;
	
	public Producto(String _nombre, double _precio, int _stock) {
		nombre = _nombre;
		precio = _precio;
		this.setStock(_stock);
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getStockDisponible() {
		return stock;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setStock(int numero) {
		stock = numero;
	}
	
}
