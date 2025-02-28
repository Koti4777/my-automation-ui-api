package core.java.examples.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hello world!!";
		
		Map<Character,Integer> cMap = new LinkedHashMap<>();
		System.out.println(cMap);
		for (int i=0;i<input.length();i++) {
			Character c = input.charAt(i);
			if (cMap.containsKey(c)) {
				int count = cMap.get(c);
				cMap.put(c, count+1);
				
			}else {
				cMap.put(c, 1);
			}
		}
		
		System.out.println(cMap);
		
	}

}
