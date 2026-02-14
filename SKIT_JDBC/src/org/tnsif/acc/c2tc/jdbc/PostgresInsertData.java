package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresInsertData {

    public static void main(String[] args) {

        Connection c = null;
        Statement stmt = null;

        try {
            // Load PostgreSQL Driver
            Class.forName("org.postgresql.Driver");

            // Connect to database
            c = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "root");

            System.out.println("Opened database successfully");

            // Create statement
            stmt = c.createStatement();

            // SQL INSERT query
            String sql = "INSERT INTO Company (ID, NAME, AGE, ADDRESS, SALARY) "
                    + "VALUES (4, 'Neha', 21, 'Bangalore', 50000),(2, 'Nandeesh', 23, 'Bangalore', 660000),(3, 'Akash', 22, 'Bangalore', 50000)";

            // Execute INSERT
            stmt.executeUpdate(sql);

            stmt.close();
            c.close();

            System.out.println("Record inserted successfully");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
