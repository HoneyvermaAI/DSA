public class OrderAgnosticBinearysearch {
    public static void main(String[] args) {
        int[] arr = {95,82,73,62,58,49,35,26,15,2,1};
        int target = 73;
        int ans = orderagnosticbinearysearch(arr,target);
        System.out.println(ans);

    }
    static int orderagnosticbinearysearch(int[]arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;

                }else{
                    start = mid + 1;
                }

            }else {
                if(target > arr[mid]){
                    end = mid - 1;

                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
