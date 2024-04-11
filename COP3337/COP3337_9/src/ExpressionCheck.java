import java.util.Scanner;
import java.util.Stack;

public class ExpressionCheck {
	public static boolean isBalanced(String userInput) {
		// create stack instance
		Stack<Character> stack = new Stack<>();
		
		// iterate through each char in charArray
		for (char c : userInput.toCharArray()) {
			// check for valid open values, push to stack
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
				// check for valid close values, if valid and empty stack return false
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) return false;
				
				// pop off top of stack
				char top = stack.pop();
				// if the current close value does not map to top, return false
				if (top == '(' && c != ')' ||
								top == '{' && c != '}' ||
								top == '[' && c != ']')
					return false;
			}
		}
		// if stack is empty the input is balanced
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CHECK IF PARENTHESIS EXPRESSION IS BALANCED");
		System.out.println("--------------------------------------------------");
		System.out.println("Valid parenthesis: '{, }, (, ), [, ]', other values will be ignored.");
		System.out.println("Balanced examples: '{(hello)}', '[][]{}({})'");
		System.out.println("Unbalanced examples: '{)}', '[](])'");
		System.out.println("--------------------------------------------------");
		System.out.println("Enter valid parenthesis:");
		String userIn = sc.nextLine();
		sc.close();
		
		// record if input is balanced, output result
		String out = isBalanced(userIn) ? "Balanced" : "Not Balanced";
		System.out.println(out);
		
	}
}
