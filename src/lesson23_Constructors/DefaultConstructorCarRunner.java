package lesson23_Constructors;

public class DefaultConstructorCarRunner {
    public static void main(String[] args) {

        // DefaultAvtomobil class-indan Object yaratmaq

        DefaultConstructorCar avto = new DefaultConstructorCar();

        System.out.println(avto.marka); // Marka qeydedilmedi
        System.out.println(avto.model); // Model qeydedilmedi
        System.out.println(avto.yanacaq); // null
        System.out.println(avto.il); // 0
        System.out.println(avto.qiymet); // 0


        avto.marka = "BMW";
        avto.model = "M5";
        avto.yanacaq = "Benzin";
        avto.il = 2018;
        avto.qiymet = 50000;


        System.out.println(avto.marka); // BMW
        System.out.println(avto.model); // M5
        System.out.println(avto.yanacaq); // Benzin
        System.out.println(avto.il); // 2018
        System.out.println(avto.qiymet); // 50000

        // If Else
        System.out.println(avto.maxSuret(avto.yanacaq));




        // avto1-in xusuiyetlerini yazdirmaq istesek
        DefaultConstructorCar avto1 = new DefaultConstructorCar();

        System.out.println("Marka : " + avto1.marka +
                "\nModel : " + avto1.model+
                "\nBenzin : " + avto1.yanacaq+
                "\nil : " + avto1.il+
                "\nQiymet : " + avto1.qiymet);




        DefaultConstructorCar avto2 = new DefaultConstructorCar();

        System.out.println(avto2);
        System.out.println("---------------------------");
        System.out.println(avto);

        DefaultConstructorCar avto3= new DefaultConstructorCar();
        System.out.println("---------------------------");
        System.out.println(avto3);



    }
}
