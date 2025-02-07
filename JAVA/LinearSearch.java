public class LinearSearch {
    public static void main(String[] args) {
        int[]num = {15,56,5,84,24,1254,451,421,5,2,50,4,0,51,451,42,452,15,412,5};
        int target = 13;
        int ans = linearseach(num, target);
        System.out.println("The element is present at:"  +  (ans));

    }
    static int linearseach(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int Element = arr[index];
            if(Element == target) {
                return index;
            }
        }
        return -1;
    }
}
