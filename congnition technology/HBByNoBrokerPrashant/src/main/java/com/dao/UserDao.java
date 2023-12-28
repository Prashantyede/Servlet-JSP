package com.dao;

import org.hibernate.Session;

import org.hibernate.Transaction;

import com.HbUtils.HbSession;
import com.model.Buyer;
import com.model.Flats;
import com.model.Owner;

public class UserDao {

	public static void insert(Owner o)
	{ try {
		// TODO Auto-generated method stub
		Session session=HbSession.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.save(o);
		tx.commit();
	  }	catch (Exception e)
    {
	// TODO: handle exception
	System.out.println("Exception Owner register:-"+e);
     }	
	}
	public static void insertBuyer(Buyer b) {
	try{
		// TODO Auto-generated method stub
		Session session=HbSession.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.save(b);
		tx.commit();
	} catch (Exception e)
	    {
		// TODO: handle exception
		System.out.println("Exception Buyer register:-"+e);
	     }
}
	public static void insertFlat(Flats f) {
		try{
			// TODO Auto-generated method stub
		Session session=HbSession.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.save(f);
		tx.commit();
	   }catch (Exception e)
	    {
		// TODO: handle exception
		System.out.println("Exception Flats register:-"+e);
	     }
	}
}


