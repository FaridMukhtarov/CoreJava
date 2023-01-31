package lesson04_MathematicalIncrementDecrement;

public class MathematicalQuestion {
    public static void main(String[] args) {

        // Reqemler  Toplamasi
        int input = 1453;
        int birler = 0;
        int reqemlerToplamasi = 0;

        birler = input % 10; // 3
        reqemlerToplamasi = reqemlerToplamasi + birler; // 3
        input = input / 10;

        birler = input % 10; // 5
        reqemlerToplamasi = reqemlerToplamasi + birler; // 8
        input = input / 10;

        birler = input % 10; // 4
        reqemlerToplamasi = reqemlerToplamasi + birler; // 12
        input = input / 10;

        birler = input % 10; // 1
        reqemlerToplamasi = reqemlerToplamasi + birler; // 13
        input = input / 10;


        System.out.println(reqemlerToplamasi);



    }
}
