package Heli_Quad;

import Airplane.Airplane;

public class Helicopter  extends Airplane{
	
	public int NumofCyl;
	public int CreationYear;
	public int PassCapacity;
	
	
	
	public int getNumofCyl() {
		return NumofCyl;
	}

	public void setNumofCyl(int numofCyl) {
		NumofCyl = numofCyl;
	}

	public int getCreationYear() {
		return CreationYear;
	}

	public void setCreationYear(int creationYear) {
		CreationYear = creationYear;
	}

	public int getPassCapacity() {
		return PassCapacity;
	}

	public void setPassCapacity(int passCapacity) {
		PassCapacity = passCapacity;
	}
	
	@Override
	public String toString() {
	return "HeliCopter [noOfCylinders=" + NumofCyl + ", creationYear=" + CreationYear + ", passengerCapacity="
	+ PassCapacity + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
	//Attribute Comparison
	Helicopter other = (Helicopter) obj;
		
	if (CreationYear != other.CreationYear) {
			return false;
	}
		
	if (NumofCyl != other.NumofCyl) {
		
		return false;
	}
	
	if (PassCapacity != other.PassCapacity) {
		return false;
	}
	
	return true;
	}

	//Default constructor
	public Helicopter () {
		System.out.println("This is a default constructor");		
			
	}
		
	//Parameter constructor
	public Helicopter (int NumofCyl, int CreationYear, int PassCapacity, String brand, Double price, int horsepower) {
		super(brand,price, horsepower);
		this.NumofCyl = NumofCyl;
		this.CreationYear = CreationYear;
		this.PassCapacity = PassCapacity;
	}	
	
	//Copy constructor
	public Helicopter (Helicopter h) {
		System.out.println("This is a copy constructor");
		NumofCyl = h.NumofCyl;
		CreationYear = h.CreationYear;
		PassCapacity = h.PassCapacity;
		brand = h.brand;
		price = h.price;
		horsepower = h.horsepower;
		
	}

}
