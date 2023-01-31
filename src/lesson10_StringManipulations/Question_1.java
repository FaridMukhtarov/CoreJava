package lesson10_StringManipulations;

public class  Question_1 {

    public static void main(String[] args) {
           /*
    mail yoxlayan bir pproqram hazirla

    1 - Gmail @ isaresi istifade elemirse "Kecersiz email"
    2 - @ isaresi var amma @gmail.com yoxdurse "Gmail adresi daxil edin
    3 - @gmail.com ile bitmirse "Yazi xettasi"
     */

        String gmail = "ferid@gmail.com";

        if (!gmail.contains("@")){
            System.out.println("Kecersiz email");
        } else if (!gmail.contains("gmail.com")) {
            System.out.println("Gmail adresi daxil edin");
        }else if (!gmail.endsWith("@gmail.com")){
            System.out.println("Yazi xettasi");
        }else {
            System.out.println("Dogru Gmail");
        }
    }



}
