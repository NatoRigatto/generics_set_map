package exercicio_02.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import exercicio_02.entities.Candidate;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<Candidate, Integer> votes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");

				String name = fields[0];
				Integer voteQuantity = Integer.parseInt(fields[1]);

				Candidate c = new Candidate(name, voteQuantity);

				if (votes.containsKey(c)) {
					Integer voteSoFar = votes.get(c);
					votes.put(c, voteSoFar + voteQuantity);

				} else {
					votes.put(c, voteQuantity);

				}

				line = br.readLine();
			}

			for (Candidate key : votes.keySet()) {
				System.out.println(key.getName() + ": " + votes.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}