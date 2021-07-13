package by.task1.entity;

public class Lollipop extends Sweet {

	private LollipopFeature feature;

	public Lollipop(String name, int weight, int sugar, LollipopFeature feature) {
		super(name, weight, sugar);
		this.feature = feature;
	}

	public LollipopFeature getFeature() {
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
		Lollipop other = (Lollipop) obj;
		if (feature == null) {
			if (other.feature != null)
				return false;
		} else if (!feature.equals(other.feature))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Леденец [ Название: %10s ,особенность: %9s ,вес: %2d ,сахар: %2d ", getName(),
				getFeature().toString(), getWeight(), getSugar());
	}

}
