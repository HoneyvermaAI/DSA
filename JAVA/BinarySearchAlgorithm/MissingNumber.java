package BinarySearchAlgorithm;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4,5,6,8,9};
        int result = missingNumber(nums);
        System.out.println("The missing Number is: " + result);
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectsum = n*(n+1)/2;
        int actualsum = 0;
        for(int num : nums){
            actualsum += num;
        }
        return expectsum - actualsum;
        }
    }

