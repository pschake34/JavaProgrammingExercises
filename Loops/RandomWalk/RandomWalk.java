import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class RandomWalk {
   public static void main(String[] args) {
      Random rand = new Random();
      int numTrials = 50;
      int bestRun = 0;
      List<Integer> trialData = new ArrayList<>();
      
      for (int i = 0; i < numTrials; i++) {
         int pos = 3;
         int counter = 0;
         while (pos != 0 && pos != 7) {
            if (rand.nextInt(2) == 0) {
               pos++;
            } else {
               pos--;
            }
            counter++;
         }
         trialData.add(counter);
         
         if (counter > bestRun) {
            bestRun = counter;
         }
      }
      
      int average = 0;
      for (int i = 0; i < trialData.size(); i++) {
         average += trialData.get(i);
      }
      
      average /= trialData.size();
      
      System.out.println("The average number of steps was: " + average);
      System.out.println("The best run was: " + bestRun);
   }
}