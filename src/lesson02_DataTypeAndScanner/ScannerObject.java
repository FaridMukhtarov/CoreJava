package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class ScannerObject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter your name: ");
        String userName = input.nextLine(); // Read user input
        System.out.println(userName.toUpperCase());


        Scanner doubleInteger = new Scanner(System.in);
        System.out.print("Double tipinde Bir deyer daxil edin: ");
        double userDouble = doubleInteger.nextDouble();

        System.out.print("Integer tipinde Bir deyer daxil edin: ");
        int userInteger = doubleInteger.nextInt();

        System.out.println("Ustegelme: " + (userDouble + userInteger));
        System.out.println("Vurma: " + (userDouble * userInteger));



        Scanner userInfo = new Scanner(System.in);
        String firstName, lastName;
        int age;

        System.out.print("Adinizi Daxil Edin: ");
        firstName = userInfo.nextLine();

        System.out.print("Familyanizi Daxil edibn:  ");
        lastName = userInfo.nextLine();

        System.out.print("Yasinizi Daxil Edin: ");
        age = userInfo.nextInt();

        System.out.println("First Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nYasiniz: " + age
                + "\nQeydiyyatiniz ugurla tamamlandi!");



        Scanner num = new Scanner(System.in);
        System.out.print("Birinci reqemi daxil edin: ");
        int num1 = num.nextInt();

        System.out.print("ikinci reqemi daxil edin: ");
        int num2 = num.nextInt();

        int bos =num1;
        num1 = num2;
        num2 = bos;

        System.out.println("Birinci reqem: " + num1);
        System.out.println("ikinci reqem: " + num2);



    }
}
