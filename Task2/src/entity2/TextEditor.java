package entity2;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {

	List<TextPair> listTextPair = new ArrayList<>();;

	public TextEditor() {

	}

	public void addToList(String text, int count) {

		listTextPair.add(new TextPair(text, count));

	}

	private class TextPair implements Comparable<TextPair>{

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
