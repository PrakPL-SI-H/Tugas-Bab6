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
    public void HitungGaji(){
        if (jam > 10){
            lembur = jam - 10;
            this.gaji = gajiDasar+ (10000 * lembur);
        }
        else{
            this.gaji = gajiDasar;
        }
    }
     public void Tampilkan(){
       System.out.println("TERIMAKASIH TELAH MENGISI DATA");
        System.out.println("Inilah rincian tentang anda");
        System.out.println("_____=====^^^^^=====^^^^^=====_____");
        System.out.println("Nama anda        : "+nama);
       System.out.println("Jabatan anda      : "+jabatan);
        System.out.println("ID anda          : "+ID);
        System.out.println("Tahun Masuk anda : "+thn);
        System.out.println("Gaji anda        : Rp."+gaji+"/Bulan");
        System.out.println("_____=====^^^^^=====^^^^^=====_____");
    }
 }
