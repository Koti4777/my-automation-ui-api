package core.java.examples.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
	    
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        
        Set<String> stringSet1 = new LinkedHashSet<>(Arrays.asList(s1));
        Set<String> stringSet2 = new LinkedHashSet<>(Arrays.asList(s2));
        System.out.println(stringSet1);
        System.out.println(stringSet2);
        stringSet1.retainAll(stringSet2);
        System.out.println(stringSet1);
        
        
        
	}

}
