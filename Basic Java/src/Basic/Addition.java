package Basic;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		 //Declaring the required variable for the program.
        //Integer type variable to hold number value.
        // Creates a reader instance which takes
        // input from standard input - keyboard
        int fno,sno,sum;
        //Scanner is imported from the import package
        Scanner reader = new Scanner(System.in);
        //Taking the input from the user
        System.out.print("Enter first number: ");
        // nextInt() reads the next integer from the keyboard
        fno = reader.nextInt();
        //Taking the input from the user
        System.out.print("Enter Second number: ");
        // nextInt() reads the next integer from the keyboard
        sno = reader.nextInt();
        
        //Adding to numbers from the input.
        sum = fno+sno;
        // println() prints the following line to the output screen
        //Using the System.out.println();
        System.out.println("Sum of numbers is : " + sum);
    }


	}


