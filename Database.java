/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projek.model.Permintaan;
import projek.model.User;

/**
 *
 * @author user
 */
public class Database {
    private Connection connection;
    
    public final String COLUMN_ID = "id";
    public final String COLUMN_NAMA = "nama";
    public final String COLUMN_USERNAME = "username";
    public final String COLUMN_PASSWORD = "password";
    
    public final String COLUMN_ID_USER = "id_user";
    public final String COLUMN_JENIS= "jenis";
    public final String COLUMN_STATUS = "status";
    

    public Database() {
        this.connection = ConnectionHelper.getInstance();
    }
    
    public User getUser(String username, String password){
        User user = new User();
        String query = "SELECT * FROM user WHERE " + COLUMN_USERNAME + " = '" + username + "' AND " + COLUMN_PASSWORD + " = '" + password + "'";
        
        try {
            user.setId(-2);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                user.setId(resultSet.getInt(COLUMN_ID));
                user.setUsername(username);
                user.setPassword(password);
                user.setNama(resultSet.getString(COLUMN_NAMA));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            user.setId(-1);
        }
        return user;
    }

    public int insertUser(User user) {
        String query = "INSERT INTO user (" + COLUMN_NAMA + ", " + COLUMN_USERNAME + ", " + COLUMN_PASSWORD + ") VALUES('" + user.getNama() + "', '" + user.getUsername() + "', '" + user.getPassword() + "')";
        
        try {
            Statement statement = connection.createStatement();
            return statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int insertPermintaan(Permintaan permintaan) {
        String query = "INSERT INTO permintaan (" + COLUMN_ID_USER + ", " + COLUMN_NAMA + ", " + COLUMN_JENIS + "," + COLUMN_STATUS + ") VALUES('" + permintaan.getIdUser() + "', '" + permintaan.getNama() + "', '" + permintaan.getJenis() + "','" + permintaan.getStatus() + "')";
        
        try {
            Statement statement = connection.createStatement();
            return statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int deletePermintaan(Permintaan permintaan){
        String query = "DELETE FROM lamaran WHERE " + COLUMN_ID + " = " + permintaan.getId();
        
        try {
            Statement statement = connection.createStatement();
            return statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int updateStatusPermintaan(Permintaan permintaan){
        String query = "UPDATE permintaan SET " + COLUMN_STATUS + " = '" + permintaan.getStatus() + "' WHERE " + COLUMN_ID + " = " + permintaan.getId();
        
        try {
            Statement statement = connection.createStatement();
            return statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    
    public List<Permintaan> getListPermintaan(){
        ArrayList<Permintaan> listPermintaan = new ArrayList<>();
        String query = "SELECT * FROM permintaan";
        
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()){
                listPermintaan.add(new Permintaan(
                        resultSet.getInt(COLUMN_ID),
                        resultSet.getInt(COLUMN_ID_USER),
                        resultSet.getString(COLUMN_NAMA),
                        resultSet.getString(COLUMN_JENIS), 
                        resultSet.getString(COLUMN_STATUS))
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPermintaan;
    }
}
