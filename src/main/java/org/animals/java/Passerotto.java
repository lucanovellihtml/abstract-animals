package org.animals.java;

public class Passerotto extends Animale implements Fly{

	public Passerotto(String name) {
		super(name);
	}
	
	
	@Override
	public void verso() {
		System.out.println("- VERSO ANIMALE ---> CINGUETTA");
	}
	
	
	@Override
	public void mangia() {
		super.mangia(); 
		System.out.print("INSETTI \n");
	}

	
	/*
	 * METODO INTERFACCIA "Fly" CHE MOSTRA A VIDEO IL MOVIMENTO DELL'ANIMALE; 
	 */
	@Override
	public void vola() {
		System.out.println("- MOVIMENTO ANIMALE ---> sto volando!!!");
	}
}
