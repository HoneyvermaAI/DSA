package BinarySearchAlgorithm;

public class BSFloorAndCeiling {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,9};
        int ans = BSFloor(arr,0);
        System.out.println("The Floor is : " +ans);
        int ans1 = BSCeiling(arr,0);
        System.out.println("The Ceiling is : " +ans1);
    }
    public static int BSFloor(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(arr[mid] == target){
                ans = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
                //  The Smallest value may the possible answer....>
                ans = arr[mid];
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static int BSCeiling(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(arr[mid] == target){
                ans = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
                //  The Smallest value may the possible answer....>
                ans = arr[mid];
            }
            else {
                end = mid - 1;
                //  The greatest value may the possible answer....>
                ans = arr[mid];
            }
        }
        return ans;
    }
}
