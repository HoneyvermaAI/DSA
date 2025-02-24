import java.util.ArrayList;

public class MazeDiagonalPathArrayList {
    public static void main(String[] args) {
        System.out.println(MazeDiagonalPath("",3,3));
    }
    static ArrayList<String> MazeDiagonalPath(String process,int row,int column){
        if(row == 1 || column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && column > 1){
            //Here is the 'd' for diagonal path.
            list.addAll(MazeDiagonalPath(process + 'd',row - 1,column - 1));
        }
        if(row > 1){
            //Here is the 'D' for Down path.
            list.addAll(MazeDiagonalPath(process + 'D',row -1,column));
        }
        if(column > 1){
            //Here is the 'R' for right path.
            list.addAll(MazeDiagonalPath(process + 'R',row ,column - 1));
        }
        return list;
    }
}
