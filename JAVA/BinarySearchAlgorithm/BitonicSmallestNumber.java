package BinarySearchAlgorithm;

public class BitonicSmallestNumber {
    public static void main(String[] args) {
        // Bitonic means First there will an increasing order than hava peak point than the decreasing order--->
        // example {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2}
        int arr[] = {2,4,5,11,7,5,1};
        int ans = Bitonic(arr);
        System.out.println("The smallest is : " + ans);
    }
    public static int Bitonic(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] < arr[end]){
            return arr[start];
        }
        else{
            return arr[end];
        }
    }
}
