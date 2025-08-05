package BinarySearchAlgorithm;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        boolean result = searchSortedMatrix(arr,15);
        System.out.println("Is the element is present in the matrix : " + result);
    }
    public static boolean searchSortedMatrix(int arr[][] , int target){
        if (arr.length == 0){
            return false;
        }
        int m= arr.length;
        int n = arr[0].length;
        int start = 0;
        int end = m*n-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            int r = mid / n;
            int c = mid % n;
            int val = arr[r][c];
            if (val == target){
                return true;
            } else if (val < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return false;
    }
}
