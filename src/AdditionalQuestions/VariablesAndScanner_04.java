package AdditionalQuestions;

import java.util.Scanner;

public class VariablesAndScanner_04 {
    public static void main(String[] args) {

        // Question 4- Take the length of 2 sides of a rectangle from
        // the user and calculate the area of the rectangle. print it.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of 2 sides of the rectangle");
        int firstLength = input.nextInt();
        int secondLength = input.nextInt();

        int rectangular = firstLength*secondLength;
        System.out.println("Rectangular: " + rectangular);


    }
}
