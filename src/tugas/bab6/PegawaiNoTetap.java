/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan;

/**
 *
 * @author TEGAR
 */

 public class PegawaiNoTetap extends Employee {
    public int lembur;
    public int jam;
    public int gaji;
 

    public PegawaiNoTetap(String nama, String jabatan, String idKerja, String istri, int anak, int thn, int jam) {
        super(nama, jabatan, idKerja, istri, anak, thn);
    }
 }
