package DSA1;

public class Phonepad {
    public static void main(String[] args) {
        pad("","12");

    }
    static void pad(String process , String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        int digit = unprocess.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            pad(process + ch , unprocess.substring(1));

        }
    }
}
