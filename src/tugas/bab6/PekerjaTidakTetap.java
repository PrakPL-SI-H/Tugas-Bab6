/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Prasetyo
 */
public class PekerjaTidakTetap extends Employee {
    private double bonus;
    private double tunjangan;
    private String name;
    private int Idkerja;
    private String Jabatan;
    private String Status;
    private int anak;
    private int Tahun;
    public PekerjaTidakTetap(String name,int Idkerja,String Jabatan,String Status,int anak,int Tahun){
        super (name, Idkerja, Jabatan, Status, anak, Tahun);//harus ada paling atas
    }
    @Override
    public String Getnama(){
    return name;
    }
    @Override
    public String GetJabatan(){
    return Jabatan;
    }
    @Override
    public int GetIdKerja(){
    return Idkerja;
    }
    
}
