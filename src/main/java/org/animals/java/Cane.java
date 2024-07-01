package org.animals.java;

public class Cane extends Animale implements Swim{

	public Cane(String name) {
		super(name);
	}
	
	@Override
	public void verso() {
		System.out.println("- VERSO ANIMALE ---> ABBAIA");
	}
	
	@Override
	public void mangia() {
		super.mangia(); 
		System.out.print("CARNE \n");
	}

	
	/*
	 * METODO INTERFACCIA "Swim" CHE MOSTRA A VIDEO IL MOVIMENTO DELL'ANIMALE; 
	 */

	@Override
	public void nuota() {
		System.out.println("- MOVIMENTO ANIMALE ---> sto nuotando!!!");
	}
	
	
	
}
