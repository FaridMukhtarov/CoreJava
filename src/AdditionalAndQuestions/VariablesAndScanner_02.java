package AdditionalAndQuestions;

import java.util.Scanner;

public class VariablesAndScanner_02 {
    public static void main(String[] args) {

        // Question 2- Take a double and an int number from
        // the user and calculate their Sum and Multiply. print it.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a decimal number: ");
        double dbl = input.nextDouble();

        System.out.print("Please enter an Integer: ");
        int in = input.nextInt();

        System.out.println("Sum: " + (dbl+in)
                    + "\nMultiply: " + (dbl*in));

    }
}
