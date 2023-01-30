package oop.VjezbaBroj2;

public class Wine extends Product {
    private double bottleVolume;
    private static final double ALCOHOL_TAX = 1.1;

    public Wine(String name, int barCode, double basePrice, double bottleVolume) {
        super(name, barCode, basePrice);
        this.bottleVolume = bottleVolume;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() * ALCOHOL_TAX;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bottle volume: " + bottleVolume);
    }
}
