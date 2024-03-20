public class DequeueDemo{
    private int size,front,rear,currentsize;
    private int [] array;

    public DequeueDemo(int size){
        this.size=size;
        this.front=0;
        this.rear=-1;
        this.currentsize=0;
        this.array=new int [size];
    }
public boolean isEmpty(){
    return currentsize == 0;
}
public void pushfront(int value){
    front = (front - 1 +size) % size;
    array[front] = value;
    currentsize ++;
    System.out.println("item pushed"+value);
}
public void pushRear(int value){
    rear = (rear + 1) % size;
    array[rear]=value;
    currentsize++;
    System.out.println("item inserted at rear "+value);
}

public int popFront(){
    int PopedElement = array[front];
    front = (front + 1) % size;
    currentsize --;
    return PopedElement;
}
public int popRear(){
    int PopedElement = array[rear];
    rear = (rear - 1 + size) % size;
    currentsize --;
    return PopedElement;
}

public int getFront(){
    return array[front];
    
}
public int getRear(){
    return array[rear];
}
    public static void main(String[] args) {
        DequeueDemo deque = new DequeueDemo(5);
        deque.pushfront(20);
        deque.pushRear(60);
        System.out.println(deque.getFront());
        System.out.println(deque.getRear());
       System.out.println( deque.isEmpty());
       System.out.println(deque.popRear());
       System.out.println(deque.popFront());
    }
}
