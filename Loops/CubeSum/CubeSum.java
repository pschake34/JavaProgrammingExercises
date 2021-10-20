public class CubeSum {
   public static void main(String args[]) {
      
      System.out.println("The numbers of 2, 3, and 4 digits whose cube sum of their digits is equal to themselves are as follows: ");
      System.out.print("2 digits: ");
      armstrongNumbers(2);
      System.out.print("\n3 digits: ");
      armstrongNumbers(3);
      System.out.print("\n4 digits: ");
      armstrongNumbers(4);
   }
   
   public static void armstrongNumbers(int n) {
         int startingNum = (int) Math.pow(10, n-1);
         if (startingNum == 1) {
            startingNum = 0;
         }
            int upperLimit = (int) Math.pow(10, n);
            int total, tempNum, tempPlaces;
         for (int i = 0 + startingNum; i < upperLimit; i++) {
            total = 0;
            tempNum = i;
            tempPlaces = startingNum;
            if (tempPlaces == 0) {
               tempPlaces++;
            }
            while (tempPlaces > 0) {
               total += Math.pow(tempNum / tempPlaces, n);
               tempNum %= tempPlaces;
               tempPlaces /= 10;
            }
        
            if (total == i) {
               System.out.print(i + " ");
            }
        }
    }
}