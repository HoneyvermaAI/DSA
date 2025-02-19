import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubsequenceArraylistReturn {
    public static void main(String[] args) {
        System.out.println(Subseqreturn("","abc"));

    }

    static ArrayList<String> Subseqreturn(String process, String unprocess) {
        if(unprocess.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        char ch = unprocess.charAt(0);
        ArrayList<String> left = Subseqreturn(process + ch,unprocess.substring(1));
        ArrayList<String> right = Subseqreturn(process,unprocess.substring(1));
        left.addAll(right);
        return left;

    }
}
