package aula_07.application;

import java.util.HashSet;
import java.util.Set;

import aula_07.entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> sp = new HashSet<>();
		sp.add(new Product("TV", 900.0));
		sp.add(new Product("Notebook", 1200.0));
		sp.add(new Product("Tablet", 400.0));

		Product prod = new Product("Notebook", 1200.00);

		// Faz a verificação se na lista de Produtos criada pelo HashSet contém um
		// Produto igual ao que foi criada fora da lista. No caso deu true porque na
		// classe Product foi implementado o hashCode e o Equals
		System.out.println(sp.contains(prod));
	}

}
