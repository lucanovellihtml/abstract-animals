package org.animals.java;

public class Main {

	public static void main(String[] args) {
		
		Cane dog = new Cane("Pallina");
		Aquila eagle = new Aquila("Aquila Reale");
		Delfino dolphin = new Delfino("Delfino curioso");
		Passerotto bird = new Passerotto("Uccellino");
		
		System.out.println("------- CANE -------");
		System.out.println("- NOME ANIMALE ---> " + dog.getName());
		System.out.println("- ETA' ANIMALE ---> " + dog.getAge());
		dog.verso();
		dog.mangia();
		System.out.println("------------------------------------");
		
		System.out.println("------- DELFINO -------");
		System.out.println("- NOME ANIMALE ---> " + dolphin.getName());
		System.out.println("- ETA' ANIMALE ---> " + dolphin.getAge());
		dolphin.verso();
		dolphin.mangia();
		System.out.print("------------------------------------");
	}

}
