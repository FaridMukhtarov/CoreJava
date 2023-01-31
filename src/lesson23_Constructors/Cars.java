package lesson23_Constructors;

public class Cars {

    String marka = "Teyin Edilmeyib";
    String model = "Teyin Edilmeyib";
    String yanacaq;
    int il;
    int qiymet;

    public Cars(String marka, String model, String yanacaq, int il, int qiymet) {

        this.marka = marka;
        this.model = model;
        this.yanacaq = yanacaq;
        this.il = il;
        this.qiymet = qiymet;
    }

    public Cars(String marka, String model, String yanacaq) {

        this.marka = marka;
        this.model = model;
        this.yanacaq = yanacaq;
    }

    public Cars() {

    }

    public String toString() {
        return "Masinin Xusisiyetleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyanacaq : " + yanacaq +
                "\nil : " + il +
                "\nqiymet : " + qiymet;
    }

}
