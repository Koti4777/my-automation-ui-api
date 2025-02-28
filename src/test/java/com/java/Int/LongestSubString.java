package com.java.Int;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubString("Hello"));
		}

	public static int longestSubString(String input) {
			int left=0; int right =0; int maxLength = 0;
			
			HashSet<Character> set = new HashSet<>();
			
			while (right<input.length()) {
				
				if (!set.contains(input.charAt(right))) {
					set.add(input.charAt(right));
					maxLength = Math.max(maxLength, right-left+1);
					right++;
				}else {
					set.remove(input.charAt(left));
					left++;
				}
			}

		return maxLength;
	}
}
