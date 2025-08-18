package DSA1;

import java.util.Arrays;

public class Linearsearch2Darray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,5,8},
                {5,8,25,3,15},
                {85,65,554},
                {66,86,96,152}
        };
        int target = 8;
        int[] ans = linearsearch2Darray(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] linearsearch2Darray(int[][]arr,int target){
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                if(arr[rows][col]== target){
                    return new int[]{rows,col};
                }

            }

        }
        return  new int[]{-1,-1};
    }
}
