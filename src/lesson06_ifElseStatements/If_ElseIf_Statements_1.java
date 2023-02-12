package lesson06_ifElseStatements;

import java.util.Scanner;

public class If_ElseIf_Statements_1 {
    public static void main(String[] args) {
        // istifadeciden kilo ve boyunu isdeyib beden kitle indeksini hesablayin
        // kilo*10000 / (boy*boy))
        // beden kitle indeksi 30 dan boyukse obez
        // 25-30 arasi ise kilolu
        // 20-25 arsi ise normal
        // 20 den azsa zeyif

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa kilonuzu kq olaraq daxil edin: " );
        double kilo = input.nextDouble();

        System.out.print("Zehmet olmasa boyunuzu cm olaraq daxil edin: " );
        double boy = input.nextDouble();

        double bke = (kilo * 10000 / (boy * boy));
        System.out.println("Beden kitle Endeksi: " + bke);
        
        if (bke > 30){
            System.out.println("Obez");
        }else if (bke > 25) {
            System.out.println("Kilolu");
        }else if (bke > 20) {
            System.out.println("Normal");
        }else if (bke > 0){
            System.out.println("Zeyif");
        }else {
            System.out.println("Kecersiz giris");
        }
    }
}
