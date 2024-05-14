package core.java.examples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapSortDemo {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> namesMap = new HashMap<>();
		namesMap.put("Koti", 4777);
		namesMap.put("Hari", 7777);
		namesMap.put("Satish", 9777);
		namesMap.put("Ram", 9999);
		namesMap.put("Krishna", 5777);
		
		

		
		 
		  
		  
		ArrayList<String> namesList = new ArrayList<>(namesMap.keySet());
		System.out.println(namesList);
		Collections.sort(namesList);
		System.out.println(namesList);

		LinkedHashMap<String, Integer> namesMap1 = new LinkedHashMap<String,Integer>(); 

		for (String name:namesList) {

			namesMap1.put(name, namesMap.get(name));
		}
		System.out.println(namesMap1);
	}

}
