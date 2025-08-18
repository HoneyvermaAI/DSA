package DSA1;

public class MazePath {
    public static void main(String[] args) {
        path("",3,3);

    }
    static void path(String process, int row, int column){
        if(row == 1||column == 1){
            System.out.println(process);
            return;
        }
        if(row > 1){
            path(process +'D',row - 1, column);
        }
        if(column > 1){
            path(process +'R', row ,column - 1);
        }
    }
}
