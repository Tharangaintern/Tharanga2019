package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.StudentUpdate;

public class ClientUpdate {
public static void main(String[] args){
Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	
	StudentUpdate su=new StudentUpdate(111,"ssss","ss@gmail.com");
	
	      s.save(su);
	      t.commit();
	      s.close();
	      sf.close();
	      
	      System.out.println("save success");
	
}
}
