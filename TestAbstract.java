package com;

public class TestAbstract {
	TestAbstract(){
		System.out.println("Abstract class is created");
	}
	abstract void run(); 
	void changeSpeed() {
		System.out.println("Speed changed");
	}
}
class Child extends TestAbstract {
	void run() {
		System.out.println("Running safely");
	}
}
class testAbstraction1 {
	public static void main(String[] args) {
	TestAbstract obj = new child();
		obj.run();
		obj.changeSpeed();
	}
}
