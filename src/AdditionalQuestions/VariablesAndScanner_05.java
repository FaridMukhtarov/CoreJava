package AdditionalQuestions;

import java.util.Scanner;

public class VariablesAndScanner_05 {
    public static void main(String[] args) {

        // Question 5- Take the username, surname and age and print it in the format below.
        // information entered : J Doe, 44

        Scanner scan = new Scanner(System.in);
        String name, lastName;
        int age;

        System.out.println("Please enter your name: ");
        name = scan.nextLine();
        name = name.substring(0,1).toUpperCase();

        System.out.println("Please enter your last name: ");
        lastName = scan.nextLine();
        lastName = lastName.substring(0,1).toUpperCase()
                +lastName.substring(1).toLowerCase();

        System.out.println("Please enter your age: ");
        age = scan.nextInt();

        System.out.println("information entered : "
                + name
                +" "+ lastName +", "
                + age );
    }
}
