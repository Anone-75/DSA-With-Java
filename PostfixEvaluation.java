import java.util.Stack;

public class PostfixEvaluation {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert char to int
            } else if (c != ' ') { // Skip whitespace characters
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid character in expression: " + c);
                }
            }
        }
        
        return stack.pop(); // Result is at the top of the stack
    }

    public static void main(String[] args) {
        String expression = "5 3 +";
        int result = evaluatePostfix(expression);
        System.out.println("Result of expression " + expression + " is: " + result);
    }
}
