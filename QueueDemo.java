public class QueueDemo {
    private int size,front,rear,currentsize;
    private int[] queueDemo;

    public QueueDemo(int size){
        this.size=size;
        this.front=0;
        this.rear=-1;
        this.currentsize=0;
        this.queueDemo=new  int [size];
    }

    public boolean isEmpty(){
        return currentsize == 0;
    }

    public void enqueue(int value){
        rear = (rear + 1)% size;
        queueDemo[rear] = value;
        currentsize ++;
        System.out.println("Item inserted");
    }
    public void deque(){
        int dequed = queueDemo[front];

        front = (front + 1) % size;
        currentsize --;
        System.out.println("Dequed Elements :"+dequed);
    }
    public static void main(String[] args) {
       QueueDemo qd = new QueueDemo(5);
       qd.enqueue(50);
        System.out.println(qd.isEmpty());
       qd.deque();
    }
}
