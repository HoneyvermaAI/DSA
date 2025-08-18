package DSA1;

public class MazeQuestion {
    public static void main(String[] args) {
        System.out.println(PathCount(2,2));
    }
    static int PathCount(int row , int column){
        if(row == 1|| column == 1){
            return 1;
        }
        int left = PathCount(row - 1, column);
        int right = PathCount(row,column - 1);
        return left + right;
    }
}
