import java.util.Scanner;
public class PackageCheck {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int weight, length, width, height, volume;
      
      System.out.print("Enter package weight in kilograms: ");
      weight = input.nextInt();
      System.out.print("Enter package length in centimeters: ");
      length = input.nextInt();
      System.out.print("Enter package width in centimeters: ");
      width = input.nextInt();
      System.out.print("Enter package height in centimeters: ");
      height = input.nextInt();
      
      volume = length * width * height;
      
      if (weight > 27 || volume > 100000) {
         if (weight > 27 && volume > 100000) {
            System.out.println("Too heavy and too large");
         } else if (weight > 27) {
            System.out.println("Too heavy");
         } else {
            System.out.println("Too large");
         }
      } else {
         System.out.println("The package fits the dimensions");
      }
   }
}