package run2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import entity2.TextEditor;

public class Run {

	public static void main(String[] args) {

		File file = new File("Task2\\resources\\inputFile.txt");
		StringBuilder text = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

			String line;
			while ((line = reader.readLine()) != null) {
				text.append(line);
			}

		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}

		TextEditor textEditor = new TextEditor();
		String inputText = text.toString();

		System.out.println(inputText);

		System.out.println();

		System.out.println(textEditor.sortedOutputByCountWords(inputText));

	}

}
