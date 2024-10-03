package nl.nickhartjes.devcontainers.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Database connection parameters
        var url = "jdbc:postgresql://localhost:5432/your_database";
        var user = "your_username";
        var password = "your_password";

        // Attempt to establish a connection
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully connected to the PostgreSQL database!");

            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        }
    }
}
