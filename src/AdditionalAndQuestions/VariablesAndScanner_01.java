package AdditionalAndQuestions;

import java.util.Scanner;

public class VariablesAndScanner_01 {
    public static void main(String[] args) {

        // Question 1- Taking values in three different data types from
        // the user and explaining the entered values. print it.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a double value: ");
        double dl = input.nextDouble();

        System.out.print("Please enter an integer value: ");
        int in = input.nextInt();

        System.out.print("Please enter a Char value: ");
        char ch = input.next().charAt(0);


        System.out.println("Double Value: " + dl
                + "\nInteger Value: " + in
                + "\nChar Value: " + ch);
    }
}
