package ar.unqui.tp5;

public class Cooperativa extends Producto {
	
	public Cooperativa(String _nombre, double _precio, int _stock) {
		super(_nombre, _precio, _stock);
		// TODO Auto-generated constructor stub
	}

	public double getPrecio() {
		return precio * 0.9d;
	}
	
}
