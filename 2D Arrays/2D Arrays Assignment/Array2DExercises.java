public class Array2DExercises {
   public static int max(int[][] a) {
      int max = 0;
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[i].length; i++) {
            if (a[i][j] > max) {
               max = a[i][j];
            }
         }
      } return max;
   }
   
   public static int rowSum(int[][] a, int x) {
      sum = 0;
      for (int i = 0; i < a[x].length; i++) {
         sum += a[x][i];
      } return sum;
   }
}