package org.animals.java;

public class Utility {

	
	/*
	 * METODI CHE PRENDONO COME PARAMETRO UN ANIMALE CHE PUO' VOLARE O NUOTARE;
	 * RICHIAMANO IL CORRISPONDETE METODO "vola" o "nuota";
	 */

	public static void faiVolare(Fly animals) {
		animals.vola();
	}
	
	public static void faiNuotare(Swim animals) {
		animals.nuota();
	}
	
}
