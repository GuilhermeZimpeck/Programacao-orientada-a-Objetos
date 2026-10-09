package br.com.lojavirtual.main;
import br.com.lojavirtual.musical.*;

public class Principal {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		teclado.setNumSons(88);
		System.out.println(teclado.getNumSons());
	}
}
