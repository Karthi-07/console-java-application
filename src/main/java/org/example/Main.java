package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
        Employee e2 = new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0);
        Employee e3 = new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0);
        Employee e4 = new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0);
        Employee e5 = new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0);
        Employee e6 = new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0);
        Employee e7 = new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0);
        Employee e8 = new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0);
        Employee e9 = new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0);
        Employee e10 = new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5);
        DbConnection d = new DbConnection();
//      d.writeData(e1);
//      d.writeData(e2);
//      d.writeData(e3);
//      d.writeData(e4);
//        d.writeData(e5);
//        d.writeData(e6);
//        d.writeData(e7);
//        d.writeData(e8);
//        d.writeData(e9);
//        d.writeData(e10);
        // already the above data are inserted
//        d.readData(111);
//        d.readData(122);
        d.readData(200);
    }
}