package com.rd;
import java.util.List;
import java.util.ArrayList;

public class Department {
    public String departmentName;
    public List<Employee> employees;

    public Department(String departmentName){
        this.departmentName= departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> listEmployees(){
        return employees;
    }
}
