package core.java.examples.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
	    
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        
        HashSet<String> set1 = new HashSet<>(Arrays.asList(s1));
        HashSet<String> set2 = new HashSet<>(Arrays.asList(s2));
        
        set1.retainAll(set2);
        System.out.println(set1);
        
	}

}
