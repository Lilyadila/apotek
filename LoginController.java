/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import projek.db.Database;
import projek.model.User;
import projek.view.seekerView;
import projek.view.LoginView;
import projek.view.SignupView;
/**
 *
 * @author user
 */
public class LoginController implements ActionListener{
    
    LoginView loginView;
    Database database;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.database = new Database();
        
        loginView.btnLogin.addActionListener(this);
        loginView.btnSignup.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(loginView.btnLogin)){
            User user = database.getUser(loginView.getUsername(), loginView.getPassword());
            if(user.getId() == -1 || user.getId() == -2){
                JOptionPane.showMessageDialog(loginView,"Username atau Password salah!","Alert",JOptionPane.WARNING_MESSAGE); 
            }
            else { 
                JOptionPane.showMessageDialog(loginView,"Login sukses",JOptionPane.WARNING_MESSAGE); 

                }
            }
        }
        else if (ae.getSource().equa{
            new SignupController(new SignupView());
            loginView.dispose();
        return null;
        }
    }
    
}
