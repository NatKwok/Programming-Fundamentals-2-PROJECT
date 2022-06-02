package UAV;

import Airplane.Airplane;
import Airplane.Main;

public class UAV implements Main{

	public int length;
	protected double weight;
	protected double price;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
	return "UAV [weight=" + weight + "lbs, price= $" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		
		//Attribute Comparison
		UAV other = (UAV) obj;
		
		if (weight != other.weight) {
			
			return false;
		}
		
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			
			return false;
		}
		
			return true;
		}


	//Default constructor
	public UAV () {
		System.out.println("This is a default constructor");		
			
	}
		
	//Parameter constructor
	public UAV (double weight, double price) {
		this.weight = weight;
		this.price= price;

	}	
	
	//Copy constructor
	public UAV (UAV u) {
		System.out.println("This is a copy constructor");
		weight = u.weight;
		price = u.price;
		
	}
}
