package DSA1;

import java.util.ArrayList;

public class PermutationRecursionArrayList {
    public static void main(String[] args) {
        ArrayList<String> answer = permutationList("","abc");
        System.out.println(answer);

    }
    static ArrayList<String> permutationList(String process , String unprocess){
        if(unprocess.isEmpty()){
            ArrayList<String> List = new ArrayList<>();
            List.add(process);
            return List;
        }
        char ch = unprocess.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= process.length(); i++) {
            String first = process.substring(0,i);
            String second = process.substring(i,process.length());
            ans.addAll(permutationList(first+ch+second,unprocess.substring(1)));


        }
        return ans;
    }
}
