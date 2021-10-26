import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hailstone1 {
   public static void main(String[] args) {
      int upperLimit = 200;
      boolean allHailstone = true;
      
      for (int i = 1; i <= upperLimit; i++) {
         boolean isHailstone = hailStone(i);
         System.out.println(i + " is hailstone: " + isHailstone);
         
         if (!isHailstone) {
            allHailstone = false;
         }
      }
      
      System.out.println("Are all hailstone? " + allHailstone);
   }
   
   public static boolean hailStone(int initialNum) {
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
         
         if (counter > 10000) {
            break;
         }
      }
      if (counter < 10000) {
         return true;
      }
      return false;
   }
}