import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

public class Bowling {
   public static void main(String[] args) {
      String filepath = "p417z.dat";
      Scanner sc = null;
      
      try {
         sc = new Scanner(new File(filepath));
      } catch (FileNotFoundException e) {
         e.printStackTrace();  
      }
      
      ArrayList<ArrayList> games = getGameInfo(sc);
      System.out.println(games);
      int game1 = printScore(games.get(0));
      System.out.println(game1);
   }
   
   public static ArrayList<ArrayList> getGameInfo(Scanner sc) {
      ArrayList<String> lines = new ArrayList<String>();
      ArrayList<ArrayList> games = new ArrayList<ArrayList>();
      
      while (sc.hasNextLine()) {
         lines.add(sc.nextLine());
      }
      
      for (int i = 0; i < lines.size(); i++) {
         ArrayList<Integer> game = new ArrayList<Integer>();
         Scanner sc2 = new Scanner(lines.get(i));
         
         while (sc2.hasNext()) {
            game.add(sc2.nextInt());
         }
         games.add(game);
      } return games;
   }
   
   public static int printScore(ArrayList<Integer> rolls) {
      int totalScore = 0;
      int i = 0;
      int turns = 1;
      int[] turnTotals = new int[10];
      
      System.out.print("\t");
      for (int j = 1; j < 11; j++) {
         System.out.print(j + "\t\t");
      }
      
      while (turns < 11) {
         int turnScore = 0;
         
         if (rolls.get(i) == 10) {
            turnScore += 10;
            
            if (i < rolls.size() - 2) {
               turnScore += rolls.get(i+1);
               turnScore += rolls.get(i+2);
            } else if (i < rolls.size() - 1) {
               turnScore += rolls.get(i+1);
            }
            i++;
         } else if (rolls.get(i) + rolls.get(i+1) == 10) {
            turnScore += 10;
            
            if (i < rolls.size() - 2) {
               turnScore += rolls.get(i+2);
            }
            i += 2;
         } else {
            turnScore += rolls.get(i);
            turnScore += rolls.get(i+1);
            i += 2;
         }
         totalScore += turnScore;
         turnTotals[turns-1] = totalScore;
         turns++;
         System.out.println(turnScore);
      } return totalScore;
   }
}