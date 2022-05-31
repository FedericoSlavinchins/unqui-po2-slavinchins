package ar.unqui.tp7;

import java.util.ArrayList;

public class PokerStatus {
	
	private ArrayList<String> listaDeCartas;
	private ArrayList<String> numeroDeCartas;
	private int cantidadDeCartasIguales = 0;
	private Set setCartas;

	public Boolean verificar(String string, String _string2, String _string3, String _string4, String _string5) {
		listaDeCartas.add(string);
		listaDeCartas.add(_string2);
		listaDeCartas.add(_string3);
		listaDeCartas.add(_string4);
		listaDeCartas.add(_string5);
		
		for (String carta : listaDeCartas) {
			numeroDeCartas.add(carta.charAt(0));
		}
		
	
		
		return ;
	}

}
