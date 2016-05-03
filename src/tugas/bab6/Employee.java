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
public class Employee {
    private double bonus;
    private double tunjangan;
    private String name;
    private int Idkerja;
    private String Jabatan;
    private String Status;
    private int anak;
    private int Tahun;
    public Employee(String name,int Idkerja,String Jabatan,String Status,int anak,int Tahun){
        this.name = name;
        this.Idkerja = Idkerja;
        this.Status = Status;
        this.anak = anak;
        this.Jabatan=Jabatan;
        this.Tahun = Tahun;
    }
    public void tunjangan (){
    if(Tahun <= 5){
     
    }else if(Tahun>=6 && Tahun<=10){
    
    }else
        System.out.println("");
    }
    public String Getnama(){
    return name;
    }
    public String GetJabatan(){
    return Jabatan;
    }
    public int GetIdKerja(){
    return Idkerja;
    }
}