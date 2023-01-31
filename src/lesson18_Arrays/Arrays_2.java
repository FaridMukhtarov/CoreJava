package lesson18_Arrays;

import java.util.Arrays;

public class Arrays_2 {
    public static void main(String[] args) {

        String [] arr = {"Ferid","Ali", "Fuad" };

        // Bu array-in butun elementlerini arasinda bir bosluq buraxaraq yazdir
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Ferid Ali Fuad
        }

        // Bu array-i array olarq yazdir
        // array bir object / non-primitive data novu oldugundan java referansini yazdirir
        System.out.println(arr); // [Ljava.lang.String;@378bf509


        System.out.println(Arrays.toString(arr)); // [Ferid, Ali, Fuad]
        // array-i array olaraq yazdirmaq istesek arrays class-indan komek almaliyiq

    }
}
