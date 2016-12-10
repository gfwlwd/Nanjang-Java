<<<<<<< HEAD
public class CheckerBoard {   
	
   public static void main (String[] args) {
	   createCheckerBoard(7);      
   }
   
   public static void createCheckerBoard(int size) {
	   for (int row = 1; row <= size; ++row) {
	         
	         if ((row % 2) == 0) {   
	        	 System.out.print(" ");    
	         }
	         for (int col = 1; col <= size; ++col) {
	            System.out.print("# ");  
	         }
	         System.out.println();    
	      }
	   
   }
   
=======
public class CheckerBoard {   
	
   public static void main (String[] args) {
	   createCheckerBoard(7);      
   }
   
   public static void createCheckerBoard(int size) {
	   for (int row = 1; row <= size; ++row) {
	         
	         if ((row % 2) == 0) {   
	        	 System.out.print(" ");    
	         }
	         for (int col = 1; col <= size; ++col) {
	            System.out.print("# ");  
	         }
	         System.out.println();    
	      }
	   
   }
   
>>>>>>> refs/remotes/origin/java
}