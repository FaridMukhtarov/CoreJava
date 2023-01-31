package lesson17_Scope;

public class LocalVariables {
    public static void main(String[] args) {
        int num = 10;
        String name = "Farid";
    }

    public void method1 (){
        int num1 = 25;
    }

    public static void method2(){
        String name = "farid";
    }

    public void method3(){

        double sayi = 23.4;

        for (int i = 0; i < 10; i++) {

             sayi=sayi=23;
            boolean trueOldu = true;
            byte by = 22;
            String familya = "Mukhtarov";
        }
    }
}
