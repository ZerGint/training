package entity;

public class Candy extends Sweet {

	private String feature;

	public Candy(String name, int weight, int sugar, String filling) {
		super(name, weight, sugar);

		this.feature = filling;

	}

	public String getFeature() {
		return feature;
	}

	@Override
	public String toString() {
		return "Конфета [ Название: " + getName() + " ,особенность: " + getFeature() + " ,вес: " + getWeight()
				+ " ,сахар: " + getSugar() + "]";
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
		Candy other = (Candy) obj;
		if (feature == null) {
			if (other.feature != null)
				return false;
		} else if (!feature.equals(other.feature))
			return false;
		return true;
	}

}
