package AdditionalQuestions.DataCasting;

import java.util.Scanner;

public class DataCasting_03 {
    public static void main(String[] args) {

        // Question 3- Get a number from the user, no matter how many values the user enters,
        // it will be -128. Convert it to a number between 127 and print it.

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double user = scan.nextDouble();
        byte by = (byte) user;

        System.out.println("Byte: " + by);
    }
}
