package DSA1;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,2,1,6,3,4};
        CyclicSortNumbers(arr);
        System.out.println(" The sorted array is: " + Arrays.toString(arr));

    }
    static void CyclicSortNumbers(int[]arr){
        int i = 0;
        while(i < arr.length){
            int CorrectIndex = arr[i] - 1;
            if(arr[i] != arr[CorrectIndex]){
                swap(arr,i,CorrectIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
