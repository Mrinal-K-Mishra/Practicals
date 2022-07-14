
package com;

public class Overloadingtypepromotion { // class
	void add(int a,int b) {  // method 1
		System.out.println(a+b);}
	void add(long a,long b) {  // method 2
		System.out.println(a+b);}
	public static void main(String args[]) {
		Overloadingtypepromotion obj = new Overloadingtypepromotion();// object
		obj.add(2,3); // 2nd int will be promoted to long
		//obj.add(20,30,40);
	}

}
