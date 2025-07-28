package BinarySearchAlgorithm;

public class AbsoluteMinimumDifference {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,15,20,25,30,65};
        MinimumAbsoluteDifference(arr,16);
    }
    public static void MinimumAbsoluteDifference(int arr [] , int target){
        if(arr.length == 0){
            return;
        }

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        int res = 0;
        if(ans == -1){
            if(end == -1){
                res = Math.abs(target - arr[start]);
            } else if (start == arr.length) {
                res = Math.abs(target - arr[end]);
            }
            else{
                int ans1 = Math.abs(target - arr[start]);
                int ans2 = Math.abs(target - arr[end]);
                res = Math.min(ans1, ans2);
            }
        }
        System.out.println("The minimum absolute difference is : " + res);
    }
}
