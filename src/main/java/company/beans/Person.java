package company.beans;

import company.exceptions.InvalidAgeException;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

   public Person(String name, int age) throws InvalidAgeException {
       if(age < 0 || age > 125) {
           throw new InvalidAgeException("Provided age is out of range (0 - 125)");
       }

       this.name = name;
       this.age = age;
    }
}
