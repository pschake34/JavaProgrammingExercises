import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Mancala {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] board = setupBoard();
      List<String> boardIndices = Arrays.asList("", "A0", "B0", "C0", "D0", "E0", "F0", "", "F1", "E1", "D1", "C1", "B1", "A1");
      boolean topTurn = false;
      boolean extraTurn = false;
            
      while (true) {
         printBoard(board);
         int topTurnInt = (topTurn) ? 1 : 0;
         int pitIndex;
         int numStones;
         
         if (topTurn) {
            System.out.print("\nTop Player's turn. Enter which pit to start in: ");
         } else {
            System.out.print("\nBottom Player's turn. Enter which pit to start in: ");
         }

         while (true) {
            String pitChoice = input.nextLine().toUpperCase();
            pitIndex = boardIndices.indexOf(pitChoice + topTurnInt);
            numStones = board[pitIndex];
            if (numStones == 0) {
               System.out.print("No stones in pit. Try another one: ");
            } else {
               break;
            }
         }
         board[pitIndex] = 0;
         
         while (numStones > 0) {
            pitIndex++;
            if (pitIndex == 14) {
               pitIndex = 0;
            }
            
            if ((topTurn && pitIndex == 7) || (!topTurn && pitIndex == 0)) {
               pitIndex++;
            }
            
            board[pitIndex]++;
            numStones--;
            
            if (numStones == 0 && (pitIndex == 0 || pitIndex == 7)) {
               extraTurn = true;
            } 
            
            if (numStones == 0 && pitIndex != 0 && pitIndex != 7) {
               int oppositeTurnInt = !(topTurn) ? 1 : 0;
               String currentPit = boardIndices.get(pitIndex).substring(0, 1) + topTurnInt;
               
               if (board[boardIndices.indexOf(currentPit)] == 1 && ((topTurn && pitIndex > 7 && pitIndex != 0) || (!topTurn && pitIndex > 0 && pitIndex < 7))) {
                  int toAdd = 0;
                  toAdd += board[boardIndices.indexOf(currentPit.substring(0, 1) + oppositeTurnInt)];
                  board[boardIndices.indexOf(currentPit.substring(0, 1) + oppositeTurnInt)] = 0;
                  
                  if (topTurn) {
                     board[0] += toAdd;
                  } else {
                     board[7] += toAdd;
                  }
               }
            }
         }
         
         int topTotal = 0;
         int bottomTotal = 0;
         for (int i = 1; i < 7; i++) {
            bottomTotal += board[i];
         } for (int i = 8; i < 14; i++) {
            topTotal += board[i];
         }
         
         if (topTotal == 0) {
            board[7] += bottomTotal;
            break;
         } else if (bottomTotal == 0) {
            board[0] += topTotal;
            break;
         }
         
         if (!extraTurn) {
           if (topTurn) {
              topTurn = false;
           } else {
              topTurn = true;
           }
         } else {
            extraTurn = false;
         } 
      }
      
      int topTotal = board[0];
      int bottomTotal = board[7];
      
      if (topTotal > bottomTotal) {
         System.out.println("\n\nThe winner was the Top Player!");
      } else if (bottomTotal > topTotal) {
         System.out.println("\n\nThe winner was the Bottom Player!");
      } else {
         System.out.println("\n\nThe game ended in a tie!");
      } System.out.println("Final score was " + topTotal + " to " + bottomTotal + ".");
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