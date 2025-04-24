package TicTakToe;

import java.util.Scanner;

public class TicTakToe {
    public static void main(String[] args) {
        // Here is the Playing Board initialize.

        char[][] Board = new char[3][3];
        for (int row = 0; row < Board.length; row++) {
            for (int col = 0; col < Board[row].length; col++) {
              Board[row][col] = ' ';
            }
        }
        // Here is scanner which has been import.

        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        // Board will be printed till the game is not over.

        while(!gameOver){
            printBoard(Board);
            // Here scanner will take the inputs of both the players.

            System.out.println("Player " + player + " enter : ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // This is for the players if they won.

            if(Board[row][col] == ' '){
                Board[row][col] = player;
                gameOver = haveWon(Board ,player);

                //This is for the switching when one player fill his spot so that it can switch to the other player.

                if(gameOver){
                    System.out.println("Player " + player + " Has won : ");
                }
                else {
                    if(player == 'X'){
                        player = 'O';
                    }
                    else {
                        player = 'X';
                    }
                }
            }
            else {
                System.out.println("Invalid move . Try again");
            }
        }
        printBoard(Board);
    }
    public static boolean haveWon(char[][] Board , char player) {
       // These are the winning conditions for a player. Either the row , col are same or diagonally same.

        for (int row = 0; row < Board.length; row++) {
            if (Board[row][0] == player && Board[row][1] == player && Board[row][2] == player) {
                return true;
            }
        }
        for (int col = 0; col < Board.length; col++) {
            if (Board[0][col] == player && Board[1][col] == player && Board[2][col] == player) {
                return true;
            }
        }
        if (Board[0][0] == player && Board[1][1] == player && Board[2][2] == player){
            return true;
        }
        if (Board[0][2] == player && Board[1][1] == player && Board[2][0] == player){
            return true;
        }
        return false;
    }
    public static void printBoard(char[][] Board) {
       // For printing the board.
        for (int row = 0; row < Board.length; row++) {
            for (int col = 0; col < Board[row].length; col++) {
                System.out.print(Board[row][col] + "  |");
            }
            System.out.println();
        }

    }
}
