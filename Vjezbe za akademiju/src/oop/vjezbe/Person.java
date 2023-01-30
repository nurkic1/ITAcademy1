package oop.vjezbe;

    public class Person {
        private String firstName;
        private String lastName;
        private String location;

        public Person(String firstName, String lastName, String location) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.location = location;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getLocation() {
            return location;
        }
    }

