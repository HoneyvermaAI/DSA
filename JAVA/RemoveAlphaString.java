public class RemoveAlphaString {
    public static void main(String[] args) {
        skip(" ","baccah");

    }
    static void skip(String process,String upprocess){
        if(upprocess.isEmpty()){
            System.out.println(process);
            return;

        }
        char ch = upprocess.charAt(0);
        if(ch == 'h'){
            skip(process,upprocess.substring(1));
        }
        else{
            skip(process + ch , upprocess.substring(1));
        }
    }
}
