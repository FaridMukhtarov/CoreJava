package lesson23_Constructors;

public class CarsRunner {
    public static void main(String[] args) {

        // 1-ci Yontem (Parametr)
        Cars car1 = new Cars("Tesla", "X", "Electrik", 2022, 55000 );
        System.out.println(car1);


        // 2-ci Yontem (Yar Parametr)
        Cars car2 = new Cars("BMW","F10","Benzin");
        System.out.println(car2);


        // 3-cu Yountem (ParaMetrsiz)
        Cars car3 = new Cars();
        car3.marka = "Ford";
        car3.model = "Mustang";
        car3.yanacaq = "Benzin";
        car3.il = 1996;
        car3.qiymet = 80000;
        System.out.println(car3);
    }
}
