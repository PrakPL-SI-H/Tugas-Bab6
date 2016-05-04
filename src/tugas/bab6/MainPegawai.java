/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan;

import java.util.Scanner;

/**
 *
 * @author TEGAR
 */
public class MainPegawai {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
    String nama, idKerja,jabatan, istri,answer;
    int anak, thn, jam;
         Scanner in = new Scanner(System.in);
         do{
           System.out.println("PROGRAM GAJI PEKERJA PT CUKACAMACUKA");
         System.out.print("silahkan memasukkan nama                                                                : ");
         nama = in.next();
         in.next();
         System.out.print("silahkan memasukkan ID anda                                                             : ");
         idKerja = in.next();
         System.out.print("Tahun berapakah anda bergabung di PT ini?                                               : ");
         thn = in.nextInt();
         System.out.print("Apa jabatan anda sekarang di PT ini?(Manajer/Pegawai Tetap/Pegawai Tidak Tetap)         : ");
         jabatan = in.next();
         
           if(jabatan.equalsIgnoreCase("Pegawai Tetap")){
             System.out.print("Apakah anda sudah menikah/memiliki istri?(y/n)                                        : ");
             istri = in.next();
             System.out.print("Berapakah Jumlah Anak Anda?                                                           : ");
             anak = in.nextInt();

            PegawaiTetap TTP = new PegawaiTetap(nama,"Pegawai Tetap",idKerja,istri,anak,thn);
             TTP.HitungGaji();
             TTP.Tampikan();
         }
         else if(jabatan.equalsIgnoreCase("Manajer")){
             System.out.print("Apakah anda sudah menikah/memiliki istri?(y/n)                                        : ");
             istri = in.next();
             System.out.print("Berapakah Jumlah Anak Anda?                                                           : ");
             anak = in.nextInt();
             Manajer BOSS = new Manajer(nama,jabatan,idKerja,istri,anak,thn);
             BOSS.HitungGaji();
             BOSS.Tampikan();
         }

        else if(jabatan.equalsIgnoreCase("Pegawai Tidak Tetap")){
             System.out.print("masukkanlah Jumlah Jam kerja anda   : ");
             jam = in.nextInt();

            PegawaiNoTetap PTT = new PegawaiNoTetap(nama,"Pegawai Tidak Tetap",idKerja,"n",0,thn, jam);
             PTT.HitungGaji();
             PTT.Tampilkan();
         }
         else{
             System.out.println("-Masukan Anda Tidak Ditemukan,Coba Ulang sesaat lagi-");
         }
System.out.print("Melanjutkan Program ini? (Y/N) ");
        answer = in.next();
    }while(answer.equalsIgnoreCase("Y"));
 }
 }