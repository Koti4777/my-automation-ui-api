package core.java.examples;

import java.util.HashMap;

public class FirstRepeatandNonrepeate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "JavaConceptOfTheDay";
char[] charArray = input.toCharArray();
HashMap<Character, Integer> charMap = new HashMap<>();
for (char ch:charArray) {
	if (charMap.containsKey(ch)) {
		charMap.put(ch, charMap.get(ch)+1);
	}else {
		charMap.put(ch, 1);
	}
}

for (char ch:charArray) {
	if(charMap.get(ch)==1) {
		System.out.println("First Non-Repeated Character In '"+input+"' is '"+ch+"'");
		break;
	}
}

for (char ch:charArray) {
	if(charMap.get(ch)>1) {
		System.out.println("First Non-Repeated Character In '"+input+"' is '"+ch+"'");
		break;
	}
}

	}

}
