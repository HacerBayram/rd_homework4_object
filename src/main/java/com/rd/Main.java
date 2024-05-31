package com.rd;

public class Main {
    public static void main(String[] args) {
        Department itDepartment = new Department("IT Department");

        Employee employee1 = new Employee(1,"Hacer","Software Tester");
        Employee employee2 = new Employee(2,"Elif","Product Owner");
        Employee employee3 = new Employee(3,"Serra","Scrum Master");
        Employee employee4 = new Employee(4,"Kemal","Sofware Developer");

        itDepartment.addEmployee(employee1);
        itDepartment.addEmployee(employee2);
        itDepartment.addEmployee(employee3);
        itDepartment.addEmployee(employee4);

        for (Employee employee : itDepartment.listEmployees()) {
            System.out.println(employee);
        }




        }
    }
