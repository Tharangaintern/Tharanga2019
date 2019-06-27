package com.tharanga.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {
	public static void main(String[] args) {    
        
	    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession();  
	Transaction t = session.beginTransaction(); 
	Employee e=new Employee();
	Employee e1=new Employee();
	
	e.setId(999);
	e.setFname("sneha");
	e.setLname("sh");
	
	e1.setId(11);
	e1.setFname("soe");
	e1.setLname("p");
	
	
	session.save(e);
	session.save(e1);
	t.commit();
	session.close();
	factory.close();
}
}
