package aula_06_01.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		// HashSet é o mais rápido, porém não ordena

		System.out.println("----- Testando o HashSet -----");

		Set<String> hs = new HashSet<>();

		hs.add("Televisão");
		hs.add("Notebook");
		hs.add("Tablet");

		System.out.println("Existe algum elemento com o valor Televisão?");
		System.out.println(hs.contains("Televisão"));
		System.out.println();

		// Remove todos elementos que começam com a letra T
		hs.removeIf(x -> x.charAt(0) == 'T');

		System.out.println("Segue abaixo a lista de elementos:");
		for (String s : hs) {
			System.out.println(s);
		}

		System.out.println();

		// TreeSet é mais lento, porém ordena
		System.out.println("----- Testando o TreeSet -----");

		Set<String> ts = new TreeSet<>();

		ts.add("Televisão");
		ts.add("Notebook");
		ts.add("Tablet");

		System.out.println("Segue abaixo a lista de elementos:");
		for (String s : ts) {
			System.out.println(s);
		}

		System.out.println();

		// LinkedHasSet possui uma velocidade intermediária de execução e ordena
		// conforme for implementado no código
		System.out.println("----- Testando o LinkedHashSet -----");

		Set<String> ls = new LinkedHashSet<>();

		ls.add("Televisão");
		ls.add("Notebook");
		ls.add("Tablet");

		System.out.println("Segue abaixo a lista de elementos:");
		for (String s : ls) {
			System.out.println(s);
		}

	}

}
