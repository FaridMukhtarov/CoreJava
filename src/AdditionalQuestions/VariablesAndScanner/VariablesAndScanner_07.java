package AdditionalQuestions.VariablesAndScanner;

import java.util.Scanner;

public class VariablesAndScanner_07 {
    public static void main(String[] args) {

        // Question 8 (Interview)- Taking two numbers from the user,
        // without using a third variable, change their values (swap).

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");

        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("First number: " + firstNumber
                + "\nSecond number: " +secondNumber);
    }
}
