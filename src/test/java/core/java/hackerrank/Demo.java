package core.java.hackerrank;

import java.util.Stack;

public class Demo {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>(); 


        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return  false; // Unbalanced
                }
                char topChar = stack.pop();
                if ((ch == ')' && topChar != '(') ||
                    (ch == '}' && topChar != '{') ||
                    (ch == ']' && topChar != '[')) {
                    return false; // Unbalanced
                }
            }
        }

        return stack.isEmpty(); // Balanced if stack is empty
    }

    public static void main(String[] args) {
        String str = "{()}";
        if (isBalanced(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");

        }
    }
}