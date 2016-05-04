/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6;

public class Employee {

    public String nama, jabatan, status;
    public int idkerja, anak, tahunmasuk, masakerja;
    public final int tahunsekarang = 2016;
    private double salary;

    public Employee(String nama, int id, String jabatan, int tahunmasuk,double salary, String status, int anak) {
        this.nama = nama;
        idkerja = id;
        this.jabatan = jabatan;
        this.tahunmasuk = tahunmasuk;
        this.salary = salary;
        this.status = status;
        this.anak = anak;
    }
    public int getIdKerja() {
        return idkerja;
    }
    public int getMasaKerja(){
        masakerja = tahunsekarang - tahunmasuk;
        return masakerja;
    }
    public String getNama() {
        return nama;
    }
    public String getStatus() {
        return status;
    }
    public int getAnak() {
        return anak;
    }
    public double getSalary() {
        return salary;
    }
    public String getJabatan(){
        return jabatan;
    }
}
