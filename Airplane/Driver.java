package Airplane;

import Agri_MAV.AgriculturalDrone;
import Agri_MAV.MAV;
import Heli_Quad.Helicopter;
import Heli_Quad.Quadcopter;
import Multirotor.Multirotor;
import UAV.UAV;

public interface Driver {

	public static void main(String[] args) {
		
		//SET INFO
		Airplane a1 = new Airplane("Boeing", 143525.99, 400);
		Airplane a2 = new Airplane("Bell", 300000.99, 600);
		Helicopter h1 = new Helicopter(6, 1999, 6, "Bell", 300000.99, 600);
		Helicopter h2 = new Helicopter(7, 2010, 6, "AirDemo", 400000.99, 700);
		Quadcopter q1 = new Quadcopter(4,4,0,"Aeryon",299.99,20, 50);
		Quadcopter q2 = new Quadcopter(4,4,0,"MD",899.99,30, 70);
		Multirotor m1 = new Multirotor(7, 10, 6, "Harriet", 400000.99, 700, 4);
		Multirotor m2 = new Multirotor(7, 5, 8, "Harriet", 123453.99, 900, 6);
		AgriculturalDrone ad1 = new AgriculturalDrone(80,299.99,"Aeryon", 50);
		AgriculturalDrone ad2 = new AgriculturalDrone(90,999.99,"Aeryon", 70);
		MAV mav1 = new MAV(234,10000.89, 200000.99, "Olinsky", 758);
		MAV mav2 = new MAV(400,23453.89, 45275.99, "Nonasky", 939);
		UAV uav1 = new UAV(60, 899.99);
		UAV uav2 = new UAV(60, 899.99);
		UAV uav3 = new UAV(100, 1299.99);
		
		//DISPLAY INFO toString()
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
		System.out.println(uav3.toString());
		System.out.println();

		//DISPLAY INFO equals()
		System.out.println(a1.equals(q2));
		System.out.println(h1.equals(h2));
		System.out.println(uav1.equals(uav2));
		System.out.println();

		//CREATE ARRAYS
		Driver arr1[] = new Driver[15];
		
		arr1[0] = new Airplane("Boeing", 143525.99, 400);
		arr1[1]  = new Airplane("Bell", 300000.99, 600);
		arr1[2]  = new Helicopter(6, 1999, 6, "Bell", 300000.99, 600);
		arr1[3]  = new Helicopter(7, 2010, 6, "AirDemo", 400000.99, 700);
		arr1[4]  = new Quadcopter(4,4,0,"Aeryon",299.99,20, 50);
		arr1[5]  = new Quadcopter(4,4,0,"MD",899.99,30, 70);
		arr1[6]  = new Multirotor(7, 10, 6, "Harriet", 400000.99, 700, 4);
		arr1[7]  = new Multirotor(7, 5, 8, "Harriet", 123453.99, 900, 6);
		arr1[8]  = new AgriculturalDrone(80,299.99,"Aeryon", 50);
		arr1[9]  = new AgriculturalDrone(90,999.99,"Aeryon", 70);
		arr1[10]  = new MAV(234,10000.89, 200000.99, "Olinsky", 758);
		arr1[11]  = new MAV(400,23453.89, 45275.99, "Nonasky", 939);
		arr1[12]  = new UAV(60, 899.99);
		arr1[13]  = new UAV(60, 899.99);
		arr1[14]  = new UAV(100, 1299.99);
		

		
		Driver arr2[] = new Driver[15];
		
		arr2[0] = new Airplane("Harrison", 294647.99, 765);
		arr2[1]  = new Airplane("Bullet", 39452.99, 321);
		arr2[2]  = new Helicopter(6, 1999, 6, "Bell", 300000.99, 600);
		arr2[3]  = new Helicopter(7, 2010, 6, "AirDemo", 400000.99, 700);
		arr2[4]  = new Quadcopter(4,4,0,"Aeryon",299.99,20, 50);
		arr2[5]  = new Quadcopter(4,4,0,"MD",899.99,30, 70);
		arr2[6]  = new Multirotor(7, 10, 6, "Harriet", 400000.99, 700, 4);
		arr2[7]  = new Multirotor(7, 5, 8, "Harriet", 123453.99, 900, 6);
		arr2[8]  = new AgriculturalDrone(80,299.99,"Aeryon", 50);
		arr2[9]  = new AgriculturalDrone(90,999.99,"Aeryon", 70);
		arr2[10]  = new MAV(234,10000.89, 200000.99, "Olinsky", 758);
		arr2[11]  = new MAV(400,23453.89, 45275.99, "Nonasky", 939);
		arr2[12] = new Helicopter(6, 1999, 6, "Bell", 300000.99, 600);
		arr2[13] =  new Quadcopter(4,4,0,"Aeryon",299.99,20, 50);
		arr2[14] = new Multirotor(7, 10, 6, "Harriet", 400000.99, 700, 4);
		
		
		
	}
	


	public static Driver findLeastAndMostExpensiveUAV(Driver[] arr, int total) {
		
		Driver temp;
		int size;
		size = arr.length;
		for (int i = 0; i < size; i++) {  
			
		        for (int j = i + 1; j < size; j++) {  
		        	
		                if (arr[i] == arr[j]) {  
		                	
		                    temp = arr[i];  
		                    arr[i] = arr[j];  
		                    arr[j] = temp;  
		                }  
		            }  
		        }  
		return arr[total-1];  
		
	}



	


}
