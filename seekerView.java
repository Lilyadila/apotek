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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import projek.PROJEK;

/**
 *
 * @author user
 */
public class seekerView extends JFrame{
    
    public JPanel northPanel, southPanel, centerPanel;
    public JLabel lTitle, lAuthor, lJabatan, lUsername, lPerintah, lNama, lJenis;
    public JTextField tfNama;
    public JComboBox cbJenis;
    public JButton btnSubmit, btnLogout;
    public final String[] JENIS = {"Obat keras", "Umum"};
    public final String[] LIST_POSISI = {"Web Developer", "Mobile Developer", "Cloud Engineer", "Design Product", "Operator"};

    public seekerView() {
        super(PROJEK.WINDOW_TITLE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100, 700);
        this.setLayout(null);

        init();
        Container seekerContainer = this.getContentPane();
        seekerContainer.setLayout(new BorderLayout(10, 10));
        
        seekerContainer.add(northPanel, BorderLayout.NORTH);
        seekerContainer.add(centerPanel, BorderLayout.CENTER);
        seekerContainer.add(southPanel, BorderLayout.SOUTH);
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void init() {
        northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        lTitle = new JLabel("PT. MAJU MUNDUR");
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
        lUsername = new JLabel("Thalib Abu Qitaal");
        lPerintah = new JLabel("Silahkan masukkan permintaan obat");
        lNama = new JLabel("Nama");
        tfNama = new JTextField(30);
        lJenis = new JLabel("Jenis");
        cbJenis = new JComboBox(JENIS);
        btnSubmit = new JButton("SUBMIT");
        btnLogout = new JButton("LOGOUT");
        
        Font labelFont = new Font("SansSerif", Font.PLAIN, 24);
        lUsername.setFont(new Font("SansSerif", Font.PLAIN, 16));
        lNama.setFont(labelFont);
        lJenis.setFont(labelFont);
        cbJenis.setBackground(Color.WHITE);
        
        lUsername.setBounds(910, 0, 150, 30);
        lNama.setBounds(100, 160, 300, 30);
        tfNama.setBounds(100, 200, 400, 30);
        lJenis.setBounds(100, 260, 300, 30);
        cbJenis.setBounds(100, 300, 400, 30);
        btnSubmit.setBounds(500, 470, 100, 30);
        btnLogout.setBounds(30, 0, 100, 30);
        
        centerPanel.add(lUsername);
        centerPanel.add(lJabatan);
        centerPanel.add(lPerintah);
        centerPanel.add(lNama);
        centerPanel.add(tfNama);
        centerPanel.add(lJenis);
        centerPanel.add(cbJenis);
        centerPanel.add(btnSubmit);
        centerPanel.add(btnLogout);
    }

    public String getNama() {
        return tfNama.getText().toString().trim();
    }

    public String getJenis() {
        return JENIS[cbJenis.getSelectedIndex()];
    }
    
}

