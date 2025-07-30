package BinarySearchAlgorithm;

public class RotatedArrayDuplicates {
    public static void main(String[] args) {
        int arr[] = {19,2,19,19,19,19,19};
       boolean res = Duplicates(arr,2);
        System.out.printf("Is the element is present in the array : " + res);

    }
    public static boolean Duplicates(int arr[] , int target){
        boolean ans = false;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return true;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
            }
            else if (arr[start] <= arr[end]){
                if (target >= arr[start] && target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }

            }
            else {
                if (target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }
}
