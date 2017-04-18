/**
 * Created by lshar on 4/17/2017.
 */

import java.util.Scanner;

public class Main {
	public static void main( String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a message: ");
		String userMessage = reader.next(); // Scans the next token of the input as a String.
		System.out.println("Enter the number of times to print: ");
		int numTimesToPrint = reader.nextInt(); //Scans the next token of the input as an int.
		printMessage myMessage = new printMessage(userMessage, numTimesToPrint);
		
	}
	
	
}