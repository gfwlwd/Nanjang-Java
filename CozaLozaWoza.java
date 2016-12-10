<<<<<<< HEAD
public class CozaLozaWoza {   // Save as "CozaLozaWoza.java"
   public static void main(String[] args) {
	   createCozaLozaWoza(1,110,11);
   }
   
   public static void createCozaLozaWoza(int lowerbound,int upperbound,int line) {

      for (int number = 1; number <= upperbound; ++number) {
         // Print "Coza" if number is divisible by 3
         if ( number % 3 == 0 ) {
        	 if (( number % 3 == 0 ) &&  (number % 5 == 0 ) && (number % 7 == 0 )) {
        		 System.out.print("CozaLozaWoza" );
        	 }
        	 else if (( number % 3 == 0 ) &&  (number % 5 == 0 )) {
        		 System.out.print("CozaLoza" );
        	 }
        	 else if (( number % 3 == 0 ) &&  (number % 7 == 0 )) {
        		 System.out.print("CozaWoza" );
        	 } else {
        		 System.out.print("Coza" );
        	 }
            
         }
         // Print "Loza" if number is divisible by 5
         else if ( number % 5 == 0 ) {
        	 if (( number % 5 == 0 ) &&  (number % 7 == 0 )) {
        		 System.out.print("LozaWoza" );
        	 } else {
        		 System.out.print("Loza");
        	 }
            
         }
         // Print "Woza" if number is divisible by 7
         else if ( number % 7 == 0 ) {
             System.out.print("Woza" );
          }
         // Print the number if it is not divisible by 3, 5 and 7 (i.e., it has not been processed above)
         else if ((number % 3 != 0 ) || (number % 5 != 0 ) || (number % 7 != 0 )) {
        	 System.out.print(number);
         }
         
         // After processing the number, print a newline if number is divisible by 11; 
         if ( number % line == 0 ) {
            System.out.print( "\n");  
         // else print a space
         } else {
            System.out.print( " " );  // print a space
         }
      }
   }
=======
public class CozaLozaWoza {   // Save as "CozaLozaWoza.java"
   public static void main(String[] args) {
	   createCozaLozaWoza(1,110,11);
   }
   
   public static void createCozaLozaWoza(int lowerbound,int upperbound,int line) {

      for (int number = 1; number <= upperbound; ++number) {
         // Print "Coza" if number is divisible by 3
         if ( number % 3 == 0 ) {
        	 if (( number % 3 == 0 ) &&  (number % 5 == 0 ) && (number % 7 == 0 )) {
        		 System.out.print("CozaLozaWoza" );
        	 }
        	 else if (( number % 3 == 0 ) &&  (number % 5 == 0 )) {
        		 System.out.print("CozaLoza" );
        	 }
        	 else if (( number % 3 == 0 ) &&  (number % 7 == 0 )) {
        		 System.out.print("CozaWoza" );
        	 } else {
        		 System.out.print("Coza" );
        	 }
            
         }
         // Print "Loza" if number is divisible by 5
         else if ( number % 5 == 0 ) {
        	 if (( number % 5 == 0 ) &&  (number % 7 == 0 )) {
        		 System.out.print("LozaWoza" );
        	 } else {
        		 System.out.print("Loza");
        	 }
            
         }
         // Print "Woza" if number is divisible by 7
         else if ( number % 7 == 0 ) {
             System.out.print("Woza" );
          }
         // Print the number if it is not divisible by 3, 5 and 7 (i.e., it has not been processed above)
         else if ((number % 3 != 0 ) || (number % 5 != 0 ) || (number % 7 != 0 )) {
        	 System.out.print(number);
         }
         
         // After processing the number, print a newline if number is divisible by 11; 
         if ( number % line == 0 ) {
            System.out.print( "\n");  
         // else print a space
         } else {
            System.out.print( " " );  // print a space
         }
      }
   }
>>>>>>> origin/java
}