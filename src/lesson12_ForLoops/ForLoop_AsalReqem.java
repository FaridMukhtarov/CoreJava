package lesson12_ForLoops;

public class ForLoop_AsalReqem {
    public static void main(String[] args) {

        // istifadecinin verdiyi  bir reqemin asal olub olmadigini tap
        // asal sayi: 1 ve ozunden basqa tamreqeme tam bolunmeyen reqemdir

        int reqem = 53;
        int flag = 0;

        for (int i = 2; i <= reqem-1; i++) {
            if (reqem % i == 0){
                flag++;
                break;
            }
        }
        System.out.println(flag);

        if ( flag == 0){
            System.out.println("Asal reqem");
        }else {
            System.out.println("Asal Reqem deyil");
        }
    }
}
