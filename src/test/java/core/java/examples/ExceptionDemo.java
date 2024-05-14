package core.java.examples;

public class ExceptionDemo {

	public static void exceptionDemo() throws Exception {
		
		int s = 9/9;
	}
public static void exceptionDemo1()  {
		
		try {
			int s = 9/0;
		}catch(Exception e) {
			System.out.print("in method exception 1");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			exceptionDemo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Came to Demo");
			e.printStackTrace();
		}
	}

}
