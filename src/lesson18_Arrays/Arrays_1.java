package lesson18_Arrays;

public class Arrays_1 {
    public static void main(String[] args) {

        int[] arr1 = {2,4,6,8,10};

        System.out.println(arr1[2]); // 6

        arr1[3] = 20;
        System.out.println(arr1[3]); // 20

        System.out.println(arr1.length); // 5

        // son elementi yazdir
        System.out.println(arr1[arr1.length-1]); // 10

        // array-in butun elemtlerini yazdir
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // array-in uzunlugu sonradan deyisdirilmez
        // eger arrayda olmayan bir index-e deyer elave etmek istesek
        // bu xeta Compile time error CTE deyil,  Run Time error-dur

        // arr1[5] = 55; // ArrayIndexOutOfBoundsException
    }
}
