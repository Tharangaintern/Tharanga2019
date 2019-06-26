package com.tharanga;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileOutputStream fos = new FileOutputStream("demo.txt");
DataOutputStream dos = new DataOutputStream(fos);
dos.writeUTF("Demo Content");

FileInputStream fis = new FileInputStream("demo.txt");
DataInputStream dis = new DataInputStream(fis);
String str = dis.readUTF();
System.out.println(str);

	}

}
