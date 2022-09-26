package com.maven.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.maven.config.Hibernateutil;
import com.maven.dao.EmployeeDao;
import com.maven.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	Session session = Hibernateutil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addEmployee() {
		String n, a, e;
		long p;
		double s;
		System.out.println("Enter name");
		n=sc.next();
		System.out.println("Enter email id");
		e=sc.next();
		System.out.println("Enter phone number");
		p=sc.nextLong();
		System.out.println("Enter address");
		a=sc.next();
		System.out.println("Enter Salary");
		s=sc.nextDouble();
		//creating object of employee for invoking setter method
		Employee emp = new Employee();
		emp.setEname(n);
		emp.setEphone(p);
		emp.setEmail(e);
		emp.setAddr(a);
		emp.setEsalary(s);

		session.save(emp);
		System.out.println("Inserted Successfully...");
		t.commit();
	}

	@Override
	public void fetchEmployee() {
		System.out.println("Enter id");
		int i = sc.nextInt();
		Employee emp1 = session.get(Employee.class, i);
		System.out.println(emp1.getEname()+" "+emp1.getEphone()+" "+emp1.getEmail()+" "+emp1.getAddr());

	}

	@Override
	public void updateEmployee() {
		System.out.println("Enter id");
		int i = sc.nextInt();
		Employee emp2 = session.get(Employee.class, i);
		System.out.println("Enter changed number");
		long pp = sc.nextLong();
		emp2.setEphone(pp);
		session.update(emp2);
		System.out.println("updated succesfully");
		t.commit();

	}

	@Override
	public void deleteEmployee() {
		System.out.println("Enter id");
		int i = sc.nextInt();
		Employee emp3 = session.get(Employee.class, i);
		session.delete(emp3);
		t.commit();
		System.out.println("Deleted succesfully");
		
	}

}