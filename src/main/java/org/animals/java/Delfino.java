package org.animals.java;

public class Delfino extends Animale implements Swim{

	public Delfino(String name) {
		super(name);
	}
	
	
	@Override
	public void verso() {
		System.out.println("- VERSO ANIMALE ---> FRIGGE");
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
