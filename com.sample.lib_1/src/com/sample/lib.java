/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.sql.*;

/**
 *
 * @author ranjit
 */
public class lib {

    Connection c = null;
    Statement stmt = null;

    public void Create_db() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS STUDENT1 "
                    + "(id INTEGER PRIMARY KEY AUTOINCREMENT,ENO INTEGER     NOT NULL,"
                    + " NAME           TEXT    NOT NULL, "
                    + " EMAIL          TEXT    NOT NULL, "
                    + " DEPT        TEXT    NOT NULL, "
                    + " PASS         TEXT    NOT NULL)";

            String sql1 = "CREATE TABLE IF NOT EXISTS LIBRARY "
                    + "(id INTEGER PRIMARY KEY AUTOINCREMENT,ENO INTEGER     NOT NULL,"
                    + " BOOK           TEXT    NOT NULL, "
                    + " AUTHOR          TEXT    NOT NULL, "
                    + " DATE        TEXT    NOT NULL, "
                    + " RETURN         TEXT    NOT NULL)";
            stmt.executeUpdate(sql);
            stmt.executeUpdate(sql1);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lib lb = new lib();
        lb.Create_db();
        
        Login lg=new Login();
        lg.setVisible(true);
    }

}
