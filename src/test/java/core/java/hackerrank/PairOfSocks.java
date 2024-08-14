package core.java.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




public class PairOfSocks {
    public static void main(String[] args) throws IOException {
      int[] input = {1,1,2,2,3,3};
      Arrays.sort(input);
      int pairs =0;
      for (int i=0;i<input.length-1;i++) {
    	  if (input[i]==input[i+1]) {
        	  pairs++;
        	  i++;
          } 
      }
      System.out.println("Pair of socks based on color is "+pairs);
    }
}