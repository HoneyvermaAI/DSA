public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {-15,-13,-11,-8,-3,0,5,9,11,15,19,28,36,54,86};
        int target = 86;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int[]arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = end - 1;

            } else if (target > arr[mid]) {
                start = start + 1;

            }
            else
                return mid;

        }
        return -1;
    }
}
