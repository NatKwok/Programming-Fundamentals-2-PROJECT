package Airplane;

public class Airplane implements Driver{
	
	 protected String brand;
	 protected double price;
	 protected int horsepower;
	 
	 public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	@Override
	public String toString() {
	return "This Airplane is manufactured by " + brand + " and costs $"+ price + 
	". It has horse power " + horsepower ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		
		//Attribute Comparison
		Airplane other = (Airplane) obj;
		
		if (brand == null) {
			
			if (other.brand != null) {
				return false;
			}
			
		} else if (!brand.equals(other.brand)) {
		
			return false;
		}
		
		if (horsepower != other.horsepower) {
			
			return false;
		}
		
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			
			return false;
		}
		
			return true;
		}
	

	 
		//Default constructor
		public Airplane () {
			System.out.println("This is a default constructor");		
				
		}
			
		//Parameter constructor
		public Airplane (String brand, Double price, int horsepower) {
			this.brand = brand;
			this.price= price;
			this.horsepower = horsepower;
		}	
		
		//Copy constructor
		public Airplane (Airplane a) {
			System.out.println("This is a copy constructor");
			brand = a.brand;
			price = a.price;
			horsepower = a.horsepower;
			
		}

}
