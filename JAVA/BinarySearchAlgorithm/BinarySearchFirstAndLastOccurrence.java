package BinarySearchAlgorithm;

public class BinarySearchFirstAndLastOccurrence {
    public static void main(String[] args) {
        int arr[] = {2,2,2,4,4,4,4,4,5,6,8,9,10};
        binarySearchFirstAndLastOccurrence(arr,4,true);
    }
    public static void binarySearchFirstAndLastOccurrence(int arr[] , int target , boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                if (isFirst){
                    end = mid -1;
                }
                else {
                    start  = mid +1;

                }
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
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
