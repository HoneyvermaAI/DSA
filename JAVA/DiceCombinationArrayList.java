import java.util.ArrayList;

public class DiceCombinationArrayList {
    public static void main(String[] args) {
        System.out.println(DiceRet("",4));

    }
    static ArrayList<String> DiceRet(String process , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i<= target; i++) {
            list.addAll(DiceRet(process + i, target - i));

        }
        return list;
    }
}
