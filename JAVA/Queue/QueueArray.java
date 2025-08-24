package Queue;

public class QueueArray {
    int capacity;
    int size;
    int front;
    int rear;
    int queue[];
    public QueueArray(int capacity){
        queue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        rear = front = -1;
    }
    public boolean isEmpty(){
        if(front == -1 || rear == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if (rear == capacity - 1){
            return true;
        }
        else {
            return false;
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }
        return queue[front];
    }
    public void enQueue(int value){
        if (isFull()){
            System.out.println("The Queue is full");
            return;
        }
        if (isEmpty()){
            front = 0;
            rear = 0;
        }
        else {
            rear++;
        }
        size++;
        queue[rear ] = value;
    }
    public int deQueue(int value){
        if (isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }
        value = queue[front];
        if (front == rear){
            front = -1;
            rear = -1;
        }
        else {
            front++;
        }
        size--;
        return value;
    }
    public void printQueue(){
        if (isEmpty()){
            System.out.println("The Queue is Empty");
            return;
        }
        for (int i = front; i <= rear ; i++) {
            System.out.print(queue[i]);
            if (i!=rear){
                System.out.print(" , ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueArray MyQueue = new QueueArray(7);
        System.out.println("The capacity is : " + 7);
        MyQueue.printQueue();
        System.out.println("Printing");
        System.out.println("Inserting element : " + 7);
        MyQueue.enQueue(7);
        System.out.println("The Peek element is : " + MyQueue.peek());
        MyQueue.printQueue();
        System.out.println("Inserting element : " + 8);
        MyQueue.enQueue(8);
        System.out.println("The Peek element is : " + MyQueue.peek());
        MyQueue.printQueue();
        System.out.println("Inserting element : " + 6);
        MyQueue.enQueue(6);
        System.out.println("The Peek element is : " + MyQueue.peek());
        MyQueue.printQueue();
        System.out.println("Inserting element : " + 5);
        MyQueue.enQueue(5);
        System.out.println("The Peek element is : " + MyQueue.peek());
        MyQueue.printQueue();
        System.out.println("Inserting element : " + 4);
        MyQueue.enQueue(4);
        System.out.println("The Peek element is : " + MyQueue.peek());
        MyQueue.printQueue();
        System.out.println("Inserting element : " + 3);
        MyQueue.enQueue(3);
        System.out.println("The Peek element is : " + MyQueue.peek());
        MyQueue.printQueue();
        System.out.println("Inserting element : " + 2);
        MyQueue.enQueue(2);
        System.out.println("The Peek element is : " + MyQueue.peek());
        MyQueue.printQueue();
    }
}
