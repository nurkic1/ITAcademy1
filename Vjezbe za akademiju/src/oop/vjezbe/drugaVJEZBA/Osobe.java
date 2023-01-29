package oop.vjezbe.drugaVJEZBA;

public class Osobe {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
        String[] parts = text.split(" ");

        for (String part : parts) {
            String[] subparts = part.split("/");
            String name = subparts[0];
            String city = subparts[1];

            String[] nameparts = name.split("\\.");
            String firstName = nameparts[0];
            String lastName = nameparts[1];

            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("City: " + city);
            System.out.println("-------------------");
        }

    }
}
