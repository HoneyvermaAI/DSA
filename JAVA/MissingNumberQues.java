public class MissingNumberQues {
    public static void main(String[] args) {
        int[]arr = {4,0,1,2,3};
        int Missing = MissingNum(arr);
        System.out.println(Missing);

    }
    static int MissingNum(int[]arr){
        int i = 0;
        while(i < arr.length){
            int CorrectIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[CorrectIndex]){
                swap(arr,i,CorrectIndex);
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index] != index){
                return index;
            }

        }
        return arr.length;
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
