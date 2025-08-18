package DSA1;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3,4,6,6,5};
        System.out.println(ans(arr));

    }
    static int ans(int[]arr){
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            unique ^= n;

        }
        return unique;
    }
}
