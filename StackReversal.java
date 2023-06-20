import java.util.Scanner;
import java.util.Stack;

public class StackReversal {
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int item = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, item);
        }
    }

    private static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            stack.push(element);
        }

        System.out.println("Original stack: " + stack);
        reverseStack(stack);
        System.out.println("Reversed stack: " + stack);
    }
}
