package entity;

public class SweetFactory {

	public Sweet getSweet(String name, SweetType type, int weight, int sugar, String feature) {

		Sweet sweet = null;
		switch (type) {
		case CHOCOLATE:
			sweet = new Chocolate(name, weight, sugar, feature);
			break;
		case CANDY:
			sweet = new Candy(name, weight, sugar, feature);
			break;
		case LOLLIPOP:
			sweet = new Lollipop(name, weight, sugar, feature);
			break;
		default:
			System.out.println(" Error. Wrong Type");
			break;
		}
		// System.out.println(sweet+"ddd");
		return sweet;
	}

}
