package DSA1;

public class SkipWordString {
    public static void main(String[] args) {
        System.out.println(SkipWord("honeyapplemangonuts"));

    }
    static String SkipWord(String unprocess){
        if(unprocess.isEmpty()){
            return "";
        }
        if(unprocess.startsWith("apple")){
            return SkipWord(unprocess.substring(5));

        }else{
            return unprocess.charAt(0) + SkipWord(unprocess.substring(1));
        }
    }

}
