package DSA1;

import java.util.ArrayList;

public class MazePathArrayList {
    public static void main(String[] args) {
        System.out.println(pathret("",3,3));

    }
    static ArrayList<String> pathret(String process , int row , int column){
        if(row == 1 || column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
            list.addAll(pathret(process + 'D',row - 1, column));

            }
        if(column > 1){
            list.addAll(pathret(process + 'R',row , column - 1));

        }
        return list;
        }
    }
