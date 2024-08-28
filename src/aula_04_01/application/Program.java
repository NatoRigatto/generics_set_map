package aula_04_01.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import aula_04_01.entities.Circle;
import aula_04_01.entities.Rectangle;
import aula_04_01.entities.Shape;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));

	}

	// ? extends Shape = Uma lista do tipo Shape e todos os subtipos de Shape, no
	// caso Circle e Rectangle
	public static double totalArea(List<? extends Shape> list) {

		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
