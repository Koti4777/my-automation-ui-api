package core.java.hackerrank;

import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(isBalanced("({[]})"));
//		System.out.println(isBalanced("}({[]})"));
//		System.out.println(isBalanced("({[]})("));//updated from review
//		System.out.println(isBalanced("[]"));//updated from review
//		System.out.println(isBalanced("{}"));//updated from review
		System.out.println(isBalanced("()"));//updated from review
	}

	public static boolean isBalanced(String input) {
		char[] inputArray = input.toCharArray();
		Stack<Character> stackBox = new Stack<Character>();
		for (char ch:inputArray) {

			if (ch=='(' || ch=='{' || ch=='[') {
				stackBox.push(ch);
			}else if (ch==')' || ch=='}' || ch==']') {
				if (stackBox.isEmpty()) {
					return false;
				}
				char topchar = stackBox.pop();
				if ((ch==')' && topchar!='(') ||(ch==']' && topchar!='[')|| (ch=='}' && topchar!='{')) {
					return false;
				}
			}

		}
		return stackBox.isEmpty();
	}
}
