package org.example;

import java.sql.*;

public class DbConnection{
    private static final String username = "root";
    private static final String password = "Karthi@007";
    private static final String url= "jdbc:mysql://localhost:3306/employee";

    public void writeData(Employee e){
        try {
            Class.forName("com.mysql.jdbc.driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Database connected");
            String query = "INSERT INTO empdata VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,e.getId());
            ps.setString(2,e.getName());
            ps.setInt(3,e.getAge());
            ps.setString(4, e.getGender());
            ps.setString(5,e.getDepartment());
            ps.setInt(6,e.getYof());
            ps.setDouble(7,e.getSalary());
            int k = ps.executeUpdate();
            connection.close();
            System.out.println(k);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void readData(int id){
        try {
            Class.forName("com.mysql.jdbc.driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement s = connection.createStatement();
            System.out.println("Database connected");
            ResultSet resultSet = s.executeQuery("SELECT * FROM empdata WHERE empid="+id);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3)
                        + " " + resultSet.getString(4) + " " + resultSet.getString(5) + " " + resultSet.getInt(6) + " " + resultSet.getDouble(7));
            }
            connection.close();
        }catch (SQLException s){
            System.out.println(s.getMessage());
        }
    }
}
