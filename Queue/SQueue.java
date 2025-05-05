import java.util.LinkedList;

public class SQueue {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        // Enqueue (add elements)
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue: " + queue);

        // Dequeue (remove element)
        String removed = queue.remove();
        System.out.println("Removed: " + removed);
        System.out.println("Queue after removal: " + queue);

        // Peek (view head element)
        System.out.println("Peek: " + queue.peek());

    }
}
