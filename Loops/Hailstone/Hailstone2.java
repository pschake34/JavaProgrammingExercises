import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hailstone2 {
   public static void main(String[] args) {
      int upperLimit = 200;
      int mostIterations = 0;
      int mostIterNum = 0;
      
      for (int i = 1; i <= upperLimit; i++) {
         int iterations = hailStone(i);
         System.out.println(i + " had " + iterations + " iterations.");
         
         if (iterations > mostIterations) {
            mostIterations = iterations;
            mostIterNum = i;
         }
      }
      
      System.out.println("The number with the most iterations was " + mostIterNum + " with " + mostIterations);
   }
   
   public static int hailStone(int initialNum) {
      List<Integer> searchSequence = Arrays.asList(4, 2, 1, 4, 2, 1);
      List<Integer> currentSequence = new ArrayList<>();
      currentSequence.add(initialNum);
      int currentNum = initialNum;
      int counter = 0;
      
      while (Collections.indexOfSubList(currentSequence, searchSequence) == -1) {
         if (currentNum % 2 == 0) {
            currentNum /= 2;
         } else {
            currentNum = (currentNum * 3) + 1;
         }
         currentSequence.add(currentNum);
         counter++;
         
         if (counter > 1000) {
            break;
         }
      }
      return counter;
   }
}