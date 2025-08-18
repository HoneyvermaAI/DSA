package Strings;

public class substrings {
    public static void main(String[] args) {
        subStrings("abcde");
    }
    public static void subStrings(String input){
        int n = input.length();
        for (int starting = 0; starting < n; starting++) {
            for (int ending = starting + 1; ending <= n ; ending++) {
                System.out.println(input.substring(starting,ending));

            }

        }
    }
}
