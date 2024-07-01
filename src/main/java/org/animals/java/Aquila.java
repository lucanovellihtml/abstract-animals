package org.animals.java;

public class Aquila extends Animale{

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
}
