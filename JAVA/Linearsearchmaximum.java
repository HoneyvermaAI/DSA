public class Linearsearchmaximum {
    public static void main(String[] args) {
        int[] arr ={5,5,34,28,23,15,0};
        System.out.println(max(arr));
    }
    static int max(int[]arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>ans){
                ans = arr[i];
            }

        }
        return ans;

    }
}


