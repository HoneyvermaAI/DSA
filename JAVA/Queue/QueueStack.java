package Queue;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void Enqueue(int val){
        stack1.push(val);
    }
    public int Dequeue(){
        if (stack1.isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int val = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }
    public int Peek(){
        if (stack1.isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int val = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
        QueueStack queue = new QueueStack();
        queue.Enqueue(2);
        queue.Enqueue(4);
        queue.Enqueue(6);
        queue.Enqueue(8);
        queue.Enqueue(10);
        queue.Enqueue(12);
        System.out.println("Peek is : " + queue.Peek());
        System.out.println("Dequeue is : " + queue.Dequeue());
        queue.Enqueue(14);
        System.out.println("Peek is : " + queue.Peek());



    }
}
