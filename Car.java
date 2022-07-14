package com;
//dynamic binding of polymorphism

   public class Car {  //superclass
	void run() {  //method of superclass
		System.out.println("The car name is BMW");
	}
 }
	class Suzuki extends Car { //subclass of Car
		void run() {  //method of subclass
		System.out.println("The car name is Scorpio");	
		}
	public static void main(String args[])  {
		Suzuki obj = new Suzuki();   //creating an object of subclass
		obj.run();  //called method
	}
	
	}	


