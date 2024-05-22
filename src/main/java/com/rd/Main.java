package com.rd;

public class Main {
    public static void main(String[] args) {

        Employess employee1 = new Employess();
        Employess employee2 = new Employess();

        employee1.ID= 1;
        employee1.Name = "Hacer";
        employee1.Surname = "Bayram";
        employee1.Age=29;
        employee1.Department= "IT";

        employee2.ID =2;
        employee2.Name ="Selin";
        employee2.Surname = "Tektas";
        employee2.Age=25;
        employee2.Department= "Finance";

        employee1.added();
        employee2.added();

        }
    }
