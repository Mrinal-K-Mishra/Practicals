package com.onetoone.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onetoone.dao.CitizenDao;
import com.onetoone.entity.Address;
import com.onetoone.entity.Citizen;
import com.onetoone.config.HibernateUtil;

public class CitizenDaoImpl implements CitizenDao {

	@SuppressWarnings("deprecation")
	@Override
	public void addCitizen() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		Citizen c = new Citizen();
		
		c.setCname("Arnab");
		c.setSurname("Hoodati");
		c.setPhone(98765432);
		c.setEmail("arnab@gmail.com");
		c.setDob("2000-01-01");
		
		Address a = new Address();
		a.setIdnumber(10111);
		a.setIdtype("aadhar");
		a.setAddress("xyz house");
		a.setCity("kolkata");
		a.setState("west bengel");
		a.setPincode(743503);
		
		a.setCitizen(c);
		c.setAddress(a); 	//address object to citizen object
		
		session.save(c);
		t.commit();
		System.out.println("inserted succesfully");
		
	}

	@Override
	public void fetchCitizen() {
		Citizen c1 = new Citizen();
		Address a1 = new Address();
		System.out.println(c1.getCname()+" "+c1.getSurname());
		System.out.println(a1.getIdnumber()+" "+a1.getIdtype()+" "+a1.getAddress()+" "+a1.getCity()+" "+a1.getState()+" "+a1.getPincode());
		
		
	}

}