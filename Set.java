import java.util.*;

public class Set {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] nextGreater = findNextGreaterElements(arr);

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i] + ": " + nextGreater[i]);
        }
    }

    public static int[] findNextGreaterElements(int[] arr) {
        int N = arr.length;
        int[] nextGreater = new int[N];
        Stack<Integer> stack = new Stack<>();

        for (int i = N - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return nextGreater;
    }
}
