import java.util.Stack;

public class PolishNotation {
    public static void main(String[] args) {
        // Example expression in Polish notation: + * 5 4 3
        String expression = "+ * 5 4 3";

        // Evaluate the expression
        int result = evaluate(expression);
        System.out.println("Result: " + result);
    }

    public static int evaluate(String expression) {
        String[] tokens = expression.split("\\s+"); // Split expression into tokens

        Stack<Integer> stack = new Stack<>();

        // Traverse the tokens
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            // If token is an operator
            if (isOperator(token)) {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else {
                // Token is an operand
                stack.push(Integer.parseInt(token));
            }
        }

        // Result will be left on top of the stack after evaluation
        return stack.peek();
    }

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public static int performOperation(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
