package lesson23_Constructors;

import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {

        // Constructor, bir Class-in numunesini yaradarkən çağırılan bir metoddur.
        // Constructor, Class numunesini yaradarkən numune xüsusiyyətlərinin başlanğıc
        // deyərlərini təyin etmək kimi əməliyyatları həyata keçirir.
        // Eğer bir Class üçün constructor təyin edilməmişdirsə,
        // avtomatik olaraq Java terefinden Default (boş) bir constructor təyin edilir.


        // Constructor-un iki temel xusisyeti olmalidir
        // 1- Class adi ile eyni olmalidir
        // 2- Return type Olmamalidir


        // Scanner sinfindən method və Variable-lardan (xüsusiyyətlərdən) istifadə etmək üçün skan obyekti yaradırıq
             Scanner        scan       =            new                        Scanner(System.in);
        //  Class adi    Object ismi     Object yaradmaq ucun keyword         Scanner Constructor'i

        scan.nextInt();


        // Object
        String str = new String("Java Candir");

        // Variable
        String str2= "Java ne gozel";

        str.toLowerCase();
    }

    public static void C01_constructor(){
        // metod adları kiçik hərflə başlayır
        // Sinif adı ilə eyni adın olmamasına üstünlük verilir
        // return type var bu metoddur, konstruktor deyil

    }

}

