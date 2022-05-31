package ar.unqui.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	private int descuento;
	
	public ProductoPrimeraNecesidad(String _nombre, double _precio, boolean _esPrecioCuidado, int _descuento) {
		super(_nombre, _precio, _esPrecioCuidado);
		descuento = _descuento;
		// TODO Auto-generated constructor stub
	}

	public double aplicarDescuento() {
		return this.getPrecio() * (1 - (descuento/100));
	}
	
}
