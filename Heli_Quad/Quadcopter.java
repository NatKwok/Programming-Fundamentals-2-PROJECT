package Heli_Quad;

public class Quadcopter extends Helicopter{
	
	int maxspeed;
	
	
	
	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	@Override
	public String toString() {
		return "This Quadcopter is manufactured by " + brand + ". It costs $" 
				+ price + " and has " + horsepower + " hp.  %nIt has " + NumofCyl + " cylinders.";
	}

	//Default constructor
	public Quadcopter () {
		System.out.println("This is a default constructor");		
			
	}
		
	//Parameter constructor
	public Quadcopter (int NumofCyl, int CreationYear, int PassCapacity, String brand, Double price, int horsepower, int maxspeed) {
		super(CreationYear, NumofCyl, PassCapacity, brand, price, maxspeed);
		this.brand = brand;
		this.price= price;
		this.horsepower = horsepower;
		this.maxspeed = maxspeed;
	}	
	
	//Copy constructor
	public Quadcopter (Quadcopter q) {
		System.out.println("This is a copy constructor");
		NumofCyl = q.NumofCyl;
		CreationYear = q.CreationYear;
		PassCapacity = q.PassCapacity;
		brand = q.brand;
		price= q.price;
		horsepower = q.horsepower;
		maxspeed = q.maxspeed;
		
	}

}
