package run;

import java.io.File;

import entity.Gift;
import entity.Sweet;

public class Run {

	public static void main(String[] args) {

		File file = new File("Task1\\resources\\gift.txt");
		Gift gift = new Gift();

		gift.addFromFile(file);

		// вывод сформированного подарка

		System.out.println("Подарок:");
		for (Sweet sw : gift.getCandies()) {
			System.out.println(sw);

		}

		// вывод веса подарка

		System.out.println("Вес подарка = " + gift.getWeight());

		// вывод отсортированного подарка по весу

		gift.sortByWeight();
		System.out.println("Подарок sorted:");
		for (Sweet sw : gift.getCandies()) {

			System.out.println(sw);

		}

		// данные для задания диапазона сахара

		int minSugar = 2;
		int maxSugar = 4;

		System.out.println("сахар в диапазоне [" + minSugar + "," + maxSugar + "]:");
		for (Sweet sw : gift.getSweetWithSugarBetweenValues(2, 4)) {
			System.out.println(sw);

		}

	}

}
