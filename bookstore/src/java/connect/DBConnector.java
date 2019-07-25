/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import static connect.DBConnector.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class DBConnector {
     public static Connection getConnection() {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "root";
        try {
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connect success!!!");
        } catch ( SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
    public static void main(String[] args) {
        Connection connection = getConnection();
        System.out.println("Ket noi thanh cong");
    }
}
