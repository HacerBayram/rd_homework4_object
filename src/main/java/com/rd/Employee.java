package com.rd;

public class Employee {
    public int employeeId;
    public String name;
    public String position;

    public Employee(int employeeId, String name, String position){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
    }

   @Override
    public String toString() {
        return "ID: " + employeeId + ", Name: " + name + ", Position: " + position;
    }

}
