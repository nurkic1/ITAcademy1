package oop.VjezbaBroj2;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Product", 123456, 10);
        Wine wine = new Wine("Wine", 654321, 15, 750);
        Chocolate chocolate = new Chocolate("Chocolate", 111111, 5, 100);

        System.out.println("--- Product ---");
        product.displayInfo();

        System.out.println("--- Wine ---");
        wine.displayInfo();

        System.out.println("--- Chocolate ---");
        chocolate.displayInfo();
    }
}
