package com.kavya;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DemoClass {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> values = new ArrayList<Integer>();
values.add(5);
values.add(8);
values.add(5);
values.add(77);

Collections.sort(values);
//values.remove(77);
 
//java.util.Iterator<Object> i = values.iterator();
//while(i.hasNext())
//{
//System.out.println(i.next());	
//}

for(int i: values)
{
System.out.println(i);	
}
	}

}
