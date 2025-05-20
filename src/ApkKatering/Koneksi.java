/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApkKatering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alwian
 */
public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection()throws SQLException{
        if (conn == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_katering", // Ganti nama_database
                    "root", // username MySQL
                    ""       // password MySQL
                );
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                throw new SQLException("Koneksi ke database gagal.");
            }
        }
        return conn;
    }
}
