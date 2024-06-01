package com.akash.inherit;

public class Runner {
    public static void main(String[] args) {

        Person p = new Person("Akash");
        Employee e = new Employee("Suraj");

        int age = p.getAge();
        System.out.println(age);

        double sal = e.getSalary();
        System.out.println(sal);

    }
}
