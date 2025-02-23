public class DiceCombinationQuestion {
    public static void main(String[] args) {
        Dice("",4);

    }
    static void Dice(String process , int target){
        if(target == 0){
            System.out.println(process);
            return;
        }
        for (int i = 1; i <= 6 && i <= target ; i++) {
            Dice(process + i , target - i);
        }
    }
}
