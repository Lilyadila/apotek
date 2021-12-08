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
import projek.model.Permintaan;
import projek.model.User;
import projek.view.seekerView;
import projek.view.LoginView;

/**
 *
 * @author user
 */
public class seekerController implements ActionListener{
    
    User user;
    seekerView seekerView;
    Database database;

    public seekerController(User user, seekerView seekerView) {
        this.user = user;
        this.seekerView = seekerView;
        this.database = new Database();
        
        seekerView.btnSubmit.addActionListener(this);
        seekerView.btnLogout.addActionListener(this);
        seekerView.lUsername.setText(user.getUsername());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(seekerView.btnSubmit)){
            if(seekerView.id.setText("");.getNama().isEmpty() || seekerView.jenis().isEmpty() || seekerView.status().isEmpty()){
                JOptionPane.showMessageDialog(jobseekerView,"Mohon ini dengan lengkap!","Alert",JOptionPane.WARNING_MESSAGE); 
            }
            else if(database.insertPermintaan(new Permintaan(0, user.getId(), seekerView.getNama(), seekerView.getjenis(), seekerView.status(), "")) != 0){
                JOptionPane.showMessageDialog(seekerView,"Permintaan BERHASIL dikirim!","Alert",JOptionPane.INFORMATION_MESSAGE);
                clearView();
            }
            else {
                JOptionPane.showMessageDialog(seekerView,"Permintaan GAGAL dikirim!","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(ae.getSource().equals(seekerView.btnLogout)){
            new LoginController(new LoginView());
            seekerView.dispose();
        }
    }
    
    public void clearView(){
        seekerView.id.setText("");
        seekerView.nama.setText("");
        seekerView.jenis.setSelectedIndex(0);
        seekerView.status.setSelectedIndex(0);
    }
}

