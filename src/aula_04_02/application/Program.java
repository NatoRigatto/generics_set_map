package aula_04_02.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myIntegers = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.41, 6.28);
		List<Object> myObjects = new ArrayList<Object>();
		
		// Adiciona a lista do tipo Integer para a lista do tipo Object
		copy(myIntegers, myObjects);
		printList(myObjects);
		// Adiciona a lista do tipo Double para a lista do tipo Object
		copy(myDoubles, myObjects);
		printList(myObjects);
		
	}
	
	// <? extends Number>
	// List do tipo Number e todos seus subtipos
	
	// <? super Number>
	// Lista do tipo Number e todos seus supertipos
	public static void copy(List<? extends Number> sourceList, List<? super Number> targetList) {
		for(Number n : sourceList) {
			targetList.add(n);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list){
			System.out.print(obj + " ");
		}
		System.out.println();
		
	}
	
}
