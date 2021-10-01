import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, width, area;

        System.out.print("Enter the length: ");
        length = input.nextInt();
        System.out.print("Enter the width: ");
        width = input.nextInt();

        area = length * width;
        System.out.println("\nThe area of your rectangle is: " + area);
    }
}