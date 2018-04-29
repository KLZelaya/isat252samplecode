/**
 * DivisibilityCounting.java
 * 
 */
public class DivisibilityCounting {

	public static void main(String[] args) {
		
		int x = 0;
		String byBoth = "FizzBuzz";
		String byThree = "Fizz";
		String byFive = "Buzz";

		while (x < 101) {
			
			if ( (x % 3 == 0) && (x % 5 == 0) ) {

				System.out.println(byBoth);

			} else if ( x % 3 == 0 ) {

				System.out.println(byThree);

			} else if ( x % 5 == 0) {

				System.out.println(byFive);
			
			} else {

				System.out.println(x);
			} //end else/if statement

			x++;
			System.out.println();

		} //end while loop
		

	} //main

} //class

