package lesson10_StringManipulations;

public class Question_2 {
    public static void main(String[] args) {


        // Istifadeciden bir cumle ve bir metin alin cumlede metnin vezyetine gore
        // 1- Cumlede metn yoxdur
        // 2- cumle metni sadece 1 kere iceriyor
        // 3- cumle metni birden fazla iceriyor
        // secimlerden  uygun olani yazdir

        String cumle = "Java cox gozeldir cox.";
        String metin = "cox";

        if (!cumle.contains(metin)){
            System.out.println("Cumlede metin yoxdur");
        } else  {
            int firstIndex = cumle.indexOf(metin); // 5
            int secondIndex = cumle.indexOf(metin,firstIndex+1); // ya -1 yada index olacaq
            if (secondIndex == -1){
                System.out.println("cumlede metin sadece 1 eded var");
            }else {
                System.out.println("cumled metin birden cox var");
            }
        }
    }
}
