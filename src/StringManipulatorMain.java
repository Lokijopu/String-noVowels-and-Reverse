import java.util.Scanner;
/**
 * 
 * @author Kevin Guo Period 6 StringManipulator testclass
 *
 */
public class StringManipulatorMain {

	public static void main(String[] args) {
		boolean playAgain = true;
		while (playAgain) {
			StringManipulator strman = new StringManipulator();
			Scanner in = new Scanner(System.in);
			System.out.print("Would you like to use the \"novowels\" method or the \"reverse\" method?\t");
			String input = in.next();
			in.nextLine();
			if (input.toLowerCase().equals("novowels")) {
				System.out.print("Input a string:\t");
				String str = in.next();
				in.nextLine();
				System.out.println(strman.noVowels(str));
			} else if (input.toLowerCase().equals("reverse")) {
				System.out.print("Input a string:\t");
				String str = in.next();
				in.nextLine();
				System.out.println(strman.reverse(str));
			} else {
				while (!input.toLowerCase().equals("novowels") && !input.toLowerCase().equals("reverse")) {
					System.out.println("Invalid input. Please try again.");
					System.out.print("Would you like to use the \"novowels\" method or the \"reverse\" method?\t");
					input = in.next();
					in.nextLine();
				} 
				if (input.toLowerCase().equals("novowels")) {
					System.out.print("Input a string:\t");
					String str = in.next();
					in.nextLine();
					System.out.println(strman.noVowels(str));
				} else if (input.toLowerCase().equals("reverse")) {
					System.out.print("Input a string:\t");
					String str = in.next();
					in.nextLine();
					System.out.println(strman.reverse(str));
				} else {
					while (!input.toLowerCase().equals("novowels") && !input.toLowerCase().equals("reverse")) {
						System.out.println("Invalid input. Please try again.");
						System.out.print("Would you like to use the \"novowels\" method or the \"reverse\" method?\t");
						input = in.next();
						in.nextLine();
					} 
				}
			}
			
			System.out.print("Would you like to play again? (yes/no)");
			String answer = in.next();
			in.nextLine();
			if (answer.toLowerCase().equals("yes")) {
				playAgain = true;
			} else if (answer.toLowerCase().equals("no")) {
				playAgain = false;
				System.out.println("Have a nice day!");
			} else {
				while (!answer.equals("yes") && !answer.equals("no")) {
					System.out.println("Invalid input.");
					System.out.print("Would you like to play again? (yes/no)");
					answer = in.next();
					in.nextLine();
				}
			}
		}
	}	
}