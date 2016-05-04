/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporaninherit;

/**
 *
 * @author Istighfarin Bahtiar Amry
 * @NIM    155150401111129
 * @KElas  SI-H
 */
public class Employee {

    public String nama, jabatan, id, status;
    int thn, anak;
    static double gaji, bonus;

    public Employee(String nama, String jabatan, String id, String status, int anak, int thn) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.id = id;
        this.status = status;
        this.anak = anak;
        this.thn = thn;
    }
    //pembuatan method getter
    public double getGaji() {
        return gaji;
    }
    

    public String getNama() {
        return nama;
    }
    public String getId() {
        return id;
    }

    public String getJab() {
        return jabatan;
    }

    

    
}


