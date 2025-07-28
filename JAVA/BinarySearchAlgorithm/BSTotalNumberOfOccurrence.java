package BinarySearchAlgorithm;

public class BSTotalNumberOfOccurrence {
    public static void main(String[] args) {
        int arr[] = {2,2,4,4,4,4,4,4,5,6,8,9};
        int first = BSTotalOccurrence(arr,58,true);
        int second = BSTotalOccurrence(arr,58,false);
        int range = (second - first + 1);
        if(first == -1){
            System.out.println("The total number of Occurrence is : " + 0);
        }else {
            System.out.println("The total number of Occurrence is : " + range);
        }

    }
    public static int BSTotalOccurrence(int[] arr, int target , boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if (arr[mid] == target){
                ans = mid;
                if (isFirst){
                    end = mid - 1;
                }
                else {
                    start = mid +1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
