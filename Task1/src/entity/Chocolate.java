package entity;

public class Chocolate extends Sweet {

	private String feature;

	public Chocolate(String name, int weight, int sugar, String color) {
		super(name, weight, sugar);

		this.feature = color;
	}

	public String getFeature() {
		return feature;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((feature == null) ? 0 : feature.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		if (feature == null) {
			if (other.feature != null)
				return false;
		} else if (!feature.equals(other.feature))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Шоколад [ Название: " + getName() + " ,особенность: " + getFeature() + " ,вес: " + getWeight()
				+ " ,сахар: " + getSugar() + "]";
	}

}
