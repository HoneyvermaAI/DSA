package LinkedList;

import java.util.LinkedList;

public class Questions {
    private node head;
    private node tail;
    private int size;
    public Questions(){
        this.size = 0;
    }
    public void insertfirst(int val){
        node Node = new node(val);
        Node.next = head;
        head = Node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertlast(int val){
        if(tail == null){
            insertfirst(val);
            return;
        }
        node Node = new node(val);
        tail.next = Node;
        tail = Node;
        size++;
    }
    public void insert(int val,int index){
        if(index == 0){
            insertfirst(val);
            return;
        }
        if(index == size){
            insertlast(val);
            return;
        }
        node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        node Node = new node(val,temp.next);
        temp.next = Node;
        size++;
    }
    public int DeleteLast(){
        if(size <= 1){
            return DeleteFirst();
        }
        node SecondLast = get(size - 2);
        int val = tail.value;
        tail = SecondLast;
        tail.next = null;
        return val;
    }
    public int Delete(int index){
        if(index == 0){
            return DeleteFirst();
        }
        if(index == size - 1){
            return DeleteLast();
        }
        node previous = get(index - 1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }
    public node Find(int value){
        node Node = head;
        while (Node != null){
            if(Node.value == value){
                return Node;
            }
            Node = Node.next;
        }
        return null;
    }
    public node get(int index){
        node Node = head;
        for (int i = 0; i < index; i++) {
            Node = Node.next;
        }
        return Node;
    }
    public int DeleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public void duplicates(){
        node Node = head;
        while(Node.next != null){
            if(Node.value == Node.next.value){
                Node.next = Node.next.next;
                size--;
            }
            else{
                Node = Node.next;
            }
        }
        tail = Node;
        tail.next = null;
    }
    public void display(){
        node temp = head;
        while (temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class node{
        private int value;
        private node next;
        public node(int value){

            this.value = value;
        }
        public node(int value,node next){
            this.value = value;
            this.next = next;
        }

    }
}
// Merge sort Questions
