package lesson22_ArrayListsAndForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {3,6,2,4,9,0};
        int toplama = 0;

        // bu array-deki butun elemntleri topla


        for (int each : arr) {
            if (each >5){
                toplama +=each;
            }
        }
        System.out.println(toplama);
    }
}
