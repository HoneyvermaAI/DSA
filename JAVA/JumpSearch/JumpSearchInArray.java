package JumpSearch;

public class JumpSearchInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,20,30,50,100,125,170,195};
        int result = jumpSearch(arr,170);
        if (result == -1){
            System.out.println("Element is not found in the array");

        }else {
            System.out.println("The element is found at the index : " + result);
        }
    }
    public static int jumpSearch(int arr[] , int target){
        int n = arr.length;
        int blockSize = (int) Math.sqrt(n); // for define the blockSize like small packages---->
        int startIndex = 0;
        int endIndex = blockSize; // End will be the last index of the block--->

        while(endIndex < n && arr[endIndex] <= target){ // Number of the iteration till the condition is satisfied;
            startIndex = endIndex; // The start will become the endIndex of the block--->
            endIndex += blockSize; // end will be the last index of the current block and the sqrt of the next block--->
            if (endIndex > n){     // if the EndIndex Reach to the Array out of Bound--->
                endIndex = n;
            }
        }
        int res = -1;
        for (int i = startIndex; i < endIndex; i++) { // simple linear search--->
            if (target == arr[i]){
                res = i;
            }
        }
        return res;
    }
}
