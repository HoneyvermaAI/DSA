package DSA1;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> AllDuplicateNumbers = AllDuplicates(arr);
        System.out.println("The Duplicate number is: " + AllDuplicateNumbers);


    }
    static List<Integer> AllDuplicates(int[]arr){
        int i = 0;
        while(i < arr.length){
            int CorrectIndex = arr[i] - 1;
            if(arr[i] != arr[CorrectIndex]){
                swap(arr,i,CorrectIndex);
            }else{
                i++;
            }
        }
        List<Integer> AllDuplicateNumbers = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1 ){
                AllDuplicateNumbers.add(arr[index]);
            }

        }
        return AllDuplicateNumbers;
    }
    static void swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
