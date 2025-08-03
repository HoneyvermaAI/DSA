package TernarySearch;

public class TernarySearchInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,12,15,16,18,19};
        int result = ternarySearch(arr, 22);
        if (result == -1) {
            System.out.println("Element is not present in the array");
        }else{
            System.out.println("Element is present at index : " + result);
        }
    }

    public static int ternarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while (start <= end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;

            if (target <= arr[mid1]) {
                if (target == arr[mid1]) {
                    index = mid1;
                    break;
                }
                end = mid1 - 1;
            } else if (target >= arr[mid2]) {
                if (target == arr[mid2]){
                    if (target == arr[mid2]){
                        index = mid2;
                        break;
                    }
                    start = mid2 +1;
                }
                else {
                    start = mid1 + 1;
                    end  = mid2 -1;
                }

            }
        }
        return index;
    }
}
