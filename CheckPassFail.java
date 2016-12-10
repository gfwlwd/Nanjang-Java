public class CheckPassFail {  
   public static void main(String[] args) {  
	   checkPassFail(49); 
	   checkPassFail(50); 
	   checkPassFail(51); 
   }
   
   public static void checkPassFail(int mark) {
      System.out.println("The mark is " + mark);
 
      if ( mark >= 50 ) {
         System.out.println( "PASS" );
      } else {
         System.out.println( "FAIL" );
      }
      System.out.println( "DONE\n" );
   }
}