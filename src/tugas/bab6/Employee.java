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
    private int Idkerja;
    private String name;
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
    System.out.println(name + Idkerja + Jabatan + Status + anak + Tahun);
        
    }
    
}
