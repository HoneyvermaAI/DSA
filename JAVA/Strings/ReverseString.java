package Strings;

public class ReverseString {
    public static void main(String[] args) {
        reverseString2("ABCDE");
    }
    //st Method to Reverse a string.
//    public static void reverseString(String input){
//        String ans = " ";
//        for (int i = 0; i < input.length(); i++) {
//            ans = input.charAt(i) + ans;
//        }
//        System.out.println(ans);
//    }

    // 2nd Method to reverse a string.
    public static void reverseString2(String input){
        StringBuilder ans = new StringBuilder(input);
        int n = ans.length();
        for (int i = 0; i < n/2; i++) {
            char first = ans.charAt(i);
            char last = ans.charAt(n-1-i);
             ans.setCharAt(i,last);
               ans.setCharAt(n-1-i , first);
        }
        System.out.println(ans.toString());
    }

}
