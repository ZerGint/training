package entity;

public abstract class Sweet implements Comparable<Sweet> {
	private String name;
	private int weight;
	private int sugar;

	public Sweet(String name, int weight, int sugar) {

		this.name = name;
		this.weight = weight;
		this.sugar = sugar;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getSugar() {
		return sugar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sugar;
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweet other = (Sweet) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sugar != other.sugar)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	public int compareTo(Sweet sweet) {

		return (this.weight - sweet.weight);
	}

}
