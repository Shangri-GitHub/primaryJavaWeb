package com.controller.reflectDemo;

public class Person {
    public String name;
    private int age;

    public Person() {
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人在吃饭");
    }
    private void eat(double d) {
        System.out.println("人在吃饭");
    }
    public void sleep(String str, int i, double d) {
        System.out.println("人在睡觉" + str + i + d);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
