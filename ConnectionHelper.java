/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ConnectionHelper {
    public static final String DB_URL = "jdbc:mysql://localhost/apo_tek";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    
    private static Connection INSTANCE;
    
    public static Connection getInstance(){
        if(INSTANCE == null){
            try {
                INSTANCE = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException ex) {
                System.out.println("Koneksi gagal");
                Logger.getLogger(ConnectionHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return INSTANCE;
    }
}
