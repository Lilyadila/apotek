/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.model;

/**
 *
 * @author user
 */
public class Permintaan {
    int id;
    int idUser;
    String nama;
    String jenis;
    String status;

    public Permintaan() {
    }

    public Permintaan(int id, int idUser, String nama, String jenis, String status) {
        this.id = id;
        this.idUser = idUser;
        this.nama = nama;
        this.jenis = jenis;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

