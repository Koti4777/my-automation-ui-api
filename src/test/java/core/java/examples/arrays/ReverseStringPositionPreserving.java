package core.java.examples.arrays;

public class ReverseStringPositionPreserving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "I'm a string input for reverse";
		
		char[] charArray = input.toCharArray();
		char[] resultArray = new char[charArray.length];
		
		for (int i=0;i<charArray.length;i++) {
			
			if (charArray[i]==' ') {
				
				resultArray[i] = ' ';
			}
		}
		
		int j = charArray.length-1;
		
		
		 for (int i = 0; i < charArray.length; i++) {
			 
			 if (charArray[i]!=' ') {
				 
				 if(resultArray[j] == ' ') {
					 j--;
				 }
				 
				 resultArray[j]=charArray[i];
				 j--;
			 }
		 }
		
		System.out.println(String.valueOf(resultArray));
		
	}

}
