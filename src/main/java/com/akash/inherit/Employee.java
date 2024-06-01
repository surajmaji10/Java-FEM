package com.akash.inherit;

public class Employee extends Person{
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private int employeeId;
    private double salary;

    public Employee(){
        System.out.println("Default Employee called");
    }

    public Employee(String name){
        super(name);
        System.out.println("Named Employee called");
        this.name = name;
    }

}
