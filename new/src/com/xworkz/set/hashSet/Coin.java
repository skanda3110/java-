package com.xworkz.set.hashSet;

public class Coin {
	int value;
	double diameter;
	String material;
	public Coin(int value, double diameter, String material) {
		
		this.value = value;
		this.diameter = diameter;
		this.material = material;
	}
	@Override
	public String toString() {
		return "Coin [value=" + value + ", diameter=" + diameter + ", material=" + material + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(diameter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + value;
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
		Coin other = (Coin) obj;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	

}
