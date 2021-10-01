import java.util.Scanner;
public class CarRecall {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int carModel;
      int[] defectiveModels = {119, 179, 189, 190, 191, 192, 193, 194, 195, 221, 780};
      boolean isDefective = false;
      
      System.out.print("Enter your car's model: ");
      carModel = input.nextInt();
      
      for (int i = 0; i < defectiveModels.length; i++) {
         if (carModel == defectiveModels[i]) {
            isDefective = true;
         }
      }
      
      if (isDefective) {
         System.out.println("Your car is defective.");
      } else {
         System.out.println("Your car is not defective.");
      }
   }
}