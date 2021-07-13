package by.task1.entity;

public class SweetFactory {

	public Sweet getSweet(String name, SweetType type, int weight, int sugar, String feature) {

		Sweet sweet = null;

		switch (type) {
		case CHOCOLATE:
			sweet = new Chocolate(name, weight, sugar, ChocolateFeature.valueOf(feature));
			break;
		case CANDY:

			sweet = new Candy(name, weight, sugar, CandyFeature.valueOf(feature));
			break;
		case LOLLIPOP:
			sweet = new Lollipop(name, weight, sugar, LollipopFeature.valueOf(feature));
			break;
		default:
			System.out.println(" Error. Wrong Type");
			break;
		}

		return sweet;
	}

}
