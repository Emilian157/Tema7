package org.fasttrackit.tema7;

public class Main {
    public static void main(String[] args) {
        Person persoana1 = new Person("Ilinca", 50, false);
        System.out.println(persoana1.toString());
        Person persoana2 = new Person("Marius", 34, true);
        System.out.println(persoana2.toString());
        Person persoana3 = new Person("Daniela", 19, false);
        System.out.println(persoana3.toString());

        System.out.println("-------------------------------------------------------------");

        Product produsul1 = new Product("Cola", 5.99, 12, "suc", "suc");
        System.out.println(produsul1.toString());
        Product produsul2 = new Product("XBOX", 1500, 0, "consola", "masina");
        System.out.println(produsul2.toString());
        Product produsul3 = new Product("Placinta", 34.60, 3, "patiserie", "lemn");
        System.out.println(produsul3.toString());

        System.out.println("-------------------------------------------------------------");

        Bottle sticla = new Bottle(500, 130, true);
        System.out.println("Max capacity status: " + sticla.maxCapacity());
        System.out.println("Available liquid: " + sticla.getAvailableLiquid() + "ml");
        System.out.println("Empty capacity: " + sticla.emptyCapacity() + "ml");
        sticla.inchideSticla();
        sticla.deschideSticla();
        sticla.cantitateaConsumata(130);
    }
}
