package DSA1;

public class Subsequence {
    public static void main(String[] args) {
        Subseq("" , "abc");

    }
    static void Subseq(String process , String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        Subseq(process + ch,unprocess.substring(1));
        Subseq(process,unprocess.substring(1));
    }
}
