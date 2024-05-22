package core.java.examples.qafox;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Input");
while (sc.hasNext()) {
	System.out.println(sc.nextLine());
}
	}

}
