package lesson18_Arrays;

public class ArrayUzunVeQisaKeleme {
    public static void main(String[] args) {

        // Verilen String bir array’deki en uzun ve en qisa kelimeleri yazdiran bir method
        //yaradin.

        String [] arr = {"Ferid", "Niyazi", "Fatmagul", "Arzu"};
        arrayUzunVeQizaAdiYazdir(arr);

    }
    public static void arrayUzunVeQizaAdiYazdir (String[] arr){
        String uzun = arr[0];
        String qisa = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()>uzun.length() ){
                uzun=arr[i];
            }
            if (arr[i].length() < arr.length){
                qisa=arr[i];
            }
        }
        System.out.println("En Uzun ad: " + uzun);
        System.out.println("En Qisa: " +qisa);
    }
}
