package ar.unqui.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();
		counter.addNumber(1);
		counter.addNumber(2);
		counter.addNumber(4);
		counter.addNumber(28);
		counter.addNumber(127);
		counter.addNumber(548);
		counter.addNumber(9);
	}

	@Test
	public void testContarPares() {
		assertEquals(counter.contarPares(), 4);
	}
	
	@Test
	public void testContarImpares() {
		assertEquals(counter.contarImpares(), 3);
	}
	
	@Test
	public void testContarMultiplos() {
		assertEquals(counter.contarMultiplos(3), 1);
	}

}
