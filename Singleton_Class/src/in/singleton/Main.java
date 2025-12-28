package in.singleton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        // Initialize board
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {

            printBoard(board);
            System.out.println("Player " + player + " enter row and column (0-2):");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Boundary check
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid position! Enter values between 0 and 2.");
                continue;
            }

            // Invalid move check
            if (board[row][col] != ' ') {
                System.out.println("Cell already occupied. Try again!");
                continue;
            }

            // Place move
            board[row][col] = player;

            // Win check
            if (haveWon(board, player)) {
                printBoard(board);
                System.out.println("🎉 Player " + player + " wins!");
                gameOver = true;
            }
            // Draw check
            else if (isDraw(board)) {
                printBoard(board);
                System.out.println("🤝 Game Draw!");
                gameOver = true;
            }
            // Switch player
            else {
                player = (player == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    // WIN CONDITIONS
    public static boolean haveWon(char[][] board, char player) {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {
                return true;
            }
        }

        // Columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) {
                return true;
            }
        }

        // Diagonals
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }

        return false;
    }

    // DRAW CONDITION
    public static boolean isDraw(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // PRINT BOARD
    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}

