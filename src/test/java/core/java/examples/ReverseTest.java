package core.java.examples;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

import org.testng.annotations.Test;

public class ReverseTest {
	

    @Test
    public void testPositiveNumber() {
        int input = 1234;
        int expected = 4321;
        int actual = MakePalindrome26.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeNumber() {
        int input = -1234;
        int expected = -4321;
        int actual = MakePalindrome26.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testZero() {
        int input = 0;
        int expected = 0;
        int actual = MakePalindrome26.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleDigit() {
        int input = 5;
        int expected = 5;
        int actual = MakePalindrome26.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargeNumber() {
        int input = 123456789;
        int expected = 987654321;
        int actual = MakePalindrome26.reverse(input);
        assertEquals(expected, actual);
    }

	
	  @Test public void testOverflow() { // This test depends on the integer size(32-bit in this case)
	  
	  int input = Integer.MAX_VALUE;
	  System.out.println(input);
	  System.out.println(MakePalindrome26.reverse(input));
	  
	  //assertThrows(ArithmeticException.class, () -> MakePalindrome26.reverse(input));
	  
	  }
	 

}
