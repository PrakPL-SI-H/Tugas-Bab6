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
public class PegawaiTetap extends Employee{
    public int gajiPT;
    public int lamaKerja;
 
    public PegawaiTetap(String nama, String jabatan, String idKerja, String istri, int anak, int thn) {
        super(nama, jabatan, idKerja, istri, anak, thn);
    }
     
}