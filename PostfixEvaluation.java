import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                // If the character is a digit, push it onto the stack
                stack.push(c - '0');
            } else {
                // If the character is an operator, pop two operands from the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                // Perform the operation and push the result onto the stack
                int result = performOperation(operand1, operand2, c);
                stack.push(result);
            }
        }

        // The final result will be the only element remaining on the stack
        return stack.pop();
    }

    private static int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a postfix expression: ");
        String expression = scanner.nextLine();

        int result = evaluatePostfix(expression);
        System.out.println("Result: " + result);
    }
}
