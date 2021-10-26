import java.util.Scanner;

public class Monogram {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String firstName, middleInitial, lastName;
   
      System.out.print("Enter your first name: ");
      firstName = input.nextLine();
      System.out.print("Enter your middle initial: ");
      middleInitial = input.nextLine();
      System.out.print("Enter your last name: ");
      lastName = input.nextLine();
   
      String monogram = firstName.substring(0, 1).toLowerCase() + lastName.substring(0, 1).toUpperCase() + middleInitial.toLowerCase();
      System.out.println("Your monogram is: " + monogram);
   }
}