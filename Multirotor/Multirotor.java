package Multirotor;

import Heli_Quad.Helicopter;

public class Multirotor extends Helicopter{

	int NumofRotors;

	public int getNumofRotors() {
		return NumofRotors;
	}

	public void setNumofRotors(int numofRotors) {
		NumofRotors = numofRotors;
	}
	
	@Override
	public String toString() {
		return "This Multirotor is manufactured by " + brand + ". It costs $" 
				+ price + " and has " + horsepower + " hp.  %nIt has " + NumofCyl + " cylinders and " + NumofRotors + " rotors.";
	}
	
	//Default constructor
	public Multirotor () {
		System.out.println("This is a default constructor");		
			
	}
		
	//Parameter constructor
	public Multirotor (int NumofCyl, int CreationYear, int PassCapacity, String brand, Double price, int horsepower, int NumofRotors) {
		super(CreationYear, PassCapacity, NumofCyl, brand, price, NumofRotors);
		this.brand = brand;
		this.price= price;
		this.horsepower = horsepower;
		this.NumofRotors = NumofRotors;
	}	
	
	//Copy constructor
	public Multirotor (Multirotor m) {
		System.out.println("This is a copy constructor");
		NumofCyl = m.NumofCyl;
		CreationYear = m.CreationYear;
		PassCapacity = m.PassCapacity;
		brand = m.brand;
		price= m.price;
		horsepower = m.horsepower;
		NumofRotors = m.NumofRotors;
		
	}
}
