package lesson18_Arrays;

public class ArrayElemetAxtarmaq {
    public static void main(String[] args) {
        // Verilen bir array’de istelinen bir elementin var olup olmadigini ve varsa ne qeder
        // stifade edildiyi yazdiran bir method yaradin.

        int [] arr = {1, 2, 3, 4, 3, 44, 6, 3, 2, 77};

        int axtarilanElement = 77;
        axtarilanElemetSayma(arr, axtarilanElement);

    }
    public static void axtarilanElemetSayma (int[] arr, int axtarilanElement ){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (axtarilanElement == arr[i]){
                count++;
            }
        }
       if (count == 0){
           System.out.println("Axtardiginiz reqem Array-de yoxdur");

       }else {
           System.out.println("Axtardiginiz " +axtarilanElement+ " ve Array-da istifade sayisi " + count);
       }
    }
}
