package DSA1;

public class Smallestletterceiling {
    public static void main(String[] args) {
        char[] letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v',
        'w','x','y','z'};
        char target = 'z';
        char ans = smallestletterceiling(letter,target);
        System.out.println(ans);

    }
    static char smallestletterceiling(char[]letter,char target){
        int start = 0;
        int end = letter.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < letter[mid]){
                end = end - 1;
            }else{
                start = start + 1;
            }
        }
        return letter[start % letter.length];
    }
}
