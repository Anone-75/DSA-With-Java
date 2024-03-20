import java.util.*;

public class StackDemo{
    private int maxsize,top;
    private int [] stackArray;

    public StackDemo(int size){
        this.maxsize=size;
        this.stackArray = new int[maxsize];
        this.top=-1;
    }
    public void print(){
        for (int i=0; i<=top;i++){
             System.out.println(stackArray[i]);        
            }
       
    }
    public void push(int value){

        stackArray[++top] = value;
        System.out.println(value+"inserted");
        return;
    }
    public int pop(){
        return stackArray[top --];
    }
    public boolean isEmpty(){
        return (top== -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size for stack");
        int s = sc.nextInt();
        StackDemo st = new StackDemo(s);

       for (int i=0;i<s;i++){
        st.push(sc.nextInt());
       }
        System.out.println(st.isEmpty());
        System.out.println("Pop element :"+st.pop());
        st.print();
        sc.close();
    }
}
