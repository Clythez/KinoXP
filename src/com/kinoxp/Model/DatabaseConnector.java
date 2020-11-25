package com.kinoxp.Model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnector {

    //    Declare a connection
    private static Connection connection = null;

    //    Declare JDBC driver
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    //    The url = jdbc:dbms//host name:port#/db name
    private static String url = "jdbc:mysql://localhost:3306/kino_xp_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    //    Declare user name
    private static String user = "root";    // If your database username is not root, please substitute with your own.

    //    Declare password
    private static String password = ""; // Please add your own database password here

    //    Create the connection method
    public static Connection connect() {
        System.out.println("--- Connecting to MySQL JDBC---");

//    Locate MySQL JDBC Driver
        try {
            Class.forName(DRIVER);
        }

//    Catch exceptions if JDBC is not found
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("\n---JDBC cannot be found---");
        }
//    Connect to MySQL DB = URL, username, password
        try {
            connection = DriverManager.getConnection(url, user, password);
        }
//    Catch exceptions on connection error
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("\n---Did not connect - Try Again---");
        }

//    If connection successful
        if (connection != null) {
            System.out.println("\n---Connection successful---");
        }

//    If connection fails
        else {
            System.out.println("\n---Connection Failed---");
        }
        return connection;
    }
}