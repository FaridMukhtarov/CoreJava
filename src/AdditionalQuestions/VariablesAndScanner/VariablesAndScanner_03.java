package AdditionalQuestions.VariablesAndScanner;

import java.util.Scanner;

public class VariablesAndScanner_03 {
    public static void main(String[] args) {

        // Question 3- Take the name, surname and age of the user and print them in the format below.
        // Your name : John
        // Your last name: Doe
        // Your age : 44
        // Your registration has been successfully completed.

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("Please enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        String information = "Your name : " + name
                + "\nYour last name: " + lastName
                + "\nYour age: " + age
                + "\nYour registration has been successfully completed.";

        System.out.println(information);






    }
}
