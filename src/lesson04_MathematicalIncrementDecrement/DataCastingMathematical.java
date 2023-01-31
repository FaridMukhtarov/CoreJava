package lesson04_MathematicalIncrementDecrement;

import java.util.Scanner;

public class DataCastingMathematical {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Zehmet olmasa iki reqem Daxil edin: " );

        /*
        // 1
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        int netice = (int) (num1 / num2);
        System.out.println(netice);


        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double bol = num1 / num2;

        int netice = (int) bol;
        System.out.println(netice);
         */


        // 2
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // tam sayini double cevirmek ucun en azi sayilardan biirini casting edilmelidir ki ondalikli vere bilsin
        //double netice = num1 / num2; 3.0
        //double netice = (double) num1 / num2; // 3.3333333333
        double netice =  num1 / (double) num2; // 3.3333333333
        System.out.println(netice);





    }
}
