package lesson19_Arrays;

import lesson18_Arrays.ArrayElemetiArtiran;

import java.util.Arrays;

public class Method_Istifadesi {
    public static void main(String[] args) {

        // verilen int array-in elementlerini 2 artirin
        int[] arr = {4,5,32,5};
        System.out.println(Arrays.toString(ArrayElemetiArtiran.arrayArtirma(arr)));
    }
}
