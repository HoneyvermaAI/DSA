package JavaOOps.Generics;

import java.util.ArrayList;

public class CustomArrayList {
    public static void main(String[] args) {
       // ArrayList list = new ArrayList();
        //list.add(86);
       // list.add(88);
       // list.remove(1);
        //list.size();
       // System.out.println(list);
        ArrayList<String> list = new ArrayList<>();
       // list.add(25);
        //list.add(13);
        list.add("Honeyvermaa");
        list.add("Satyam");
        list.add("Suraj");
        list.add("Jaskeerat");
        list.add("Shantanu");
        list.add("Pawan");
       list.remove(0);
        System.out.println(list);

    }
}
