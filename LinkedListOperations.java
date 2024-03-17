import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOperations {
    private Node head;

    public LinkedListOperations() {
        head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted " + data + " at the beginning of the list.");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        System.out.println("Inserted " + data + " at the end of the list.");
    }

    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Linked List:");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListOperations list = new LinkedListOperations();

        while (true) {
            System.out.println("\nLinked List Operations:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at beginning: ");
                    int dataBeg = scanner.nextInt();
                    list.insertAtBeginning(dataBeg);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at end: ");
                    int dataEnd = scanner.nextInt();
                    list.insertAtEnd(dataEnd);
                    break;
                case 3:
                    list.displayList();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }
}
