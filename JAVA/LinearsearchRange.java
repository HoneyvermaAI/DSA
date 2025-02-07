public class LinearsearchRange {
    public static void main(String[] args) {
        int [] arr = {1,5,3,4,9,8,7,};
        int target = 3;
        System.out.println(linearrange(arr,target,1,4));

    }
    static int linearrange(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <=end ; index++) {
            int element = arr[index];
            if(element==target){
                return index;

        }

        }
        return -1;
    }
}
