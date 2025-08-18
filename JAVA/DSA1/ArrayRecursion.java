package DSA1;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        System.out.println(find1(arr,target,0));
        System.out.println(findIndex(arr,target,0));

    }
    static boolean find1(int[] arr, int target , int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find1(arr,target, index + 1);
    }
    static int findIndex(int[] arr, int target , int index){
        if(index == arr.length){
            return -1;
        }
        if( arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr,target, index + 1);
        }
    }
}
