package Airplane;

import Agri_MAV.AgriculturalDrone;
import Agri_MAV.MAV;
import Heli_Quad.Helicopter;
import Heli_Quad.Quadcopter;
import Multirotor.Multirotor;
import UAV.UAV;

public interface Main {

	public static void main(String[] args) {
		
		//SET INFO
		Airplane a1 = new Airplane("Boeing", 143525.99, 400);
		Airplane a2 = new Airplane("Bell", 300000.99, 600);
		Helicopter h1 = new Helicopter(6, 1999, 6, "Bell", 300000.99, 600);
		Helicopter h2 = new Helicopter(7, 2001, 6, "AirDemo", 400000.99, 700);
		Quadcopter q1 = new Quadcopter(4,2018,0,"Aeryon",299.99,20, 50);
		Quadcopter q2 = new Quadcopter(4,2016,0,"MD",899.99,30, 70);
		Multirotor m1 = new Multirotor(7, 2001, 6, "Harriet", 400000.99, 700, 4);
		Multirotor m2 = new Multirotor(7, 2010, 8, "Harriet", 123453.99, 900, 6);
		AgriculturalDrone ad1 = new AgriculturalDrone(80,299.99,"Aeryon", 50);
		AgriculturalDrone ad2 = new AgriculturalDrone(90,999.99,"Aeryon", 70);
		MAV mav1 = new MAV(234,10000.89, 200000.99, "Olinsky", 758);
		MAV mav2 = new MAV(400,23453.89, 45275.99, "Nonasky", 939);
		UAV uav1 = new UAV(50, 499.99);
		UAV uav2 = new UAV(60, 899.99);
		
		//DISPLAY INFO
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(q1.toString());
		System.out.println(q2.toString());
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(ad1.toString());
		System.out.println(ad2.toString());
		System.out.println(mav1.toString());
		System.out.println(mav2.toString());
		System.out.println(uav1.toString());
		System.out.println(uav2.toString());

		

		
		

	}


	


}
