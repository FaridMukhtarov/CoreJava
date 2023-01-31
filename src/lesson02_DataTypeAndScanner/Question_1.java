package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {


        /*
        İstifadəçidən üç fərqli Data tipində dəyərlər alın və
        daxil edilmiş dəyərləri izahlari ile çap edin.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Zehmet olmasa sevdiyiniz sozu daxil edin: " );
        String text = input.nextLine();

        System.out.print("Zehmet olmasa tam reqem daxil edin: " );
        int tamReqem = input.nextInt();

        System.out.print("Zehmet olmasa ondaliqli reqem daxil edin: " );
        double ondaliqReqem = input.nextDouble();


        System.out.println("Daxil etdiyiniz sevimli sozunuz: " + text);
        System.out.println("Daxil etdiyiniz tam reqem: " + tamReqem);
        System.out.println("Daxil etdiyiniz ondaliqli reqem: " + ondaliqReqem);
    }
}
