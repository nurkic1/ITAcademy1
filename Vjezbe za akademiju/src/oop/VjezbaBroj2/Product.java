package oop.VjezbaBroj2;

    public class Product {
        private String name;
        private int barCode;
        private double basePrice;
        private static final double TAX = 1.2;

        public Product(String name, int barCode, double basePrice) {
            this.name = name;
            this.barCode = barCode;
            this.basePrice = basePrice;
        }

        public double calculatePrice() {
            return basePrice * TAX;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Bar code: " + barCode);
            System.out.println("Base price: " + basePrice);
            System.out.println("Price with tax: " + calculatePrice());
        }
    }

