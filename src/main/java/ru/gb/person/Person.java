package ru.gb.person;

import java.util.Objects;

public class Person {

    private  String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getMiddleName(), person.getMiddleName()) && Objects.equals(getCountry(), person.getCountry()) && Objects.equals(getAddress(), person.getAddress()) && Objects.equals(getPhone(), person.getPhone()) && Objects.equals(getGender(), person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getMiddleName(), getCountry(), getAddress(), getPhone(), getAge(), getGender());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    public static PersonBuilder createPersonBuilder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private Person person;

        public PersonBuilder() {
            this.person = new Person();
        }

        public PersonBuilder withFirstName(String firstName) {
            this.person.firstName = firstName;
            return this;
        }

        public PersonBuilder withLastName(String lastName) {
            this.person.lastName = lastName;
            return this;
        }

        public PersonBuilder withMiddleName(String middleName) {
            this.person.middleName = middleName;
            return this;
        }

        public PersonBuilder withCountry(String country) {
            this.person.country = country;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            this.person.address = address;
            return this;
        }

        public PersonBuilder withPhone(String phone) {
            this.person.phone = phone;
            return this;
        }

        public PersonBuilder withAge(int age) {
            this.person.age = age;
            return this;
        }

        public PersonBuilder withGender(String gender) {
            this.person.gender = gender;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
