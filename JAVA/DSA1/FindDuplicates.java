package DSA1;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = Duplicates(arr);
        System.out.println("The duplicate element is: " + ans);

    }
    static int Duplicates(int[] arr){
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int CorrectIndex = arr[i] - 1;
                if (arr[i] != arr[CorrectIndex]) {
                    swap(arr, i, CorrectIndex);
                } else {
                   return arr[i];

                }
            }else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
