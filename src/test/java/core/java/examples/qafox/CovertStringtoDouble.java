package core.java.examples.qafox;

public class CovertStringtoDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "3.14";
		System.out.println(s+1);
		System.out.println(Double.parseDouble(s)+1);
		
		try {
			System.out.println(Integer.parseInt(s));
		}catch(NumberFormatException e) {
			
		}
		
		
	}

}
