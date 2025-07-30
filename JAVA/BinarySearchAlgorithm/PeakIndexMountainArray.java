package BinarySearchAlgorithm;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,4,2,1};
        int res = peakIndexInMountainArray( arr);
        System.out.println("The Peak element is at index : " + res);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid != 0 && mid != end && arr[mid]> arr[mid + 1] && arr[mid]> arr[mid -1] ){
                return arr [mid];
            }
            else if(mid != end && arr[mid] < arr[mid+1]){
                start++;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
