package com.maven;

import java.util.Scanner;

import com.maven.daoimpl.EmployeeDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDaoImpl empdao = new EmployeeDaoImpl();
    	char c;
    	do {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("-------------------");
    		System.out.println("Press 1 for add \nPress 2 for read \nPress 3 for Update \nPress 4 for  Delete  \nPress 5 for Exit");
    		int ch = sc.nextInt();
    		switch(ch) {
    		case 1: empdao.addEmployee();
			break;
		//called a method for fetch student details
		case 2: empdao.fetchEmployee();
			break;
		//called a method for update student details 
		case 3: empdao.updateEmployee();
			break;
		//called a method for delete student details	
		case 4: empdao.deleteEmployee();
			break;
		//exit
		case 5: System.exit(0);
			break;
		//if you given wrong input
		default: System.out.println("Invalid Choice");
		}
		//if you want continue with operation or not
		System.out.println("Do you want to continue? Y/N");
		c = sc.next().charAt(0);
	}while(c == 'y' || c == 'Y');  
	System.out.println("Thank you.");
    }    
}
