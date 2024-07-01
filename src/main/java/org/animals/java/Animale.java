package org.animals.java;

public abstract class Animale {

	protected String name;
	protected int age;
	
	public Animale(String name) {
		this.name = name;
		this.age = (int)(Math.random() * 20);
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	/*
	 * MOSTRA A VIDEO L'ANIMALE CHE DORME
	 */
	public void dormi() {
		System.out.println("- L'ANIMALE STA DORMENDO ---> Zzz");
	}

	
	/*
	 * METODO CHE MOSTRA A VIDEO IL VERSO FATTO DALL'ANIMALE SPECIFICO
	 */
	public abstract void verso();
	
	
	/*
	 * METODO CHE MOSTRA A VIDEO QUELLO CHE MANGIA L'ANIMALE SPECIFICO
	 */
	public void mangia() {
		System.out.print("- L'ANIMALE MANGIA ---> ");
	}
}
