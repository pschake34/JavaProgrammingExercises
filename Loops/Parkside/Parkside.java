import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parkside {
    public static void main(String[] args) {
        int seed;
        Scanner input = new Scanner(System.in);
        ArrayList columnList = new ArrayList();
        
        while (true) {
            System.out.print("Enter the seed: ");
            seed = input.nextInt();
            if (seed < 1 || seed > 9) {
               System.out.println("Invalid input, enter a number between 1 and 9.");
            } else {
               break;
            }
        }
        
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        int val = seed;
        
        for (int col = 1; col <= size; col++) {
            ArrayList<Integer> newColumn = new ArrayList<Integer>();
            for (int i = 0; i < col; i++) {
                newColumn.add(val);
                if (val < 9) {
                  val++;
                } else {
                  val = 1;
                }
            }
            columnList.add(newColumn);
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print(((List)columnList.get(j)).get(i) + " ");
            }
            System.out.println();
        }
    }
}
