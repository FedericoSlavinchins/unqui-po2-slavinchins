package ar.unqui.tp6.Banco;

public class Inmueble {
	
	
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public Inmueble(String _descripcion, String _direccion, double _valorFiscal) {
		descripcion = _descripcion;
		direccion 	= _direccion;
		valorFiscal	= _valorFiscal;
	}
	
	public double getValorFiscal() {
		return valorFiscal;
	}
	
}
