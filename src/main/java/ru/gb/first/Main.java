package ru.gb.first;

public class Main {
    public static void main(String[] args) {
        Person person = Person.createPersonBuilder()
                .withFirstName("John")
                .withLastName("Johnson")
                .withMiddleName("None")
                .withAddress("SomeAddress")
                .withAge(27)
                .withCountry("SomeCountry")
                .withGender("Male")
                .withPhone("123456789")
                .build();
        System.out.println(person.toString());
    }
}