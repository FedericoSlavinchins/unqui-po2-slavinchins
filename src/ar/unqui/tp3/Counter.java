package ar.unqui.tp3;

import java.util.ArrayList;
import java.util.List;

class Counter {
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public int contarPares() {
		int cantidad = 0;
		for (Integer numero : this.getNumeros()) {
			if (numero % 2 == 0) cantidad++;
		}
		return cantidad;
	}
	
	private List<Integer> getNumeros() {
		return numeros;
	}
	
	public void addNumber(int i) {
		this.getNumeros().add(i);
	}
	
	
	public int contarImpares() {
		int cantidad = 0;
		for (Integer numero : this.getNumeros()) {
			if (numero % 2 != 0) cantidad++;
		}
		return cantidad;
	}
	
	public int contarMultiplos(int i) {
		int cantidad = 0;
		for (Integer numero : this.getNumeros()) {
			if (numero % i == 0) cantidad++;
		}
		return cantidad;
	}
}
