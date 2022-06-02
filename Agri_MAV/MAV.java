package Agri_MAV;

import UAV.UAV;

public class MAV extends UAV{

	String model;
	double size;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	//Default constructor
	public MAV () {
		System.out.println("This is a default constructor");		
			
	}
		
	//Parameter constructor
	public MAV (int length, double weight, double price, String model, double size) {
		super(length, weight);
		this.model = model;
		this.size = size;

	}	
	
	//Copy constructor
	public MAV (MAV m) {
		System.out.println("This is a copy constructor");
		length = m.length;
		weight = m.weight;
		price = m.price;
		model = m.model;
		size = m.size;
		
	}
}
