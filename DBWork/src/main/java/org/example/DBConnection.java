package org.example;

import java.sql.*;

public class DBConnection {
static Connection connection;
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //Class.forName("com.mysql.cj.jdbc.Driver");
        //com.mysql.jdbc.Driver driver=new com.mysql.jdbc.Driver();
        //driver.connect("jdbc:mysql://localhost/test",)
        connection = DriverManager.getConnection("jdbc:mysql://localhost/northwind",
                "root","123");
        System.out.println("You are successfully connected to database");
        return connection;

    }

    public static void closeConnection() throws SQLException {
        connection.close();
        System.out.println("Connection closed");
    }

    public static void getResult() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("select * from employee");
        ResultSet rs = statement.getResultSet();
        while (rs.next()){
            String  name = rs.getString("lastname");
            String  surname = rs.getString("firstname");
            String  address = rs.getString("address");
            String  city = rs.getString("city");
            String  phoneNumber = rs.getString("phone");
            System.out.println("Name: "+name+" - Surname: "+surname+" - Adres: "+address+" - Phone number: "+phoneNumber);
        }
    }
}
