package AdditionalQuestions.VariablesAndScanner;

import java.util.Scanner;

public class VariablesAndScanner_06 {
    public static void main(String[] args) {

        // Question 7 (Interview)- Take two numbers from the user and change their values (swap).

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");

        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        int empty;
        empty = firstNumber;
        firstNumber = secondNumber;
        secondNumber = empty;

        System.out.println("First number: " + firstNumber
                + "\nSecond number: " +secondNumber);
    }
}
