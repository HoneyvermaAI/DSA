public class FindPivotBinarySearch {
    public static void main(String[] args) {
        int[]arr = {4,5,6,7,0,1,2,3};
        int ans = FindPivot(arr);
        System.out.println(" The pivot is at index "+ ans);

    }
    static int FindPivot(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > end && arr[mid] < arr[mid -1]) {
                return mid - 1;
            }
            if(arr[mid]<= arr[start]){
                end = end - 1;
            }
            else{
                start = start + 1;
            }
        }
        return -1;
    }
}
