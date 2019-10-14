import java.util.Arrays;
import java.util.Scanner;

/*
 * @author : Adam Graff
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		System.out.print("A");
		System.out.print("B" + "\n"); // the \n is used to create a new line
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your full name: ");
		String name = scan.next();  // if we have tokens after spaces they are still in scanner and can cause an issue
		System.out.println(name);
		
		System.out.println("Please enter your age: ");
		int age = scan.nextInt();
		scan.nextLine(); // this is considered a garbage line and allows to clean out the scanner to consume more input
		// this is typically only necessary when we want to go from consuming a primitive type to a nextLine()
		System.out.println(age);
		
		System.out.println("What is the name of your bootcamp? ");
		String bootcamp = scan.nextLine();
		
		double d = 5.9; // declaring and initializing in one line
		double num; // declaring
		num = 9.99999;  // initializing in two lines
		
		boolean b = false;
		b = true;
		System.out.println(b);
		
		char letter = 'm';
		
		final char LETTERX = 'e';  // this is a constant so once the value is assigned it cannot be changed
		// should be declared using all caps
		letter = 'n';
		// LETTERX = 'j'; -- we can't do this!
		
		byte bByte = Byte.MAX_VALUE;
		System.out.println(bByte);
		
		float f = (float)7.88; // floating point values are assumed to be doubles unless you cast it or use 7.88f or 7.88F
		
		long longNum = 9873578932529L; // longs will need to use an L or l when declared
		
		int[] arr = new int[3]; // the default value for reference types is null
		System.out.println(Arrays.toString(arr)); 
		
		System.out.println(9 % 5);

		int ten = 10;
		if (ten % 2 == 0) {
			System.out.println("even");
		}
		if (ten % 2 != 0) {
			System.out.println("odd");
		}
		
		int test = 5;
		test++;
		System.out.println(test);
		// incrementing/decrementing is like saying it's taking the original number and adding or subtracting 1
		
		//implicit casting example
		int numTest = 50;
		double numTest2 = numTest;
		int numTest3 = (int)numTest2;
		System.out.println(numTest2);
		
		
		//explicit casting example
		
		
		// this is how to close the scanner
		scan.close();
		
	}
}
