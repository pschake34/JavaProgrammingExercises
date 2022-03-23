import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Array2DExercisesTest {

	// example arrays for testing
	private int[][] latin, magic, rowMagic, colMagic, squarepos, squareneg, sorted, reverse, jagged, tall, wide, negative;
		
	@Before public void setUp() {
	   sorted = new int[][] {
		   {1,2,3,4},
		   {5,6,7,8},
		   {9,10,11,12},
		   {13,14,15,16}
	   };
	   reverse = new int[][] {
		   {16,15,14,13},
		   {12,11,10,9},
		   {8,7,6,5},
		   {4,3,2,1}
	   };
	   squarepos = new int[][] {
		   {2,2,3,4},
		   {5,8,7,8},
		   {0,10,3,12},
		   {13,22,15,8}
	   };
	   squareneg = new int[][] {
		   {-1,-4,-22,-18},
		   {-20,-6,-3,-1},
		   {-99,-15,-18,-6},
		   {-7,-7,-6,-12}
	   };
	   jagged = new int[][] {
		   {1,2},
		   {3,4,6},
		   {8,0,1,9},
		   {-2,-20,-33},
		   {0}
	   };
	   tall = new int[][] {
		   {0,1},
		   {2,3},
		   {9,5},
		   {4,-20},
		   {18,16},
		   {20,20}
	   };
	   wide = new int[][] {
		   {1,2,3,4,5,6},
		   {9,8,7,6,5,4},
		   {2,8,1,4,2,5}
	   };
	   negative = new int[][] {
		   {-3,-4,-12},
		   {-5,-7,-13},
		   {-20,-18,-1}
	   };
      rowMagic = new int[][] {
         {1, 2, 3},
         {4, 1, 1},
         {2, 2, 2},
         {6, 0, 0}
      };
      colMagic = new int[][] {
         {1, 5, 3},
         {4, 0, 2},
         {3, 3, 3}
      };
      magic = new int[][] {
         {1, 1, 1},
         {1, 1, 1},
         {1, 1, 1},
      };
      latin = new int[][] {
         {1, 2, 3, 4},
         {2, 3, 4, 5},
         {3, 4, 5, 6},
         {4, 5, 6, 7}
      };
    }
    
   @Test public void testGetMax() {
      assertEquals(16, Array2DExercises.max(sorted));
      assertEquals(-1, Array2DExercises.max(negative));
   }
   
   @Test public void testGetRowSum() {
      assertEquals(10, Array2DExercises.rowSum(sorted, 0));
   }
   
   @Test public void testGetColSum() {
      assertEquals(28, Array2DExercises.columnSum(sorted, 0));
   }
   
   @Test public void testGetRowSums() {
      int[] testArray = {1, 5, 14, -16, 34, 40};
      int[] toBeTested = Array2DExercises.allRowSums(tall);
      for (int i = 0; i < toBeTested.length; i++) {
         assertEquals(testArray[i], toBeTested[i]);
      }
   }
   
   @Test public void testIsRowMagic() {
      assertEquals(false, Array2DExercises.isRowMagic(sorted));
      assertEquals(true, Array2DExercises.isRowMagic(rowMagic));
   }
   
   @Test public void testIsColMagic() {
      assertEquals(false, Array2DExercises.isColumnMagic(sorted));
      assertEquals(true, Array2DExercises.isColumnMagic(colMagic));
   }
   
   @Test public void testIsSquareArray() {
		assertEquals(true, Array2DExercises.isSquare(sorted));
		assertEquals(false, Array2DExercises.isSquare(jagged));
		assertEquals(false, Array2DExercises.isSquare(tall));
		assertEquals(false, Array2DExercises.isSquare(wide));
	}

   @Test public void testIsMagic() {
      assertEquals(true, Array2DExercises.isMagic(magic));
		assertEquals(false, Array2DExercises.isMagic(jagged));
		assertEquals(false, Array2DExercises.isMagic(tall));
		assertEquals(false, Array2DExercises.isMagic(wide));
   }
   
   @Test public void testisLatin() {
      assertEquals(true, Array2DExercises.isLatin(latin));
		assertEquals(false, Array2DExercises.isMagic(jagged));
		assertEquals(false, Array2DExercises.isMagic(sorted));
		assertEquals(false, Array2DExercises.isMagic(wide));
   }
   
   @Test public void isSequence() {
      assertEquals(true, Array2DExercises.isSequence(sorted));
		assertEquals(false, Array2DExercises.isSequence(jagged));
		assertEquals(false, Array2DExercises.isSequence(tall));
		assertEquals(false, Array2DExercises.isSequence(wide));
   }
}