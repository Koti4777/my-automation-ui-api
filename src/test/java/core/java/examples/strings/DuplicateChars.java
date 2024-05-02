package core.java.examples.strings;

import java.util.HashMap;
import java.util.Set;

public class DuplicateChars {

	public static void duplicateChars(String input) {
		
		char[] chars = input.toCharArray();
		HashMap<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		for (Character ch:chars) {
			if (charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch)+1);
			}else {
				charmap.put(ch, 1);
			}
		}
		
		Set<Character> charset = charmap.keySet();
		
		for (Character c:charset) {
			
			if(charmap.get(c)>1) {
				System.out.println(c +" : "+ charmap.get(c));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateChars("Hello world this is koti");
	}

}
