package oop.vjezbe;

public class PersonDemo {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
        String[] people = text.split(" ");
        Person[] personArray = new Person[people.length];
        for (int i = 0; i < people.length; i++) {
            String person = people[i];
            String[] nameAndLocation = person.split("/");
            String[] name = nameAndLocation[0].split("\\.");
            String firstName = name[0];
            String lastName = name[1];
            String location = nameAndLocation[1];
            personArray[i] = new Person(firstName, lastName, location);
        }
        for (int i = 0; i < personArray.length; i++) {
            Person person = personArray[i];
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getLocation());
        }
    }
}
