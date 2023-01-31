package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        /*
        İstifadəçidən double və int ədədi alin və onların cəmini
        və vurmasini hesablayın ve çap edin.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa ondaliqli bir reqem daxil edin: ");
        double ondaliq = input.nextDouble();

        System.out.print("Zehmet olmasa tam reqem daxil edin: ");
        int tam = input.nextInt();

        double netice = tam*ondaliq;

        System.out.println("Cemi: " +(ondaliq+tam)+ " Vurma: " + netice);
    }
}
