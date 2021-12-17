import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class Analysis {   
   public static void main(String[] args) {
      ArrayList<Integer> data = getData();
      double avg = getAverage(data);
      int min = getMin(data);
      int max = getMax(data);
      int mode = getMode(data);
      
      System.out.println("\n\nAverage: " + String.format("%.2f", avg));
      System.out.println("Range: " + min + " -- " + max);
      System.out.println("Mode: " + mode);
      System.out.println("\nHistogram:");
      histogram(data);
   }
   
   public static ArrayList<Integer> getData() {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter numbers between 1 and 50, terminated with 0:");
      ArrayList<Integer> data = new ArrayList<Integer>();
      
      int i = 1;
      while (true) {
         System.out.print(i + ". ");
         int temp = input.nextInt();
         
         if (temp > 0 && temp <= 50) {
            data.add(temp);
            i++;
         } else if (temp == 0) {
            break;
         }
      } return data;
   }
   
   public static double getAverage(ArrayList<Integer> data) {
      double total = 0;
      int len = data.size();
      
      for (int i = 0; i < len; i++) {
         total += data.get(i);
      }
      return total / len;
   }
   
   public static int getMax(ArrayList<Integer> data) {
      int max = 0;
      
      for (int i = 0; i < data.size(); i++) {
         if (data.get(i) > max) {
            max = data.get(i);
         }
      } return max;
   }
   
   public static int getMin(ArrayList<Integer> data) {
      int min = 500;
      
      for (int i = 0; i < data.size(); i++) {
         if (data.get(i) < min) {
            min = data.get(i);
         }
      } return min;
   }
   
   public static int getMode(ArrayList<Integer> data) {
      ArrayList<Integer> nums = new ArrayList<Integer>();
      ArrayList<Integer> instances = new ArrayList<Integer>();
      
      for (int i = 0; i < data.size(); i++) {
         if (nums.contains(data.get(i))) {
            instances.get(nums.indexOf(data.get(i)));
         } else {
            nums.add(data.get(i));
            instances.add(1);
         }
      }
      
      int mostInstances = 0;
      int num = 0;
      for (int i = 0; i < instances.size(); i++) {
         if (instances.get(i) > mostInstances) {
            mostInstances = instances.get(i);
            num = nums.get(i);
         }
      } return num;
   }
   
   public static void histogram(ArrayList<Integer> data) {
      int[][] dataRanges = {{1, 5}, {6, 10}, {11, 15}, {16, 20}, {21, 25},
                            {26, 30}, {31, 35}, {36, 40}, {41, 45}, {46, 50}};
                            
      for (int i = 0; i < dataRanges.length; i++) {
         int lowerLimit = dataRanges[i][0];
         int upperLimit = dataRanges[i][1];
         
         if (lowerLimit < 10) {
            System.out.print(" " + lowerLimit);
         } else {
            System.out.print(lowerLimit);
         } 
         System.out.print(" -- ");
         if (upperLimit < 10) {
            System.out.print(" " + upperLimit);
         } else {
            System.out.print(upperLimit);
         }
         System.out.print(" :  ");
         
         for (int j = 0; j < data.size(); j++) {
             int currentNum = data.get(j);
             if (currentNum >= lowerLimit && currentNum <= upperLimit) {
               System.out.print("*");
             }
         } System.out.println();
      }
   }
}