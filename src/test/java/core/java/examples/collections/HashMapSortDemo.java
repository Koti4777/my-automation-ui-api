package core.java.examples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortDemo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> namesMap = new HashMap<>();
		namesMap.put("Koti", 4777);
		namesMap.put("Hari", 7777);
		namesMap.put("Satish", 9777);
		namesMap.put("Ram", 9999);
		namesMap.put("Krishna", 5777);

		Comparator<Map.Entry<String, Integer>> valueComprator = new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> m1, Entry<String, Integer> m2) {
				// TODO Auto-generated method stub
				//return m1.getKey().compareTo(m1.getKey());// this will sort on key
				return m1.getValue().compareTo(m2.getValue());//this will sort on value
				
			}
		};

		ArrayList<Map.Entry<String, Integer>> namesList = new ArrayList<>(namesMap.entrySet());
		//Set<String> nameSet = new HashSet<>(namesMap.keySet());

		
		Collections.sort(namesList,valueComprator);
		System.out.println(namesList);
		 for (Map.Entry<String, Integer> entry : namesList) {
		      System.out.println(entry.getKey() + " : " + entry.getValue());
		    }
		
		
	}

}
