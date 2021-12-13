import java.util.Random;

public class RandomStats {
   public static void main(String[] args) {
      Random generator = new Random();
      int[] generatedNums = new int[500];
      int[] ocurrences = new int[10];
      
      for (int i = 0; i < generatedNums.length; i++) {
         generatedNums[i] = generator.nextInt(10);
         ocurrences[generatedNums[i]]++;
      }
      
      display(ocurrences);
   }
   
   public static void display(int[] ocurrences) {
      System.out.println("Number\tOcurrences");
      for (int i = 0; i < ocurrences.length; i++) {
         System.out.println(i + "\t\t\t" + ocurrences[i]);
      }
   }
}