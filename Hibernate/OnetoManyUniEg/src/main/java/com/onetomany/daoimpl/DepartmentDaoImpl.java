package com.onetomany.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onetomany.config.HibernateUtil;
import com.onetomany.dao.DepartmentDao;
import com.onetomany.entity.Department;
import com.onetomany.entity.Employees;

public class DepartmentDaoImpl implements DepartmentDao {
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();


	@SuppressWarnings("deprecation")
	public void addDept() {
		
		Department d = new Department();
		d.setDid(1);
		d.setDname("IT");
		d.setDcity("kolkata");
		
		Employees e = new Employees();
		e.setEname("Arnab");
		e.setEphone(987654321);
		e.setEmail("arnab@gmail.com");
		e.setEsalary(56924.56);
		e.setAddress("Kolkata");
		
		Employees e1 = new Employees();
		e1.setEname("Sourav");
		e1.setEphone(48956987);
		e1.setEmail("sourav@gmail.com");
		e1.setEsalary(56865.50);
		e1.setAddress("Malda");
		
		Employees e2 = new Employees();
		e2.setEname("Rahul");
		e2.setEphone(789456123);
		e2.setEmail("rahul@gmail.com");
		e2.setEsalary(64455.10);
		e2.setAddress("Kalyani");
		
		List<Employees> al = new ArrayList<Employees>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		d.setEmployees(al);
		
		session.save(d);
		t.commit();
		System.out.println("inserted succesfully");
		
		
	}

	public void fetchDept() {
		
		
	}

}