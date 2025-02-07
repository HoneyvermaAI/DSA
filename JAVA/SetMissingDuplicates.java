import static java.lang.System.*;

public class SetMissingDuplicates {
    public static void main(String[] args) {
        int[]arr = {1,2,2,4};
         int[] result = MissingDuplicates(arr);
         System.out.println("Duplicate is: " + result[0] + " and Missing is:  " + result[1]);
    }
    static int[]  MissingDuplicates(int[]arr){
        int i = 0;
        while(i < arr.length){
            int CorrectIndex = arr[i] - 1;
            if(arr[i] != arr[CorrectIndex]){
                swap(arr,i,CorrectIndex);
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                return new int[] {arr[index],index + 1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
