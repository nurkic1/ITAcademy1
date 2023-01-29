package oop.zadatak;

public class Product {
    private String name;
    private String barcode;
    private double basePrice;
    private double tax;

    public Product(String name, String barcode, double basePrice, double tax) {
        this.name = name;
        this.barcode = barcode;
        this.basePrice = basePrice;
        this.tax = tax;
        System.out.println("Product Created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    public static void main(String[] args) {
        Product product = new Product("Apple", "123456", 1, 0.1);
        System.out.println("Name: " + product.getName());
        System.out.println("Barcode: " + product.getBarcode());
        System.out.println("Base Price: " + product.getBasePrice());
        System.out.println("Tax: " + product.getTax());
    }
}

