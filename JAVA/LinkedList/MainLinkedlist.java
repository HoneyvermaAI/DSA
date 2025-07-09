package LinkedList;

public class MainLinkedlist {
    public static void main(String[] args) {
        Questions list = new Questions();
        list.insertfirst(24);
        list.insertfirst(35);
        list.insertfirst(55);
        list.insertfirst(57);
        list.insertfirst(88);
        list.insertlast(2);
        list.insert(66,2);
        list.display();
        System.out.println(list.DeleteFirst());
        list.display();
        System.out.println(list.DeleteLast());
        list.display();
        System.out.println(list.Delete(3));
        list.display();
        System.out.println(list.Find(24));
        list.display();


    }
}
