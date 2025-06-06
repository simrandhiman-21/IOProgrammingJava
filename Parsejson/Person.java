package org.json.assignment.Parsejson;

class Person {
    private String name;
    private int age;

    // Constructors, getters, and setters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

