package DSA1;

public class BinarySearchDescendingOrder {
    public static void main(String[] args) {
        int[]arr = {95,82,73,62,58,49,35,26,15,2,1};
        int target = 73;
        int ans = binearydecendingsearch(arr,target);
        System.out.println(ans);

    }
    static int binearydecendingsearch(int[]arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target>arr[mid]){
                end = end - 1;
            }
            else if(target<arr[mid]){
                start = start + 1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
}
