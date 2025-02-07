public class Setbits {
    public static void main(String[] args) {
        int number = 29;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(SetBitCount(number));
    }
    static int SetBitCount(int number){
        int count = 0;
        while(number > 0){
            count++;
            number -= (number & -number);
        }
        return count;
    }
}
