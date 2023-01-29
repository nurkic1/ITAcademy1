package oop.zadatak;

public class Chocolate extends Product {
    private double weight;

    public Chocolate(String name, String barcode, double basePrice, double tax, double weight) {
        super(name, barcode, basePrice, tax);
        this.weight = weight;
        System.out.println("Chocolate Product Created!");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Milky", "123456", 10, 0.2, 0.5);
        System.out.println("Name: " + chocolate.getName());
        System.out.println("Barcode: " + chocolate.getBarcode());
        System.out.println("Base Price: " + chocolate.getBasePrice());
        System.out.println("Tax: " + chocolate.getTax());
        System.out.println("Weight: " + chocolate.getWeight());
    }
}



