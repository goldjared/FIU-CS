import stack.Stack;

public class InfixToPostfix {
	public static int getPriority(char c) {
		return switch (c) {
			case '+', '-' -> 1;
			case '*', '/' -> 2;
			case '^' -> 3;
			default -> -1;
		};
	}
	
	public static String convert(String input) {
		StringBuilder result = new StringBuilder();
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if (Character.isLetterOrDigit(c)) {
				// append all operands
				result.append(c);
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				// loop until closing parenthesis
				while (!stack.isEmpty() && stack.peek() != '(') {
					result.append(stack.pop());
				}
				stack.pop();
			} else {
				
				while (!stack.isEmpty() && getPriority(c) <= getPriority(stack.peek())) {
					result.append(stack.pop());
				}
				stack.push(c);
			}
		}
		// empty remaining stack
		while (!stack.isEmpty()) {
			if (stack.peek() == '(') {
				System.out.println("Missing bracket.");
				throw new RuntimeException();
			}
			result.append(stack.pop());
		}
		
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		// test case 1
		String in1 = "4+5*8+9";
		String post1 = convert(in1);
		System.out.println("Infix 1: " + in1);
		System.out.println("Postfix 1: " + post1);
		
		System.out.println("--------------------------------");
		// test case 2
		String in2 = "A*B(C+D)/E";
		String post2 = convert(in2);
		System.out.println("Infix 2: " + in2);
		System.out.println("Postfix 2: " + post2);
		
		System.out.println("--------------------------------");
		// test case 3
		String in3 = "4*4+5+6";
		String post3 = convert(in3);
		System.out.println("Infix 3: " + in3);
		System.out.println("Postfix 3: " + post3);
	}
	
}
