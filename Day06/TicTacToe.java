import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {
   
    public static void main(String[] args) throws IOException {

		File myFile = new File("tictactoe.txt");
        char[][] board = new char[3][3];

		Scanner inputFile = new Scanner(myFile);
        int row = 0;

        // read in the tic-tac-toe board from the file
        while (inputFile.hasNext()) {
            String myStr = inputFile.nextLine();
            board[row] = myStr.toCharArray();
            row++;
        }
        inputFile.close();

        //check if O wins...
        //this isn't quite complete
        for (int r=0; r<3; r++) {
            int count = 0;
            for (int c=0; c<3; c++) {
                if (board[r][c] == 'O') {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("O wins!!!");
            }
        } 



    }


}