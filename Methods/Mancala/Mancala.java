import java.util.Scanner;

public class Mancala {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] board = setupBoard();
      String[] boardIndices = {"", "A0", "B0", "C0", "D0", "E0", "F0", "", "A1", "B1", "C1", "D1", "E1", "F1"};
      boolean topTurn = true;
      printBoard(board);
      
      while (true) {
         if (topTurn) {
            System.out.println("\nTop Player's turn. Enter which pit to start in: ");
         } else {
            System.out.println("\nBottom Player's turn. Enter which pit to start in: ");
         }
         String pitChoice = input.nextLine();
         int pitIndex = boardIndices.indexOf(pitChoice + topTurn);
         System.out.println(pitIndex);
      }
   }
   
   public static int[] setupBoard() {
      int[] board = new int[14];
      for (int i = 0; i < board.length; i++) {
         if (i == 0 || i == 7) {
            board[i] = 0;
         } else {
            board[i] = 3;
         }
      }
      return board;
   }
   
   public static void printBoard(int[] board) {
      for (int i = 13; i >= 8; i--) {
         System.out.print(" " + board[i]);
      } System.out.println("\n" + board[0] + "\t\t\t\t" + board[7]);
      for (int i = 1; i <= 6; i++) {
         System.out.print(" " + board[i]);
      } System.out.println();
      for (char i = 'A'; i <= 'F'; i++) {
         System.out.print(" " + i);
      }
   }
}