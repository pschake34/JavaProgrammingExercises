import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class EvensAndOdds {
   static Random randGen = new Random();
   
   public static void main(String[] args) {
      ArrayList<Integer> generatedNums = genRandomNums(25);
      ArrayList<Integer> evens = getEvenOrOdd(false, generatedNums);
      ArrayList<Integer> odds = getEvenOrOdd(true, generatedNums);
      
      System.out.println("\nODD:");
      displayArrayList(odds);
      System.out.println("\nEVEN:");
      displayArrayList(evens);
   }
   
   public static ArrayList<Integer> genRandomNums(int num) {
      ArrayList<Integer> numberStore = new ArrayList<Integer>();
      for (int i = 0; i < num; i++) {
         numberStore.add(randGen.nextInt(100));
      }
      return numberStore;
   }
   
   public static ArrayList<Integer> getEvenOrOdd(boolean odd, ArrayList<Integer> toBeDivided) {
      ArrayList<Integer> numberStore = new ArrayList<Integer>();
      int remainder = odd ? 1 : 0;
      for (int i = 0; i < toBeDivided.size(); i++) {
         if (toBeDivided.get(i) % 2 == remainder) {
            numberStore.add(toBeDivided.get(i));
         } 
      }
      return numberStore;
   }
   
   public static void displayArrayList(ArrayList<Integer> toDisplay) {
      for (int i = 0; i < toDisplay.size(); i++) {
         System.out.print(toDisplay.get(i) + " ");
      }
   }
}