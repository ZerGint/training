package entity2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextEditor {

	List<TextPair> listTextPair = new ArrayList<>();;

	// формирование отсортированного текста по кол-во слов в предложениях

	public String sortedOutput(String text) {

		StringBuilder outputText = new StringBuilder();
		insertPairs(splitText(text.replaceAll("\\s+", " ")));
		Collections.sort(listTextPair);
		
		for (TextPair pair : listTextPair) {
			outputText.append(pair.text + " ");
		}

		return outputText.toString();
	}

	// подсчет слов в предложении и заполнение пар: предложение и кол-во слов

	private void insertPairs(List<String> list) {
		int count;
		for (int i = 0; i < list.size(); i++) {
			count = list.get(i).split(" ").length;

			listTextPair.add(new TextPair(list.get(i), count));

		}

	}

	// получение списка предложений из текста

	private List<String> splitText(String text) {
		List<String> sentences = new ArrayList<>();
		StringBuilder words = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			if ((text.charAt(i) == '.') || (text.charAt(i) == '!') || (text.charAt(i) == '?')) {
				words.append(text.charAt(i));
				sentences.add(words.toString().trim());
				words = new StringBuilder();
			} else {
				words.append(text.charAt(i));
			}
		}

		return sentences;
	}

	// класс для пар: предложение и кол-во слов

	private class TextPair implements Comparable<TextPair> {

		String text;
		int count;

		private TextPair(String text, int count) {
			this.text = text;
			this.count = count;

		}

		public int compareTo(TextPair textPair) {

			return (this.count - textPair.count);
		}

	}

}
