import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Mastermind {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int pegs;
      int colors;
      
      System.out.print("Enter the number of pegs: ");
      pegs = input.nextInt();
      System.out.print("Enter the number of colors: ");
      colors = input.nextInt();
      
      int[] pegSequence = generatePegs(pegs, colors);
      int numGuesses = 1;
      while (true) {         
         System.out.println("\nGuess " + numGuesses + ":");
         if (makeGuess(pegSequence, input)) {
            break;
         }
         numGuesses++;
      }
      
      System.out.println("\nYou have broken the code in " + numGuesses + " guesses.");
   }
   
   public static int[] generatePegs(int pegs, int colors) {
      Random generator = new Random();
      int[] newSequence = new int[pegs];
      
      for (int i = 0; i < pegs; i++) {
         newSequence[i] = generator.nextInt(colors) + 1;
      } return newSequence;
   }
   
   public static boolean makeGuess(int[] pegSequence, Scanner input) {
      int[] guess = new int[pegSequence.length];
      ArrayList<Integer> toCheckColors = new ArrayList<Integer>();
      for (int i = 0; i < pegSequence.length; i++)
         toCheckColors.add(pegSequence[i]);
         
      int pegsCorrect = 0;
      int colorsCorrect = 0;
      
      for (int i = 0; i < pegSequence.length; i++) {
         System.out.print("Color for peg " + (i + 1) + ": ");
         guess[i] = input.nextInt();
         if (toCheckColors.contains(guess[i])) {
            colorsCorrect++;
            toCheckColors.remove(toCheckColors.indexOf(guess[i]));
            
            if (pegSequence[i] == guess[i]) {
               pegsCorrect++;
            }
         }
      }
      
      System.out.println("You have " + pegsCorrect + " peg(s) correct and " + colorsCorrect + " color(s) correct.");
      
      if (pegsCorrect == pegSequence.length) {
         return true;
      } return false;
   }
   
   /* public static boolean arrayContains(int[] array, int toFind) {
      boolean isInArray = false;
      
      for (int i = 0; i < array.length; i++) {
         if (array[i] == toFind) {
            isInArray = true;
            break;
         }
      } return isInArray;
   }*/
}