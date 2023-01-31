package lesson12_ForLoops;

public class ForLoops_ReqemlerCemi {
    public static void main(String[] args) {

        // isdifadecinin verdiyi reqemler toplamini tap

        int reqem = 1453;
        String reqemStr = String.valueOf(reqem);
        int birler = 0;
        int reqemlerToplami = 0;

        for (int i = 1; i <= reqemStr.length() ; i++) {

            birler = reqem % 10;
            reqemlerToplami = reqemlerToplami + birler;
            reqem = reqem / 10;
        }
        System.out.println(reqemlerToplami);
    }
}
