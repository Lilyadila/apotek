/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek;

import projek.controller.LoginController;
import projek.db.ConnectionHelper;
import projek.view.seekerView;
import projek.view.LoginView;
import projek.view.SignupView;

/**
 *
 * @author user
 */
public class PROJEK {

    public static final String WINDOW_TITLE = "PROJEK APOTEK";
    
    public static void main(String[] args) {
        new LoginController(new LoginView());
    }
    
}
