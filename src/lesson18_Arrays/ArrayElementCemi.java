package lesson18_Arrays;

public class ArrayElementCemi {
    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilari toplayip neticeni bize donduren bir
        // method yazin.

        int [] arr = {3, 4, -3, 5, -6, -2, 7};

        System.out.println(pozitivCemiMethod(arr)); // 19
    }

    public static int pozitivCemiMethod (int [] arr){
        int cem = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                cem += arr[i];
            }
        }return cem;
    }
}
