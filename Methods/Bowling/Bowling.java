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
      int numGames;
      int gamesTotal = 0;
      
      for (numGames = 0; numGames < games.size(); numGames++) {
         System.out.println("\n\nGame " + (numGames+1) + ":");
         gamesTotal += printScore(games.get(numGames));
      }
      int seriesAvg = gamesTotal / numGames;
      System.out.println("\n The bowler's series average was: " + seriesAvg);
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
      
      //start of display header
      System.out.print("\t");
      for (int j = 1; j < 11; j++) {
         System.out.print(j + "\t\t");
      }System.out.println("\n--------------------------------------------------------------------  ");
      
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
            
            System.out.print("| | |X");
            
            if (turns == 10) {
               System.out.print("| |" + rolls.get(i+1) + "|" + rolls.get(i+2));
            }
            
            i++;
         } else if (rolls.get(i) + rolls.get(i+1) == 10) {
            turnScore += 10;
            
            if (i < rolls.size() - 2) {
               turnScore += rolls.get(i+2);
            }
            
            System.out.print("| |" + rolls.get(i) + "|/");
            
            if (turns == 10) {
               System.out.print("| |" + rolls.get(i+2));
            }

            i += 2;
         } else {
            turnScore += rolls.get(i);
            turnScore += rolls.get(i+1);
            char roll1, roll2;
            if (rolls.get(i) == 0) {
               roll1 = '-';
            } else {
               roll1 = (char) (rolls.get(i) + '0');
            } if (rolls.get(i+1) == 0) {
               roll2 = '-';
            } else {
               roll2 = (char) (rolls.get(i+1) + '0');
            }
            
            System.out.print("| |" + roll1 + "|" + roll2);
            i += 2;
         }
         totalScore += turnScore;
         turnTotals[turns-1] = totalScore;
         turns++;
      } System.out.println("|");
      
      for (int j = 0; j < turnTotals.length; j++) {
         String spacing = "\t  ";
         if (turnTotals[j] / 100 >= 1) {
            spacing = "  ";
         } else if (turnTotals[j] / 10 >= 1) {
            spacing = "\t ";
         }
         
         System.out.print("|" + spacing + turnTotals[j]);
      } System.out.println("|");
      
      return totalScore;
   }
}