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
         
System.out.print("Melanjutkan Program ini? (Y/N) ");
        answer = in.next();
    }while(answer.equalsIgnoreCase("Y"));
 }
 }