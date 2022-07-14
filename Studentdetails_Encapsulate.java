package com;
import java.util.Scanner;
public class Studentdetails_Encapsulate {
	private String name;
	private long user_Id;
    private long password;
    private int Biology,Computer,Chemistry,Maths,Physics;
    //getters, setters for Student_Id and name fields.
    public int getId() {
        return Student_Id;
    }
    public void setId(int s_id) {
        this.Student_Id = s_id;
    }
    public String getname() {
        return name;
    }
    public void setname(String s_name) {
        this.name = s_name;
    }
		private static Scanner sc;
		public static void main(String[] args) 
		{
			int Biology,Computer,Chemistry,Maths,Physics; 
		    float total, Percentage;
			sc = new Scanner(System.in);
			System.out.print("Enter the Five Subjects Marks : ");
		    Biology = sc.nextInt();	//method of the class it is used to scan the input
			Computer = sc.nextInt();	
			Chemistry = sc.nextInt();	
			Maths = sc.nextInt();	
			Physics = sc.nextInt();	
			
			total = Biology + Computer + Chemistry + Maths + Physics;
		    Percentage = (total / 500) * 100;
		    
		    System.out.println("Total Marks =  " + total);
		    System.out.println("Percentage of Marks =  " + Percentage);
		}
	}

