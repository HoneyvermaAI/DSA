package DSA1;

import static sun.swing.MenuItemLayoutHelper.max;

public class Maxvalue {
    public static void main(String[] args) {
        int[] arr = {1,5,85,235,4551,4156456};
        System.out.println(max(arr));
    }
    static int Max (int[]arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}

