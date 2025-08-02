package BinarySearchAlgorithm;

public class SingleElementSortedArray {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,4,4,5,5};
        int result = singleNonDuplicate(nums);
        System.out.println("The Single element in the array is : " + result);
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == nums[mid ^ 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }
}