import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearElement {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> MissingNumber = FindDisappearElement(arr);
        System.out.println("The missing Element in the array is: " + MissingNumber);

    }
    static List<Integer> FindDisappearElement(int[] arr){


        int i = 0;
        while (i < arr.length){
            int CorrectIndex = arr[i] - 1;
            if(arr[i] != arr[CorrectIndex]){
                swap(arr,i,CorrectIndex);
            }else{
                i++;
            }
        }
        List<Integer> MissingNumber = new ArrayList<>();
        for (int Index = 0; Index < arr.length; Index++) {
            if(arr[Index] != Index + 1){
                MissingNumber.add(Index + 1);
            }

        }
        return MissingNumber;
    }
    static void swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
