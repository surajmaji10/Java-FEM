package com.akash.inherit;

public class Person {
    public String name;
    private String address;
    public int age;

    public Person(){
        System.out.println("Default Person called");
    }

    public Person(String name){
        System.out.println("Named Person called");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
