package BinarySearchAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,8,9,12,36,38,59};
        int arr2[] = {90,82,46,32,22,21,20,16,14,13,8,5,3,1};
//        binarySearch(arr,3);
        binarySearchDesc(arr2,3);
    }
    //Sorted in ascending order.....>
    public static void binarySearch(int arr[] , int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        if(ans == -1){
            System.out.println("Element is not present in the array");
        }
        else {
            System.out.println("Element " + target + " is present at the " + ans + " index");
        }
    }
    //Sorted in descending order.....>
    public static void binarySearchDesc(int arr2[] , int target){
        int ans = -1;
        int start = 0;
        int end = arr2.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr2[mid] == target){
                ans = mid;
                break;
            }
            else if (arr2[mid] < target) {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        if(ans == -1){
            System.out.println("Element is not present in the array");
        }
        else {
            System.out.println("Element " + target + " is present at the " + ans + " index");
        }
    }
}

