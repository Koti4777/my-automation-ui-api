package core.java.examples.collections.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> namesList = new ArrayList<>(List.of("one","two","two","three","three","three","four","four","four","four"));
		System.out.println("Before-"+namesList);
		System.out.println(removeDuplicates(namesList));
		

	}
	
	public static ArrayList<String> removeDuplicates(List<String> input){
		Set<String> namesSet = new LinkedHashSet<>();
		
		for (String name:input) {
			
			namesSet.add(name);
		}
		
		return new ArrayList<>(namesSet);
		
	}

}
