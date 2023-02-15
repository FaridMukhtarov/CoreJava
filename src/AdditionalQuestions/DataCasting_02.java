package AdditionalQuestions;

import java.util.Scanner;

public class DataCasting_02 {
    public static void main(String[] args) {

        // Question 2- Take a letter from the user and print the next 3 letters in the alphabet.

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a letter: ");
        char letter = scan.next().charAt(0);

        String triple = ""+(char)(letter+1) + (char)(letter+2) + (char)(letter+3);
        System.out.println("Triple: " + triple);
    }
}
