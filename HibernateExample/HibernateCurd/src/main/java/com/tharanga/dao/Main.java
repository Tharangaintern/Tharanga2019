package com.tharanga.dao;


import java.util.*;

import javax.persistence.Query;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tharanga.model.Employee;
import com.tharanga.utility.HibernateUtil;

public class Main {
	
	public static void main(String[] args) {
        Main m=new Main();
        m.saveEmployee(10,"Noor", "Engineer", 10000);
        m.saveEmployee(30,"sahana", "Engineer", 20000);
        m.saveEmployee(10,"kavya", "Intern", 8000);
        m.retriveEmployee();
        m.deleteEmployee();
        m.updateEmployee();
    }
	//insert record
    public void saveEmployee(int deptno,String ename,String job,int sal){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Employee emp=new Employee();
            emp.setDeptno(deptno);
            emp.setEname(ename);
            emp.setJob(job);
            emp.setSal(sal);
            
            session.save(emp);
            transaction.commit();
            System.out.println("Records inserted sucessessfully");
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    //retrive record
    public void retriveEmployee()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
                        List employee = session.createQuery("from Employee").list();
            for (Iterator iterator = employee.iterator(); iterator.hasNext();)
            {
                Employee employee1 = (Employee) iterator.next();
                System.out.println(employee1.getId()+"  "+employee1.getEname()+"  "+ employee1.getJob()+"   "+employee1.getSal()+"   "+employee1.getDeptno());
            }         
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    //delete record
    public  void  deleteEmployee(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
           /* String queryString = "from Employee where deptno = :deptno";
            Query query = session.createQuery(queryString);
            query.setInteger("deptno", 30);
            Employee employee=(Employee) query.uniqueResult();
            session.delete(employee);
            System.out.println("One employee is deleted!");
        
              //Another way to write it
            */
             String hql = "delete from Employee  where deptno = 30";
              Query query1 = session.createQuery(hql);
              int row = query1.executeUpdate();
              if (row == 0){
              System.out.println("Doesn't deleted any row!");
              }
              else{
              System.out.println("Deleted Row: " + row);
              }
        System.out.println("One employee is deleted!");
        } catch (HibernateException e) {
            transaction .rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    //update record
    public  void  updateEmployee(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
           /* String queryString = "from Employee where sal = :sal";
            Query query = session.createQuery(queryString);
            query.setInteger("sal", 8000);
            Employee employee=(Employee) query.uniqueResult();
            employee.setSal(11000);
            session.update(employee);
            System.out.println("One employee is updated!");*/
            
            String hql = "update  Employee set sal=10000 where sal = 8000";
            Query query1 = session.createQuery(hql);
            int row = query1.executeUpdate();
            if (row == 0){
            System.out.println("Doesn't updated any row!");
            }
            else{
            System.out.println("Deleted Row: " + row);
            }
            
            
            
        } catch (HibernateException e) {
            transaction .rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}
