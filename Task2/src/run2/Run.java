package run2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Run {

	public static void main(String[] args) {

		File file = new File("Task2\\resources\\inputFile.txt");
		StringBuilder text = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

			String line;

			while ((line = reader.readLine()) != null) {

				// System.out.println(line);

				text.append(line);

			}

		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println(text);

	}

}
