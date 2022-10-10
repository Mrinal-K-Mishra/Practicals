package com.tpc.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tpc.config.HibernateUtil;
import com.tpc.dao.VehicleDao;
import com.tpc.entity.FourWheeler;
import com.tpc.entity.TwoWheeler;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue(value = "vehicle")
public class VehicleDaoImpl implements VehicleDao {

	@SuppressWarnings("deprecation")
	@Override
	public void addVehicle() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		TwoWheeler tw = new TwoWheeler();
		
		tw.setFuel("Petrol");
		tw.setEngine("500cc");
		tw.setVtype("Bike");
		tw.setPrice(200000);
		tw.setModelno(1234);
		tw.setModelname("abc");
		tw.setAbs(true);
		tw.setTyretype(140);
		tw.setBtype("Sports Bike");
		
		FourWheeler fw = new FourWheeler();
		
		fw.setFuel("Electric");
		fw.setEngine("1000cc");
		fw.setVtype("Car");
		fw.setPrice(800000);
		fw.setModelno(44444);
		fw.setModelname("swift");
		fw.setMusicsystem(true);
		fw.setEtype("automatic");
		fw.setAc(true);
		
		session.save(tw);
		session.save(fw);
		
		System.out.println("Done");
		
		t.commit();
		
		
	}

}