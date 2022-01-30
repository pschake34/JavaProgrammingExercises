import java.util.ArrayList;

public class GeneratedNums {
   public static void main(String[] args) {
      int[] nums = new int[101];
      
      for (int i = 0; i < nums.length; i++) {
         nums[i] = generateNum(i);
      }
      
      display(nums);
   }
   
   public static int generateNum(int index) {
      int generated = index;
      for (int i = index; i > 0; i /= 10) {
         generated += i % 10;
      } return generated;
   }
   
   public static void display(int[] toDisplay) {
      System.out.println("Index\t\tGenerated Number");
      
      for (int i = 0; i < toDisplay.length; i++) {
         if (i >= 100) {
            System.out.println(i + "\t\t" + toDisplay[i]);
         } else {
            System.out.println(i + "\t\t\t" + toDisplay[i]);
         }
      }
   }
}