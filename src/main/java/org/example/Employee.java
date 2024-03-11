package org.example;

import java.sql.SQLException;

public class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yof;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yof, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.department = department;
        this.yof = yof;
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getYof() {
        return yof;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

}