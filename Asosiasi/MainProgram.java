package Asosiasi;

public class MainProgram {
    public static void main(String[] args) {
        // membuat object Phone
        Phone handPhone = new Phone();

        // Memanggil attribut dan nilai
        handPhone.brand = "Xiaomi";
        handPhone.OS = "MIUI";

        Person Ifanda = new Person("Marzuki");

        Ifanda.brand = "Xiaomi";
        Ifanda.Hp = handPhone;
        Ifanda.start();
        Ifanda.run();
        Ifanda.shutdown();
    }
}
