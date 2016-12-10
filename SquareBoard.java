<<<<<<< HEAD
public class SquareBoard {   // Save as "SquareBoard.java"
   public static void main (String[] args) {
	   createSquareBoard(7);    // enter size of the board here
   }
   
   public static void createSquareBoard (int size) {
      for (int row = 1; row <= size; ++row) {  // Use row and col, NOT i and j, or x and y
         for (int col = 1; col <= size; ++col) {
        	 System.out.print("# ");   // print # and a space, without newline
         }
         System.out.println();     // print a newline
      }
   }
=======
public class SquareBoard {   // Save as "SquareBoard.java"
   public static void main (String[] args) {
	   createSquareBoard(7);    // enter size of the board here
   }
   
   public static void createSquareBoard (int size) {
      for (int row = 1; row <= size; ++row) {  // Use row and col, NOT i and j, or x and y
         for (int col = 1; col <= size; ++col) {
        	 System.out.print("# ");   // print # and a space, without newline
         }
         System.out.println();     // print a newline
      }
   }
>>>>>>> origin/java
}