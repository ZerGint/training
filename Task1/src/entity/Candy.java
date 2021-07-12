package entity;

public class Candy extends Sweet {

	private CandyFeature feature;

	public Candy(String name, int weight, int sugar, CandyFeature feature) {
		super(name, weight, sugar);

		this.feature = feature;

	}

	public CandyFeature getFeature() {
		return feature;
	}

	@Override
	public String toString() {
		return String.format("Конфета [ Название: %10s ,особенность: %9s ,вес: %2d ,сахар: %2d ", getName(),
				getFeature().toString(), getWeight(), getSugar());
		// return "Конфета [ Название: " + getName() + " ,особенность: " +
		// getFeature().toString() + " ,вес: " + getWeight()
		// + " ,сахар: " + getSugar() + "]";
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
