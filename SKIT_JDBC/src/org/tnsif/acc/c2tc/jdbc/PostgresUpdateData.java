package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresUpdateData {

    public static void main(String[] args) {

        Connection c = null;
        Statement stmt = null;

        try {
            // Load Driver
            Class.forName("org.postgresql.Driver");

            // Connect to DB
            c = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "root");

            System.out.println("Opened database successfully");

            // Create Statement
            stmt = c.createStatement();

            // SQL UPDATE Query
            String sql = "UPDATE Student SET SALARY = 70000 WHERE ID = 1";

            // Execute Update
            int rows = stmt.executeUpdate(sql);

            stmt.close();
            c.close();

            System.out.println(rows + " record updated successfully");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}