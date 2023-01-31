package lesson30_Encapsulation;

public class ObjectFactory {
    public static void main(String[] args) {

        // From Hospital Class
        Hospital personal1 = new Hospital();
        System.out.println(personal1.getHospitalName()); // Ulduz Hospital
        personal1.setPatientPrice(100);
        personal1.setDoctorName("Ali");
        personal1.setDoctorAddress("Baki");

        System.out.println(personal1.getDoctorName()); // Ali
        System.out.println(personal1.getDoctorAddress()); // Baki

        // Getter və setter üsulları bəzən girişi məhdudlaşdırmaq üçün deyil,
        // istifadəçilərə funksiyanı daha yaxşı başa düşmək üçün istifadə olunur.

        System.out.println("\n----------------------------\n");

        // From Pen Class
        Pen firstPen = new Pen();
        firstPen.setPen("black");
        firstPen.setHigh(14);
        System.out.println(firstPen.getPen() + " " + firstPen.getHigh());

        Pen secondPen = new Pen();
        secondPen.setPen("blue");
        secondPen.setHigh(5);
        System.out.println(secondPen.getPen() + " " + secondPen.getHigh());

        System.out.println("\n----------------------------\n");

        // From Car Class
        Car firstCar = new Car();
        firstCar.setBrand("Toyota");
        firstCar.setModel("Prius");
        firstCar.setFuel("electricity");
        firstCar.setDoor(2);

        System.out.println(firstCar.getBrand()+
                "\n" + firstCar.getModel()+
                "\n" + firstCar.getFuel()+
                "\n" +  firstCar.getDoor()+
                "\n" + firstCar.getSpeed());

    }
}