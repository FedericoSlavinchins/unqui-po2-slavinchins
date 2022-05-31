package ar.unqui.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
		arroz = new ProductoPrimeraNecesidad("Arroz", 5d, false, 20);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(/*new Double(7.2),*/ leche.getPrecio(), 7,2d);
		assertEquals(arroz.getPrecio(), 4,5d);
	}
}
