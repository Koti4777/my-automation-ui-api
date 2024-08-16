package core.java.hackerrank;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatStringCount("abc",10));
	}

	public static long repeatStringCount(String input, long n) {
		
		StringBuilder sbr =new StringBuilder();
		while (sbr.length()<n) {
			for (int i=0;i<input.length();i++) {
				if(sbr.length()<n) {
					sbr.append(input.charAt(i));
				}else {
					break;
				}
				
			}
		}
		
		long count = 0;
		for(int i=0; i<sbr.length();i++) {
			if (sbr.charAt(i)=='a') {
				count++;
			}
		}
		
		return count;
	}
}

