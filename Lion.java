package com;
//static binding of polymorphism

 public class Lion {  //creating class
	private void eat() {  //method
		System.out.println("Tiger eats meat");
	}
 
   public static void main(String args[]) {
	   Lion l = new Lion();  //creating an object
	   l.eat(); //called method
   }
} 
   
