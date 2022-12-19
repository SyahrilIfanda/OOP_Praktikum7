package Agregasi;

public class Mainprogram {
    public static void main(String[] args) {
        // membuat object phone
        Phone handPhone = new Phone();

        // memanggil attribut dan nilai
        handPhone.brand = "OPPO";
        handPhone.OS = "OneUI";

        Person syahril = new Person(handPhone);

        syahril.brand = "OPPO";
        syahril.start();
        syahril.run();
        syahril.shutdown();
    }
}
