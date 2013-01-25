package com.tharun.HibernateDemo;

import org.hibernate.Session;

import com.tharun.persistence.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	        System.out.println("Maven + Hibernate + MySQL");
	        Session session = HibernateUtil.getSessionFactory().openSession();
	 
	        session.beginTransaction();
	        Stock stock = new Stock();
	 
	        stock.setStockCode("42715");
	        stock.setStockName("GENMd");
	 
	        session.save(stock);
	        session.getTransaction().commit();
	    }
}
