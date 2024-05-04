package org.example;

import company.beans.Person;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

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
    }
}