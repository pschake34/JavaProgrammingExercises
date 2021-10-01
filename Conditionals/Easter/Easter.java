import java.util.Scanner;
public class Easter {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int year, easterDay;
      String month = "March";
      
      System.out.print("Enter a year between 1900 and 2099: ");
      year = input.nextInt();
      
      int a = year % 19;
      int b = year % 4;
      int c = year % 7;
      int d = (19 * a + 24) % 30;
      int e = (2 * b + 4 * c + 6 * d + 5) % 7;
      easterDay = (22 + d + e);
      
      if (year == 1954 || year == 1981 || year == 2049 || year == 2076) {
         easterDay -= 7;
      }
      
      if (easterDay > 31) {
         easterDay -= 31;
         month = "April";
      }
      
      System.out.println("In " + year + ", Easter Sunday is on " + month + " " + easterDay);
   }
}