package ar.unqui.tp5;

public class Factura {
	
	private double costoPorUnidad;
	private int unidadesConsumidas;
	private double impuesto;
	
	public Factura(double _costoPorUnidad, int _unidadesConsumidas, double _impuesto) {
		costoPorUnidad		= _costoPorUnidad;
		unidadesConsumidas	= _unidadesConsumidas;
		impuesto			= _impuesto;
	}
	
	
	public double getPrecio() {
		return ((costoPorUnidad * unidadesConsumidas) + impuesto);
	}
	
}
