package AdditionalQuestions;

import java.util.Scanner;

public class DataCasting_01 {
    public static void main(String[] args) {

        // Question 1- Write a code that prints the average of 3 values entered as int as double

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three integer number!");

        System.out.print("First: ");
        int first = scan.nextInt();

        System.out.print("Second: ");
        int second = scan.nextInt();

        System.out.print("Third: ");
        int third = scan.nextInt();

        double average = (double) (first + second + third) / 3;

        System.out.println("Average: " + average);







    }
}
