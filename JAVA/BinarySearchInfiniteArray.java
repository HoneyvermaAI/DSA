public class BinarySearchInfiniteArray {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,6,7,11,12,13,18,59,559,88889,1122562,451245350};
        int target = 12;
        System.out.println(" Element " + target + " is at index " + ans(arr,target));

    }
    static int ans(int[]arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[]arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            }else {
                return mid;
            }
        }
        return -1;

    }
}
