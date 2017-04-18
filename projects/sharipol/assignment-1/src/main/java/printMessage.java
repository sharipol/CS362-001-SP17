/**
 * Created by lshar on 4/17/2017.
 */
public class printMessage {
	public String message;
	public int numTimesToPrint;
	public int numWordsInMessage;
	public int numCharsInMessage;
	public int numWordsPrinted;
	public int numCharsPrinted;
	
	public printMessage (String userMessage, int numTimesWantToPrint) {
		message = userMessage;
		numTimesToPrint = numTimesWantToPrint;
		numCharsInMessage = message.length();
		
		if (numTimesWantToPrint > 10) {
			System.out.println("Too many times to print");
			throw new RuntimeException("Too many times to print");
			
		}
		
		if (numCharsInMessage == 1) {
			System.out.println("Message is empty, the size is: "+ numCharsInMessage);
			throw new RuntimeException("Message is empty, the size is: "+ numCharsInMessage);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(userMessage);
		}
		System.out.println("Printed message a total of: " + numTimesToPrint + " times");
		
		numWordsInMessage = 1;
		
		if (numCharsInMessage != 0) {
			for (int i = 0; i < numCharsInMessage; i++) {
				if (message.charAt(i) == ' ') {
					numWordsInMessage++;
				}
			}
		}
		
		else {
			System.out.println("Message is empty");
		}
		
		numTimesToPrint = 2;
		numWordsPrinted = numCharsInMessage * numTimesToPrint;
		numCharsPrinted = numWordsInMessage * numTimesToPrint;
		
		System.out.println("Total num words in message: "+numWordsInMessage+" words");
		System.out.println("Total num chars in message including spaces: "+numCharsInMessage+" chars");
		System.out.println("Total num times message printed: "+numTimesToPrint+" times");
		System.out.println("Total num words printed: "+numWordsPrinted+" words");
		System.out.println("Total num chars printed including spaces: "+numCharsPrinted+" chars");
		
	}
}