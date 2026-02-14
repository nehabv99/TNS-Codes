package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresTableCreation {

    public static void main(String[] args) {

        Connection c = null;
        Statement stmt = null;

        try {
            // Load PostgreSQL Driver
            Class.forName("org.postgresql.Driver");

            // Connect to Database
            c = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "root");

            System.out.println("Opened database successfully");

            // Create Statement
            stmt = c.createStatement();

            // SQL Query for Table Creation
            String sql = "CREATE TABLE Student (" +
                    "ID INT PRIMARY KEY NOT NULL, " +
                    "NAME TEXT NOT NULL, " +
                    "AGE INT NOT NULL, " +
                    "ADDRESS CHAR(50), " +
                    "SALARY REAL)";

            // Execute Query
            stmt.executeUpdate(sql);

            stmt.close();
            c.close();

            System.out.println("Table created successfully");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}