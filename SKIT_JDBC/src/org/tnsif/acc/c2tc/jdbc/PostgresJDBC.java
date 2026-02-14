package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;      // Represents a connection to the database.
import java.sql.DriverManager;   // Manages JDBC drivers and establishes connections.
import java.sql.SQLException;    // Handles SQL-related exceptions.

public class PostgresJDBC {   // This class contains the main method and logic to connect to PostgreSQL

    public static void main(String[] args) {

        // JDBC URL for PostgreSQL
        // localhost = local machine, 5432 = default PostgreSQL port, postgres = database name
        String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";  // PostgreSQL username
        String password = "root";      // PostgreSQL password

        // Try-with-resources ensures connection closes automatically
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "root")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}