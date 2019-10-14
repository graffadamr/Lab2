import java.util.Scanner;

/*
 * @author : Adam Graff
 */

public class Lab2 {

	public static void main(String[] args) {

		String userInput;
		Scanner scan = new Scanner(System.in);
		

		do {
			System.out.println("Welcome to Grand Circus' Room Detail Generator!" + "\n");
			System.out.print("Enter length: ");
			double length = scan.nextDouble();
			System.out.print("Enter width: ");
			double width = scan.nextDouble();
			System.out.print("Enter height: ");
			double height = scan.nextDouble();
			System.out.println("Area: " + length * width);
			System.out.println("Perimeter: " + (length * 2 + width * 2));
			System.out.println("Volume: " + (length * width * height) +"\n");
			System.out.print("Continue? (y/n) ");
			userInput = scan.next();
			System.out.println();
		} while (!userInput.equalsIgnoreCase("N"));
		
	scan.close();

	}

}
