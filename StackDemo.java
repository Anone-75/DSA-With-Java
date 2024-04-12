import java.util.*;

public class StackDemo {
    private int maxsize, top;
    private int[] stackArray;

    public StackDemo(int size) {
        this.maxsize = size;
        this.stackArray = new int[maxsize];
        this.top = -1;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stackArray[i]);
        }
    }

    public void push(int value) {
        stackArray[++top] = value;
        System.out.println(value + " inserted");
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for the stack:");
        int s = sc.nextInt();
        StackDemo st = new StackDemo(s);

        System.out.println("Enter elements to push into the stack:");
        for (int i = 0; i < s; i++) {
            st.push(sc.nextInt());
        }

        System.out.println("Is stack empty? " + st.isEmpty());
        System.out.println("Top element (peek): " + st.peek());
        System.out.println("Pop element: " + st.pop());
        System.out.println("After popping, elements in the stack:");
        st.print();

        sc.close();
    }
}
