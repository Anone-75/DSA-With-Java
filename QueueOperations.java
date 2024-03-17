import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue (Add element to the queue)");
            System.out.println("2. Dequeue (Remove element from the queue)");
            System.out.println("3. Peek (Get the front element of the queue)");
            System.out.println("4. Size (Get the number of elements in the queue)");
            System.out.println("5. Display (Display all elements in the queue)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.offer(element);
                    System.out.println("Element enqueued: " + element);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        int dequeuedElement = queue.poll();
                        System.out.println("Element dequeued: " + dequeuedElement);
                    } else {
                        System.out.println("Queue is empty, cannot dequeue!");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        int frontElement = queue.peek();
                        System.out.println("Front element of the queue: " + frontElement);
                    } else {
                        System.out.println("Queue is empty, no front element!");
                    }
                    break;
                case 4:
                    System.out.println("Size of the queue: " + queue.size());
                    break;
                case 5:
                    System.out.println("Elements in the queue: " + queue);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }
}
