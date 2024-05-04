package org.example;

import company.beans.Person;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Person", 24);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            Person person = new Person("Person", 130);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        EmailMessenger emailMessenger = new EmailMessenger();

        String mathResult = String.valueOf(MathUtils.add(2, 2));
        emailMessenger.sendMessage(mathResult);

        Person[] people = new Person[5];
        final int b = 10;
        Random random = new Random();
        for (var personIndex = 0; personIndex < people.length; personIndex++) {
            try {
                people[personIndex] = new Person("John Doe", 10 + random.nextInt(5,20) * 7);
                String ageResult = String.valueOf(MathUtils.add(people[personIndex].getAge(),b));
                emailMessenger.sendMessage(ageResult);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}