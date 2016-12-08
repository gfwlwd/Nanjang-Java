import java.util.Arrays;

public class SumDigits {

	public static void main(String[] args) {
		//int[] array1 = new int[]{1,2,3,4,5,6}; 
		//digits(array1);
		
		int[] array = Arrays.asList(args).stream().mapToInt(Integer::parseInt).toArray();
		digits(array);
		
	}
private static void digits(int[] array) {
		int count = 0;
		int sum = 0;
		System.out.printf("java SumDigits "+ Arrays.toString(array).replaceAll(", ", "").replace("[", "").replace("]", "")+ "\n");
		System.out.print("The sum of digits = ");
		
		
		
		for(int i=0;i<array.length;i++)
		{
			if (array[i] > 0){ // checks for negative numbers
				if (i == array.length-1){
					System.out.print( array[i]);
					sum += array[i];
				} else{
					System.out.print( array[i]+ " + "); 
					sum += array[i];
				}
				count++;
			}
			//else dont count in sum
		}

		if (count <= 0){
			System.out.print("Not enough digits");
		}
		System.out.print(" = " + sum);
}
}
