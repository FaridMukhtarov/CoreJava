package lesson25_PassByValue;

import java.util.Arrays;

public class PassByValueArrays_Question_2 {
    public static void main(String[] args) {

        // bir method yarad
        // index-i uzunlugu 2 eded artiq olsun
        // ve elementleri hamisinin deyeri 5 olsun
        // deyer olaraqda yeni arrya assigment ele

        int[] reqemler= {3,4,5,6};
        arrayaYeniDeyerAt(reqemler); // [5, 5, 5, 5, 5, 5]

        // Arrays-da PassByValue deyislilen yeni arrays qalici olaraq qalmir
        System.out.println(Arrays.toString(reqemler)); // [3, 4, 5, 6]

    }
    private static void arrayaYeniDeyerAt(int[] reqemler) {
        int [] newArray = new int[reqemler.length+2];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = 5;
        }
        reqemler = newArray;
        System.out.println("Method-da reqemlerin son halli: " + Arrays.toString(reqemler));
    }
}
