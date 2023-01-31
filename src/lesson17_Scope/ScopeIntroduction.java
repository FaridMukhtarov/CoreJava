package lesson17_Scope;

public class ScopeIntroduction {

    /*\
    Java-da Variables-lar yalnız yaradıldıqları bölgə
    daxilində əlçatandır. Buna Scope deyilir.
     */


    // 1- Class Level Variable-lar
    // 2- Local Variable-lar

    // Eger variable-lara deyer verilmese java terefinden bu deyerleri alir
    // String: null
    // Reqemsal Primitivler: 0
    // Char: ""
    // Boolean: false


    /*
    Class level Variable-lar 2 yere bolunur
    1- Static Variables (Diger adi Class Level Variables)
    2- Instance Variables (Object Variables)

    // Class level variables method-larin colunda yaradilir yani Class-in icinde
    // umumi istifadesi en uste olur

    Static variable-lar Butun class ucun kecerlidir yani static ve ya
    static olmayan method-larada bele isleyir, sadece Variable
    qarsisina static yazaraq kifayetdir

    Diger class-da istifadesi ucun (ClassName.VariableName) kifayetdir


    Static olaraq qeyd olunmayan diger class level variable-i (Instance) deyilir
    bu instance variable-lar static olmayan method-larda kecerlidir
    sadece variable dataType, dataName, ve dataValue elave ederek istifade edilir

    Ve diger class-da istifadesi ucun Object uzerinden elcatan olur

       OtherClassName Object = new OtherClassName();
       Object.variableName
       System.out.println(Object.variableName);


     Local Variable-lar yalniz method ve loop icerisinde
     yaradıldıqlarinda ve o method ve loop daxilinde kecerlidir
     */
    public static void main(String[] args) {

    }
}
