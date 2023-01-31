package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {

        // İstifadəçinin adını, soyadını və yaşını alin və aşağıdakı formatda yazdirin.
        // Adınız: Farid
        // Soyadınız: Mukhtarov
        // Yaşınız: 38
        // Qeydiyyatınız uğurla tamamlandı

        Scanner input = new Scanner(System.in);

        System.out.println("Zehmet olmasa adiniz, soyadinizi ve yasinizi daxil edin: ");

        String name = input.nextLine();
        String lastname = input.nextLine();
        int age = input.nextInt();

        System.out.println("Adınız: " + name
                + " \nSoyadınız: " + lastname
                + " \nYaşınız: " + age);

        System.out.println("Qeydiyyatınız uğurla tamamlandı!");
    }
}
