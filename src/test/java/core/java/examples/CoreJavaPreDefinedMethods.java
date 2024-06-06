package core.java.examples;

import java.util.Random;

public class CoreJavaPreDefinedMethods {

	public static void main(String[] args) {
		/* 
		 * Random number generation
		 * Random number with in given range
		 *  */
		Random random = new Random();        
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(999));
	}

}
