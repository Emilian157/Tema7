package org.fasttrackit.tema7;

public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person(String nume, int varsta, boolean statusCasatorie) {
        name = nume;
        age = varsta;
        married = statusCasatorie;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public String isAPersonMarried() {
        if (isMarried()) {
            return "sunt casatorit/a";
        } else {
            return "nu sunt casatorit/a";
        }
    }

    public String toString() {
        return "Eu ma numesc " + getName() + ", am " + getAge() + " ani si " + isAPersonMarried() + "!";
    }
}
