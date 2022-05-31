package ar.unqui.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Producto galletas;
	private Cooperativa arroz;
	private Caja caja;
	private Factura factura;
	
	@BeforeEach
	public void setUp() {
		galletas = new Producto("Galletas", 180d, 400);
		arroz	 = new Cooperativa("Arroz", 100d, 500);
		caja = new Caja();
		caja.setDineroEnCaja(0d);
		factura = new Factura(5d, 300, 200d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Galletas", galletas.getNombre());
		assertEquals(galletas.getPrecio(), 180d);
		assertEquals(galletas.getStockDisponible(), 400);
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(arroz.getPrecio(), 90d);
		assertEquals(arroz.getStockDisponible(), 500);
	}
	
	@Test
	public void testCaja() {
		caja.registrarProducto(galletas);
		caja.registrarProducto(arroz);
		assertEquals(caja.getTotalAPagar(), 270d);
		assertEquals(galletas.getStockDisponible(), 399);
	}
	
	@Test
	public void testFactura() {
		caja.registrarPago(factura);
		assertEquals(caja.getDineroEnCaja(), 1700d);
	}

}
