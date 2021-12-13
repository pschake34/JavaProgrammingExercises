import java.util.Scanner;
import java.util.ArrayList;

public class Analysis {
   
   
   public static void main(String[] args) {
      ArrayList<Integer> data = getData();
      double avg = getAverage(data);
      int min = getMin(data);
      int max = getMax(data);
      int mode = getMode(data);
   }
   
   public static int[] getData() {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter numbers between 1 and 50, terminated with 0:");
      ArrayList<Integer> data = new ArrayList<Integer>();
      
      int i = 1;
      while (true) {
         System.out.print(i + ". ");
         int temp = input.nextInt();
         
         if (temp > 0) {
            data.add(temp);
            i++;
         } else {
            break;
         }
      }
   }
   
   public static double getAverage(ArrayList<Integer> data) {
      double total = 0;
      int len = data.size();
      
      for (int i = 0; i < len; i++) {
         total += data.get(i);
      }
      return total / len;
   }
   
   public static int getMax(ArrayList<Integer> data) {
      int max = 0;
      
      for (int i = 0; i < data.size(); i++) {
         if (data.get(i) > max) {
            max = data.get(i);
         }
      } return max;
   }
   
   public static int getMin(ArrayList<Integer> data) {
      int min = 500;
      
      for (int i = 0; i < data.size(); i++) {
         if (data.get(i) < max) {
            min = data.get(i);
         }
      } return min;
   }
   
   
}