package Agri_MAV;

import UAV.UAV;

public class AgriculturalDrone extends UAV{
	
	String brand;
	int carry_Capacity;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCarry_Capacity() {
		return carry_Capacity;
	}
	public void setCarry_Capacity(int carry_Capacity) {
		this.carry_Capacity = carry_Capacity;
	}
	
	@Override
	public String toString() {
	return "This AgriculturalDrone is manufactured by " + brand + " it weights " + super.getWeight() 
		+ " pounds and costs $"+ super.getPrice() +
		". It can carry upto " + carry_Capacity + " lbs.";
	}

	//Default constructor
	public AgriculturalDrone () {
		System.out.println("This is a default constructor");		
			
	}
		
	//Parameter constructor
	public AgriculturalDrone (double weight, double price, String brand, int carry_Capacity) {
		super(weight, price);
		this.brand = brand;
		this.carry_Capacity = carry_Capacity;

	}	
	
	//Copy constructor
	public AgriculturalDrone (AgriculturalDrone ad) {
		System.out.println("This is a copy constructor");
		weight = ad.weight;
		price = ad.price;
		brand = ad.brand;
		carry_Capacity = ad.carry_Capacity;
		
	}
}
