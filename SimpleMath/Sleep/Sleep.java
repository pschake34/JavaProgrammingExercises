import java.util.Scanner;
public class Sleep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthYear, birthMonth, birthDay, currentYear, currentMonth, currentDay, daysAlive, hoursSleeping;
        
        System.out.println("Enter your birthdate: ");
        System.out.print("Year: ");
        birthYear = input.nextInt();
        System.out.print("Month: ");
        birthMonth = input.nextInt();
        System.out.print("Day: ");
        birthDay = input.nextInt();
        System.out.println("Enter today's date: ");
        System.out.print("Year: ");
        currentYear = input.nextInt();
        System.out.print("Month: ");
        currentMonth = input.nextInt();
        System.out.print("Day: ");
        currentDay = input.nextInt();
        
        daysAlive = (((currentYear - birthYear) * 12) + (currentMonth - birthMonth)) * 30 + (currentDay - birthDay);
        hoursSleeping = daysAlive * 8;
        
        System.out.println("You have been alive for " + daysAlive + " days.");
        System.out.println("You have spent " + hoursSleeping + " hours sleeping.");
    }
}