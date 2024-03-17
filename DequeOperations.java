import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeOperations {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDeque Operations:");
            System.out.println("1. Add element to front");
            System.out.println("2. Add element to rear");
            System.out.println("3. Remove element from front");
            System.out.println("4. Remove element from rear");
            System.out.println("5. Peek front element");
            System.out.println("6. Peek rear element");
            System.out.println("7. Size of deque");
            System.out.println("8. Display deque");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add to front: ");
                    int frontElement = scanner.nextInt();
                    deque.offerFirst(frontElement);
                    System.out.println("Element added to front: " + frontElement);
                    break;
                case 2:
                    System.out.print("Enter the element to add to rear: ");
                    int rearElement = scanner.nextInt();
                    deque.offerLast(rearElement);
                    System.out.println("Element added to rear: " + rearElement);
                    break;
                case 3:
                    if (!deque.isEmpty()) {
                        int removedFrontElement = deque.pollFirst();
                        System.out.println("Removed element from front: " + removedFrontElement);
                    } else {
                        System.out.println("Deque is empty, cannot remove from front!");
                    }
                    break;
                case 4:
                    if (!deque.isEmpty()) {
                        int removedRearElement = deque.pollLast();
                        System.out.println("Removed element from rear: " + removedRearElement);
                    } else {
                        System.out.println("Deque is empty, cannot remove from rear!");
                    }
                    break;
                case 5:
                    if (!deque.isEmpty()) {
                        int front = deque.peekFirst();
                        System.out.println("Front element of the deque: " + front);
                    } else {
                        System.out.println("Deque is empty, no front element!");
                    }
                    break;
                case 6:
                    if (!deque.isEmpty()) {
                        int rear = deque.peekLast();
                        System.out.println("Rear element of the deque: " + rear);
                    } else {
                        System.out.println("Deque is empty, no rear element!");
                    }
                    break;
                case 7:
                    System.out.println("Size of the deque: " + deque.size());
                    break;
                case 8:
                    System.out.println("Elements in the deque: " + deque);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 9.");
            }
        }
    }
}
