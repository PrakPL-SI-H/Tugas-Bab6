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
public class Manager extends Employee {
    private double bonus;
    private double tunjangan;
    private String name;
    private int Idkerja;
    private String Jabatan;
    private String Status;
    private int anak;
    private int Tahun;
    private int jumlahtj;
    private final int gaji = 1000000;
    public Manager(String name,int Idkerja,String Jabatan,String Status,int anak,int Tahun){
        super (name, Idkerja, Jabatan, Status, anak, Tahun);//harus ada paling atas
    }
    public void tunjanganMJ(){
        jumlahtj = (int) (gaji + hasil + tunjangan);
        System.out.println("mendapatkan tunjangan jabatan sebesar 0.1 dari jumlah gaji (gaji+lama kerja+tunjangan)");
        System.out.println("Jadi tunjangannya : " + jumlahtj);
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
    @Override
    public void tunjangan (){
    hasil = 2016-Tahun;
    if(hasil <= 5){
        System.out.println("Tidak mendapat bonus");
    }else if(hasil>=6 && hasil<=10){
        System.out.println("Mendapat bonus 0.05 dari lama kerja ");
        System.out.println("Tidak mendapatkan tunjangan");
    }else{
        System.out.println("mendapatkan bonus 0.1 dari lama kerja");
        System.out.println("mendapatkan tunjangan 0.1 dari lama kerja");
        }
    }
    @Override
    public void Status(){
    if ("ya".equals(Status) ){
        System.out.println("mendapatkan tunjangan 0.1 dari total gaji yang didapat (gaji+lama kerja+tunjangan)");
    }else{
        System.out.println("Jika belum kawin tunjangan istri 0 rupiah ");
        }
    }
    @Override
    public void anak(){
        if (anak == 1){
        System.out.println("tunjangan anak sebesar 0.15 dari jumlah gaji yang di dapatkan (gaji+lama kerja+tunjangan)");
        } else if (anak == 2){
        System.out.println("tunjangan anak sebesar 0.15 dari jumlah gaji yang di dapatkan (gaji+lama kerja+tunjangan)");
        } else if (anak == 3){
        System.out.println("tunjangan anak sebesar 0.15 dari jumlah gaji yang di dapatkan (gaji+lama kerja+tunjangan)");
        }else 
        System.out.println("tidak mendapatkan tunjangan untuk anak");
    }
    @Override
    public void Tampilan(){
        System.out.println("Nama        : "+ name );
        System.out.println("Jabatan     : "+ Jabatan );
        System.out.println("Id Kerja    : "+ Idkerja );
        System.out.println("Status Kawin: "+ Status);
        System.out.println("Jumlah Anak : "+ anak );
        System.out.println("Awal Masuk  : "+ Tahun );
        System.out.println("Tunjangan   : "+ hasil );
        System.out.println("Tunjangan Mj: "+ jumlahtj );
    }
    
}
