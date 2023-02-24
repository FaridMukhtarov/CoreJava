package AdditionalQuestions.DataCasting;

import java.util.Scanner;

public class DataCasting_05 {
    public static void main(String[] args) {

        //  Question 5- Get a double, an integer from the user, divide the double number
        //  by the second number and print the integer part of the result of the division operation.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer and Decimal numbers!");

        System.out.print("Decimal: ");
        double decimal = scan.nextDouble();

        System.out.print("integer: ");
        int in = scan.nextInt();

        int divide =  (int) decimal / in;

        System.out.println("Result: " + divide);
    }
}
