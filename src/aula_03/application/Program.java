package aula_03.application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
	}
	
	// Coleção do tipo Curinga
	// Obs: Não é possível adicionar dados a uma coleção do tipo curinga, por exemplo: list.add(3)
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}