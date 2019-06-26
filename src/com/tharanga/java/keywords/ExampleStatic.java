package com.tharanga.java.keywords;

public class ExampleStatic {
	 int rollno;
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   ExampleStatic(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   
	   void display (){
		   System.out.println(rollno+" "+name+" "+college);
		   }  
	 
	
	 public static void main(String args[]){  
	 ExampleStatic s1 = new ExampleStatic(111,"Karan");  
	 ExampleStatic s2 = new ExampleStatic(222,"Aryan");  
	 
	 s1.display();  
	 s2.display();  
	 }  

}
