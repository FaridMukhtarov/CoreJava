package AdditionalQuestions.Modulus;

public class ModulusQuestion {
    public static void main(String[] args) {

        // Question 1- Let's take a positive 4-digit integer from the user and find the sum of the digits

        int input = 5656;
        int birler = 0;
        int numberTotal = 0;

        birler = input % 10;
        numberTotal += birler;
        input = input / 10;

        birler = input % 10;
        numberTotal += birler;
        input = input / 10;

        birler = input % 10;
        numberTotal += birler;
        input = input / 10;


        birler = input % 10;
        numberTotal += birler;
        input = input / 10;








        System.out.println(numberTotal);
    }
}
