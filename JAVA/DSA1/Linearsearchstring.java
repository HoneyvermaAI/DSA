package DSA1;

public class Linearsearchstring {
    public static void main(String[] args) {
        String Name = "honeyverma";
        char target = 'h';

        System.out.println(search(Name,target));
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;

        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }

        }
        return false;

    }
}
