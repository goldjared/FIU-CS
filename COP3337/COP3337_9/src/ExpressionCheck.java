import java.util.Scanner;
import java.util.Stack;

public class ExpressionCheck {
	public static boolean isBalanced(String userInput) {
		Stack<Character> stack = new Stack<>();
		
		for (char c : userInput.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) return false;
				
				char top = stack.pop();
				if (top == '(' && c != ')' ||
								top == '{' && c != '}' ||
								top == '[' && c != ']')
					return false;
			}
		}
		return true;
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
		
		String out = isBalanced(userIn) ? "Balanced" : "Not Balanced";
		System.out.println(out);
		
	}
}
