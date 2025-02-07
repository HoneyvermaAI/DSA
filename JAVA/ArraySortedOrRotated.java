public class ArraySortedOrRotated {
    public static void main(String[] args) {
        int[]arr ={3,4,5,1,2};
        boolean ans = CheckRotated(arr);
        System.out.println(ans);

    }
    static boolean CheckRotated(int[] arr){
       
        int num = arr.length;
        int[] checksorted = new int[num];
        for (int Rotation = 0; Rotation < num; Rotation++) {
            int currentIndex = 0;
            for (int index = Rotation; index < num; index++) {
                checksorted[currentIndex++]= arr[index];
                
            }
            for (int index = 0; index <Rotation; index++) {
                checksorted[currentIndex++]= arr[index];

            }
            boolean isSorted = true;
            for (int index = 0; index < num - 1; index++) {
                if(checksorted[index]>checksorted[index +1]){
                    isSorted = false;
                    break;
                }

            }
            if(isSorted){
                return true;
            }
            
        }
        return false;
    }
}
