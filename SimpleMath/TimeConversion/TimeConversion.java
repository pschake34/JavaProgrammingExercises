import java.util.Scanner;
public class TimeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time, hours, minutes;
        
        System.out.print("Enter an amount of time in minutes: ");
        time = input.nextInt();
        
        hours = time / 60;
        time %= 60;
        minutes = time;
        
        if (minutes < 10) {
            System.out.println("The time is: " + hours + ":0" + minutes);
        } else {
            System.out.println("The time is: " + hours + ":" + minutes);
        }
    }
}