package ar.unqui.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	private PokerStatus pokerStatus;
	
	
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();
	}

	
	
	@Test
	public void esPokerCuandoHay4NrosIgualesY1Diferente() {
		assertTrue(pokerStatus.verificar("1P", "1C", "1D", "1T", "5D"));
	}
	
	@Test
	public void esPokerCuandoHay1DiferenteY4NrosIguales() {
		assertTrue(pokerStatus.verificar("5D", "1P", "1C", "1D", "1T"));
	}
	
	@Test
	public void esPokerCuandoHay4IgualesPeroNoSeguidos() {
		assertTrue(pokerStatus.verificar("1P", "5D", "1C", "1D", "1T"));
	}
	
}
