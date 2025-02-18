public class SkipWordString {
    public static void main(String[] args) {
        System.out.println(SkipWord("honeyapplemangonuts"));

    }
    static String SkipWord(String upprocess){
        if(upprocess.isEmpty()){
            return "";
        }
        if(upprocess.startsWith("apple")){
            return SkipWord(upprocess.substring(5));

        }else{
            return upprocess.charAt(0) + SkipWord(upprocess.substring(1));
        }
    }

}
