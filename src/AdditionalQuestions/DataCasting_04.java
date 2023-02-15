package AdditionalQuestions;

import java.util.Scanner;

public class DataCasting_04 {
    public static void main(String[] args) {

        // Question 4- Get two double numbers from the user,
        // divide the first number by the second number
        // Print the integer part of the result of the operation.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two different decimal numbers!");

        System.out.print("First: ");
        double first = scan.nextDouble();

        System.out.print("Second: ");
        double second = scan.nextDouble();

        int in = (int) (first/second);

        System.out.println("Integer: " + in);
    }
}
