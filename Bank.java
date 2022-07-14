package com;
public class Bank {  
		float Interest(){
			return 0.0f; }  
		}  
		class SBI extends Bank{  
		float Interest() {
			return 8.0f;}  
		}  
		  class ICICI extends Bank{  
		float Interest(){
			return 7.0f;}  
		}  
		class AXIS extends Bank{  
		float Interest(){
			return 9.0f;}  
		}  
		class Test2 {  
		public static void main(String args[]){  
		SBI s=new SBI();  
		ICICI i=new ICICI();  
		AXIS a=new AXIS();  
		System.out.println("SBI Rate of Interest: "+s.Interest());  
		System.out.println("ICICI Rate of Interest: "+i.Interest());  
		System.out.println("AXIS Rate of Interest: "+a.Interest());  }  
		}  


