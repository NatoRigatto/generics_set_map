package aula_05.application;

import aula_05.entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Renato", "renato@gmail.com");
		Client c2 = new Client("Renato", "renato@gmail.com");
		String s1 = "Xablau";
		String s2 = "Xablau";
		
		System.out.println("Comparação de objetos em hashCode:");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println();
		System.out.println("Comparação de objetos em Equals:");
		System.out.println(c1.equals(c2));
		System.out.println();
		System.out.println("Comparação de objetos em ==:");
		System.out.println(c1 == c2);
		System.out.println();
		System.out.println("Comparação de tipos primitivos em ==:");
		System.out.println(s1 == s2);
		
		
	}

}
