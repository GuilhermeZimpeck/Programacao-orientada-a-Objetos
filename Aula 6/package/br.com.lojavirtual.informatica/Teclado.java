package br.com.lojavirtual.informatica;

public class Teclado {
	private int numTeclas;
	private boolean usb;

	public boolean isUSB() {
		return usb;
	}

	public void setUSB(boolean usb) {
		this.usb = usb;
	}

	public int getNumTeclas() {
		return numTeclas;
	}

	public void setNumTeclas(int numTeclas) {
		this.numTeclas = numTeclas;
	}
}
