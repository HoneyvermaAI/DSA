import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {5,4,2,3,1};
        Selection(arr);
        System.out.println("The sorted array is : " + Arrays.toString(arr));

    }
    static void Selection(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = GetMaxIndex(arr,0,last);
            SwapNumber(arr,maxIndex,last);

        }
    }
    static void SwapNumber(int[]arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int GetMaxIndex(int[]arr, int start , int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
            
        }
        return max;

    }
}
