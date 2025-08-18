package DSA1;

public class FindMagicNumber {
    public static void main(String[] args) {
        int number = 2;
        int base = 2;
        int ans = 0;
        while(number > 0){
            int last = number & 1;
           number =  number >> 1;
           ans = base * last;
           base = base * 2;

        }
        System.out.println(ans);

    }
}
