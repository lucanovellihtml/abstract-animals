package org.animals.java;

public class Passerotto extends Animale{

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
}
