package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
DBConnection.getConnection();
DBConnection.getResult();
    }


}