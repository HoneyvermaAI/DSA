package InsertionSort;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int arr[] = {112,56,46,45,4,2,1,6,152,21};
       int result =  insertionSort(arr);
        System.out.println("The sorted array is : " + result);

    }
    public static int insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i <n ; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] > key){
                arr [ j+ 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return n;
    }
}
