public class PermutationRecursion {
    public static void main(String[] args) {
        Permutation("","abc");

    }
    static void Permutation(String process, String unprocess) {
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        for (int i = 0; i <= process.length(); i++) {
            String first = process.substring(0,i);
            String second = process.substring( i , process.length());
            Permutation(first + ch + second , unprocess.substring(1));

        }
    }
}
