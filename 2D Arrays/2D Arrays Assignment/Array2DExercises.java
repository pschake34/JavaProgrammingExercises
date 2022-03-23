public class Array2DExercises {
   public static int max(int[][] a) {
      int max = a[0][0];
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] > max) {
               max = a[i][j];
            }
         }
      } return max;
   }
   
   public static int rowSum(int[][] a, int x) {
      int sum = 0;
      for (int i = 0; i < a[x].length; i++) {
         sum += a[x][i];
      } return sum;
   }
   
   public static int columnSum(int[][] a, int x) {
      int sum = 0;
      for (int r = 0; r < a.length; r++) {
         sum += a[r][x];
      } return sum;
   }
   
   public static int[] allRowSums(int[][] a) {
      int[] rowSums = new int[a.length];
      for (int r = 0; r < a.length; r++) {
         rowSums[r] = rowSum(a, r);
      } return rowSums;
   }
   
   public static int[] allColumnSums(int[][] a) {
      int[] columnSums = new int[a[0].length];
      for (int c = 0; c < a.length; c++) {
         columnSums[c] = columnSum(a, c);
      } return columnSums;
   }

   
   public static boolean isRowMagic(int[][] a) {
      int[] rowSums = allRowSums(a);
      int rowMagic = rowSums[0];
      for (int i = 1; i < rowSums.length; i++) {
         if (rowSums[i] != rowMagic) {
            return false;
         }
      } return true;
   }
   
   public static boolean isColumnMagic(int[][] a) {
      int[] columnSums = allColumnSums(a);      
      int colMagic = columnSums[0];
      for (int i = 1; i < columnSums.length; i++) {
         if (columnSums[i] != colMagic) {
            return false;
         }
      } return true;
   }
   
   public static boolean isSquare(int[][] a) {
      int length = a.length;
      for (int i = 0; i < length; i++) {
         if (a[i].length != length) {
            return false;
         }
      } return true;
   }
   
   public static boolean isMagic(int[][] a) {
      if (isSquare(a) && rowSum(a, 0) == columnSum(a, 0) && isRowMagic(a) && isColumnMagic(a)) {
         int magicSum = rowSum(a, 0);
         int diagSum = 0;
         for (int i = 0; i < a.length; i++) {
            diagSum += a[i][i];
         } if (diagSum != magicSum) {
            return false;
         } diagSum = 0;
         
         for (int j = a.length-1; j >= 0; j--) {
            diagSum += a[j][j];
         } if (diagSum != magicSum) {
            return false;
         }
      } else {
         return false;
      } return true;
   }
   
   public static boolean isRowSequence(int[][] a, int x) {
      int val = a[x][0];
      for (int i = 0; i < a[x].length; i++) {
         if (a[x][i] != val) {
            return false;
         } val++;
      } return true;
   }
   
   public static boolean isColumnSequence(int[][] a, int x) {
      int val = a[0][x];
      for (int i = 0; i < a.length; i++) {
         if (a[i][x] != val) {
            return false;
         } val++;
      } return true;
   }

   
   public static boolean isLatin(int[][] a) {
      if (isSquare(a)) {
         for (int i = 0; i < a.length; i++) {
            if (!isRowSequence(a, i) || !isColumnSequence(a, i)) {
               return false;
            }
         }
      } else {
         return false;
      } return true;
   }
   
   public static boolean isSequence(int[][] a) {
      if (isSquare(a) && a[0][0] == 1) {
         for (int r = 0; r < a.length; r++) {
            if (!isRowSequence(a, r) || a[r][a[r].length-1] % a.length != 0) {
               return false;
            }
         }
      } else {
         return false;
      } return true;
   }
}