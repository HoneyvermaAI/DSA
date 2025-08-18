package DSA1;

public class MazeRestrictionPath {
    public static void main(String[] args) {
        boolean[][] board ={
                {true, true, true},
                {true, false, true},
                {true, true, true},

        };
        PathRestriction("",0,0,board);

    }

    static void PathRestriction(String process, int row, int column, boolean[][] maze) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(process);
            return;
        }
        if (!maze[row][column]) {
            return;
        }
        if (row < maze.length - 1) {
            PathRestriction(process + 'D', row + 1, column, maze);
        }
        if (column < maze[0].length - 1) {
            PathRestriction(process + 'R', row, column + 1, maze);
        }
    }
}