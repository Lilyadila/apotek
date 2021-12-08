/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import projek.PROJEK;

/**
 *
 * @author user
 */
public class SignupView extends JFrame{
    public JPanel northPanel, southPanel, centerPanel;
    public JLabel lTitle, lUsername, lPassword, lAuthor, lLogin, lNama;
    public JTextField tfUsername, tfNama;
    public JPasswordField pfPassword;
    public JComboBox cbPosisi;
    public JButton btnLogin, btnSignup;

            
    public SignupView() {
        super(PROJEK.WINDOW_TITLE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100, 700);
        this.setLayout(null);

        init();
        Container signupContainer = this.getContentPane();
        signupContainer.setLayout(new BorderLayout(10, 10));
        
        signupContainer.add(northPanel, BorderLayout.NORTH);
        signupContainer.add(centerPanel, BorderLayout.CENTER);
        signupContainer.add(southPanel, BorderLayout.SOUTH);
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void init() {
        northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        lTitle = new JLabel("SIGN UP");
        lTitle.setFont(new Font("SansSerif", Font.BOLD, 32));
        lTitle.setBorder(null);
        lTitle.setOpaque(false);
        northPanel.add(lTitle, FlowLayout.LEFT);
        
        
        southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        lAuthor = new JLabel("this is our     ");
        lAuthor.setFont(new Font("SansSerif", Font.PLAIN, 15));
        lAuthor.setBorder(null);
        lAuthor.setOpaque(false);
        southPanel.setBackground(Color.WHITE);
        southPanel.add(lAuthor, FlowLayout.LEFT);
        
        
        centerPanel = new JPanel(null);
        lNama = new JLabel("Nama");
        tfNama = new JTextField(50);
        lUsername = new JLabel("Username");
        tfUsername = new JTextField(30);
        lPassword = new JLabel("Password");
        pfPassword = new JPasswordField(30);
        btnSignup = new JButton("SIGN UP");
        lLogin = new JLabel("Sudah punya akun? klik log in");
        btnLogin = new JButton("LOG IN");
        
        Font labelFont = new Font("SansSerif", Font.PLAIN, 24);
        lNama.setFont(labelFont);
        lUsername.setFont(labelFont);
        lPassword.setFont(labelFont);
        lLogin.setFont(new Font("SansSerif", Font.PLAIN, 18));
        cbPosisi.setBackground(Color.WHITE);
        
        lNama.setBounds(100, 80, 300, 30);
        tfNama.setBounds(100, 120, 400, 30);
        cbPosisi.setBounds(100, 220, 400, 30);
        lUsername.setBounds(600, 80, 300, 30);
        tfUsername.setBounds(600, 120, 400, 30);
        lPassword.setBounds(600, 180, 300, 30);
        pfPassword.setBounds(600, 220, 400, 30);
        btnSignup.setBounds(500, 300, 100, 30);
        lLogin.setBounds(430, 370, 350, 30);
        btnLogin.setBounds(500, 410, 100, 30);
        
        
        centerPanel.add(lNama);
        centerPanel.add(tfNama);
        centerPanel.add(lUsername);
        centerPanel.add(tfUsername);
        centerPanel.add(lPassword);
        centerPanel.add(pfPassword);
        centerPanel.add(btnSignup);
        centerPanel.add(lLogin);
        centerPanel.add(btnLogin);
    }

    public String getUsername() {
        return tfUsername.getText().toString().trim();
    }

    public String getNama() {
        return tfNama.getText().toString().trim();
    }

    public String getPassword() {
        return pfPassword.getText().toString().trim();
    }

    public String getPosisi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

