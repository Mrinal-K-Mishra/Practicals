package com;
public class Animal {  //super class
     void eat() {  //method1
		System.out.println("Eating"); }  
		}  
		class Tiger extends Animal{  //sub class of Animal
		void eat(){  //method2
	    System.out.println("Tiger eats meat"); }  
		}  
		class Rabbit extends Animal{ //sub class of Animal
		void eat(){   //method3
		System.out.println("Rabbit eats carrots"); }  
		}  
		class Frog extends Animal{ //sub class of Animal 
		void eat(){
		System.out.println("Frog eats grasshopper"); }  
		}  
		class Test {  //main class
		public static void main(String[] args){  
        Animal tiger = new Animal();  //creating an object
		tiger.eat();     //called method
		Animal rabbit = new Animal();  
		rabbit.eat();  
		Animal frog = new Animal();  
		frog.eat();  
		}
	}  

