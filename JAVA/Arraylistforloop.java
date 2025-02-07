
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistforloop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList <Integer> list = new ArrayList<>();
        System.out.println("Enter the Integer: ");

        for (int i = 0; i < 8; i++) {
            list.add(input.nextInt());

        }
        System.out.println("The Integer that you stored "+(list));


    }
}
