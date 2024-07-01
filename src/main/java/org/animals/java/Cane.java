package org.animals.java;

public class Cane extends Animale{

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
	
}
