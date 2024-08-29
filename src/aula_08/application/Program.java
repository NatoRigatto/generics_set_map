package aula_08.application;

import java.util.Set;
import java.util.TreeSet;

import aula_08.entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> s = new TreeSet<>();
		s.add(new Product("TV", 900.0));
		s.add(new Product("Notebook", 1200.0));
		s.add(new Product("Tablet", 400.0));

		Product p = new Product("Notebook", 1200.0);

		// Verifica na lista TreeSet de Produtos se contém um Produto igual ao Produto
		// criado fora da Lista TreeSet. Só é possível fazer a comparação com o TreeSet
		// se na classe Product tiver implementar a interface Comparable.
		System.out.println(s.contains(p));

	}

}
