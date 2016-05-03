/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nofry
 */
public class Employee {
    public String nama;
    public String jabatan;
    public String idKerja;
    public String istri;
    public int anak, thn;
    public final int gajiPokok = 4000000;
    
    public Employee (String nama, String jabatan, String idKerja, String istri, int anak, int thn){
        this.nama = nama;
        this.jabatan = jabatan;
        this.idKerja = idKerja;
        this.istri = istri;
        this.anak = anak;
        this.thn = thn;
    }
    
}
