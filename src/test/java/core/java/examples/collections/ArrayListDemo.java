package core.java.examples.collections;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("STRUTS");
        list.add(0,"Python");
        list.set(1, "Java Updated with set");
        list.remove(0);
        list.remove("JSP");
        
        Object[] sList = list.toArray();
        for (Object object : sList)
        {
            System.out.print(object+" ");
        }
        
        
	}

}
