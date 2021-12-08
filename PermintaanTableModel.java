/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class PermintaanTableModel extends AbstractTableModel{

    public final String[] HEADER = {"Nama Lengkap", "Jenis", "Status"};
    List<Permintaan> listPermintaan;

    public PermintaanTableModel() {
        this.listPermintaan = new ArrayList<>();
    }
    
    public void resetData(List<Permintaan> listPermintaan){
        this.listPermintaan = listPermintaan;
        fireTableDataChanged();
    }
    
    public Permintaan getPermintaan(int index){
        return listPermintaan.get(index);
    }
    
    @Override
    public int getRowCount() {
        return listPermintaan.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }
    
    @Override
    public String getColumnName(int i) {
        return HEADER[i];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Permintaan permintaan = listPermintaan.get(rowIndex);
        
        switch(columnIndex){
            case 0: return permintaan.getNama();
            case 1: return permintaan.getJenis();
            case 2: return permintaan.getStatus();
            default: return null;
        }
    }
}

