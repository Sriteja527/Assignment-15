import java.util.Scanner;
import java.util.Stack;

public class StringReversal {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack and append them to a new string
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);
    }
}
