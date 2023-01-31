package lesson18_Arrays;

import java.util.Arrays;

public class ArrayElemetiArtiran {
    public static void main(String[] args) {
        /*
        Verilen bir int array’in butun elementlerinin 2 artirib bize donduren bir method
        yarat. kohne array’i yeni vezyeti ile yadasa verin.
         */

        int [] arrInt = {1,2,3,4,5,6};

        arrInt = arrayArtirma(arrInt);

        System.out.println(Arrays.toString(arrInt)); // [3, 4, 5, 6, 7, 8]

    }
    public static int[] arrayArtirma (int[] arrInt) {
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = arrInt[i] + 2;
        }
        return arrInt;
    }
}
