import java.util.Arrays;

import static java.util.Collections.swap;

public class SwapArraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[]arr,int  index2 , int index4 ){
       int temp = arr[index2];
       arr[index2] = arr[index4];
       arr[index4] = temp;


    }
}
