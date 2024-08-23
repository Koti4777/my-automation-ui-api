package core.java.examples;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> vi = new Vector<>();
		vi.add(10);
		vi.add(20);
		vi.add(30);
		
		for (Integer v:vi) {
			System.out.println(v);
		}
	}

}
