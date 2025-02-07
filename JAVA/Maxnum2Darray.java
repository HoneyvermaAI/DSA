public interface Maxnum2Darray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,5,8},
                {5,8,25,3,15},
                {85,65,554},
                {66,86,96,152}
        };
        System.out.println(max(arr));
    }
    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if(arr[rows][cols] > max){
                    max = arr[rows][cols];
                }

            }


        }
        return max;

    }
}
