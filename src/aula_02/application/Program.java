package aula_02.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import aula_02.entities.Product;
import aula_02.services.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> productList = new ArrayList<>();

		String path = "D:\\Curso Java\\Material de Apoio\\Capítulo 19\\in.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(productList);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
