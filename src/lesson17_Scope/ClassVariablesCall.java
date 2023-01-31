package lesson17_Scope;

public class ClassVariablesCall {
    public static void main(String[] args) {

        // ObjectVariables class-indan xestexana adini cagirmaq

        // Static olan variables cagirmaq ucun
        System.out.println(ObjectVariables_Instance.xestexanaName); // Ulduz Xestexana
        System.out.println(ObjectVariables_Instance.xesteSayi); // 2586
        method1();

        ObjectVariables_Instance.xesteSayi++;
        System.out.println(ObjectVariables_Instance.xesteSayi); // 2588
    }

    public static void method1(){
        ObjectVariables_Instance.xesteSayi++;
    }
}
