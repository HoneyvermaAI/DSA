package BinarySearchAlgorithm;

public class SmallestDivisorThreshold {
    public static void main(String[] args) {
        int []nums = {1,2,5,9,11,12,15};
      int result =  smallestDivisor(nums,10);
        System.out.println("The smallest Divisor is : " + result);
    }

    public  static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > end) {
                end = nums[i];
            }

        }
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isDivisible( nums, mid, threshold)) {
                res = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return res;
    }
   public static boolean isDivisible(int[] nums , int divisor , int threshold){
        int sumOfAllDivisor = 0;
        for (int i = 0; i < nums.length; i++) {
            sumOfAllDivisor += nums[i]/divisor;
            if (nums[i] % divisor != 0){
                sumOfAllDivisor += 1;
            }
            if (sumOfAllDivisor > threshold){
                return false;
            }
        }
        return true;
    }
}
