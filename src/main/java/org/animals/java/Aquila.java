package org.animals.java;

public class Aquila extends Animale implements Fly{

	public Aquila(String name) {
		super(name);
	}
	
	@Override
	public void verso() {
		System.out.println("- VERSO ANIMALE ---> STRIDO");
	}
	
	@Override
	public void mangia() {
		super.mangia(); 
		System.out.print("INSETTI, CARNE \n");
	}
	
	/*
	 * METODO INTERFACCIA "Fly" CHE MOSTRA A VIDEO IL MOVIMENTO DELL'ANIMALE; 
	 */
	@Override
	public void vola() {
		System.out.println("- MOVIMENTO ANIMALE ---> sto volando!!!");
	}
}
