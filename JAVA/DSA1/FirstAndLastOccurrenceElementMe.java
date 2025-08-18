package DSA1;

public class FirstAndLastOccurrenceElementMe {
    public static void main(String[] args) {
        int[]arr = {1,2,2,2,2,2,3,4,5,6,6,6,6,6,6,7,9};
        int target = 2;
        int first = FindFirst(arr, target);
        int last = FindLast(arr, target);
        if (first == -1){
            System.out.println("Element" + target + "not found in the array");
        }else{
            System.out.println(" Element "  + target + " is at index " +  first );
            System.out.println(" Element "  + target + " is at index " +  last );
        }



    }
    static int FindFirst(int[]arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                result =  mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            }else{
                end = mid - 1;
            }
        }
        return result;
    }
    static int FindLast(int[]arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                result = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            }else{
                end = mid - 1;
            }

        }
        return result;
    }
}
