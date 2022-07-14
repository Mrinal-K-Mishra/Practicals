package com;

public class DataMember { //superclass
   int speedlimit = 70;  //data member of superclass
   
}
class Hyundai extends DataMember {  //subclass of DataMember
	int speedlimit = 80;  //data member of subclass
	public static void main(String args[]) {
		Hyundai obj = new Hyundai();  //creating an object of subclass
		System.out.println(obj.speedlimit);
	}
}
