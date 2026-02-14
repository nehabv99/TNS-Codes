package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresDeleteData {

    public static void main(String[] args) {

        Connection c = null;
        Statement stmt = null;

        try {
            // Load Driver
            Class.forName("org.postgresql.Driver");

            // Connect to Database
            c = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "root");

            System.out.println("Opened database successfully");

            // Create Statement
            stmt = c.createStatement();

            // SQL DELETE Query
            String sql = "DELETE FROM COMPANY WHERE ID = 1";

            // Execute Delete
            int rows = stmt.executeUpdate(sql);

            stmt.close();
            c.close();

            System.out.println(rows + " record deleted successfully");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}