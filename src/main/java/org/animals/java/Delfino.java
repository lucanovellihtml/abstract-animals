package org.animals.java;

public class Delfino extends Animale{

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
}
