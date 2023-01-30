package oop.VjezbaBroj2;

public class Chocolate extends Product {
    private double weight;

    public Chocolate(String name, int barCode, double basePrice, double weight) {
        super(name, barCode, basePrice);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Weight: " + weight);
    }
}
