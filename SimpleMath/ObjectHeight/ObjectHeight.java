import java.util.Scanner;
public class ObjectHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double time, height;
        
        System.out.print("Enter a time less than 4.5 seconds: ");
        time = input.nextDouble();
        
        height = 100 - 4.9 * time * time;
        System.out.println("\nHeight: " + height + " meters");
    }
}