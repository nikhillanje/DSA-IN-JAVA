import java.util.*;

public class StackRev {
    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

    }

    public static void printStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();

        // Move elements to a temporary stack to preserve original order
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }

        // Print elements from the temporary stack
        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
        }
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        reverseStack(s);
        printStack(s);

    }
}
