package LinkedList;

public class SinglyLinkedlist {
    private node head;
    private node tail;
    private int size;
    public SinglyLinkedlist(){
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
