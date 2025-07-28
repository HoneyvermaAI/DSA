package LinearSearchAlgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,0,7,28,29};
//        linearSearch(arr,5, false);
//        linearSearchMultiple(arr,5);
//        findMax(arr);
        findMin(arr);
    }
    public static void findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element in the array is : " + min);
    }
    public static void findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is : " + max);
    }
    public static void linearSearchMultiple(int arr [] , int target){
        int ans[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }
            if(k == 0){
                System.out.println("Element is not found in the array");
            }
            else {
                for (int i = 0; i < k; i++) {
                    System.out.println("Element is present at " + ans[i] + " index");


            }
        }

    }
    public static void linearSearch(int arr[], int target, boolean findlast){
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                ans = i;
                if (findlast == false){
                    break;
                }
            }
        }
        if (ans == -1){
            System.out.println("Element is not found in the array");
        }
        else {
            System.out.println("Element is Fount at " + ans +" index ");
        }
    }
}

