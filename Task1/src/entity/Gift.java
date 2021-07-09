package entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gift {

	private List<Sweet> candies = new ArrayList<>();

	public void add(Sweet sweet) {

		candies.add(sweet);
	}

	public int getWeight() {

		int weight = 0;
		for (Sweet sweet : candies) {

			weight = weight + sweet.getWeight();
		}

		return weight;
	}

	public void addFromFile(File f) {

		String[] s = null;

		String name; // название
		SweetType type; // тип сладости
		int weight; // вес
		int sugar; // количество сахара
		String feature; // особенность сладости
		int count; // количество сладостей данного вида

		try (BufferedReader reader = new BufferedReader(new FileReader(f))) {

			String line;

			while ((line = reader.readLine()) != null) {
				name = null;
				type = null;
				weight = 0;
				sugar = 0;
				feature = null;
				count = 0;

				System.out.println(line);

				s = line.trim().replaceAll(" +", " ").split(" ");

				try {
					name = s[0];
					type = SweetType.valueOf(s[1]);
					weight = Integer.parseInt(s[2]);
					sugar = Integer.parseInt(s[3]);
					feature = s[4];
					count = Integer.parseInt(s[5]);

				} catch (ArrayIndexOutOfBoundsException e) {

					System.out.println("ERROR. Не хватает данных ");
					System.out.println("пропускаем...");

					continue;

				} catch (NumberFormatException e) {

					System.out.println("ERROR. Неправильные данные ");
					System.out.println("пропускаем...");

					continue;
				} catch (Exception e) {

					System.out.println("ERROR. Нет такого типа конфет: " + s[1]);
					System.out.println("пропускаем...");

					continue;
				}

				for (int i = 0; i < count; i++) {

					candies.add((new SweetFactory()).getSweet(name, type, weight, sugar, feature));

				}

			}

		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}

	}

	//сортировка
	public void sortByWeight() {
		Collections.sort(candies);
	}

	//список конфет с содержанием сахара в заданном диапазоне
	public List<Sweet> getSweetWithSugarBetweenValues(int min, int max) {

		List<Sweet> returnSweet = new ArrayList<>();

		if (candies.isEmpty())
			return null;

		for (Sweet sweet : candies) {
			if ((sweet.getSugar() >= min) && (sweet.getSugar() <= max)) {
				returnSweet.add(sweet);
			}

		}
		return returnSweet;

	}

	public List<Sweet> getCandies() {
		return candies;
	}

	@Override
	public String toString() {

		return ("Gift :\n " + candies);
	}

}