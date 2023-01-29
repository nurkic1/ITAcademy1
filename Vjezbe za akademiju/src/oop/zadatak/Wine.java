package oop.zadatak;

public class Wine extends Product {
    private double volume;

    public Wine(String name, String barcode, double basePrice, double tax, double volume) {
        super(name, barcode, basePrice, tax);
        this.volume = volume;
        System.out.println("Wine Product Created!");
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public static void main(String[] args) {
        Wine wine = new Wine("Merlot", "987654", 20, 0.1, 0.75);
        System.out.println("Name: " + wine.getName());
        System.out.println("Barcode: " + wine.getBarcode());
        System.out.println("Base Price: " + wine.getBasePrice());
        System.out.println("Tax: " + wine.getTax());
        System.out.println("Volume: " + wine.getVolume());
    }
}


