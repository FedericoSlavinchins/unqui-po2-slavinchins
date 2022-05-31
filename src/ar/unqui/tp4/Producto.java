package ar.unqui.tp4;

public class Producto {
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;

	
	public Producto(String _nombre, double _precio, boolean _esPrecioCuidado) {
		nombre = _nombre;
		precio = _precio;
		esPrecioCuidado = _esPrecioCuidado;
	}
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public void aumentarPrecio(double porcentaje) {
		this.setPrecio(precio * porcentaje);
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setPrecio(double d) {
		this.precio = d;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
}
