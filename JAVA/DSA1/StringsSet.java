package DSA1;

public class StringsSet {
    public static void main(String[] args) {
        // In this the single object in heap memory is stored the same value; that by it gives true.
        //String a = "Honey";
        //String b = "Honey";
       // System.out.println(a==b);
        //Now we create two different objects of same value by using new string().
        //String name1 = new String("Honey");
        //String name2 = new String("Honey");
        //System.out.println(name1==name2);
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('A' + i);
            System.out.println( ch );

        }


    }


}
