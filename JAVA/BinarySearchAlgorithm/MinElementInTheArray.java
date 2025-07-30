package BinarySearchAlgorithm;

public class MinElementInTheArray {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int res = minElement(arr);
        System.out.println("The minimum element in the array is :  " + res);
    }
    public static int minElement(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        int minElement = Integer.MAX_VALUE;
        while (start <= end){
            int mid = start + (end - start)/ 2;
            if (arr[start] <= arr[mid]){
                minElement = Math.min(minElement , arr[start]);
                start = mid + 1;
            }
            else {
                minElement = Math.min(minElement , arr[end]);
                end = mid - 1;
            }
        }
        return minElement;
    }
}
