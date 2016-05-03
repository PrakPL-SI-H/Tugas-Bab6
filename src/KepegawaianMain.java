package Praktikum6;

import java.util.Scanner;

public class KepegawaianMain {

    public static void main(String[] args) {
        int jum_anak = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("===========SISTEM INFORMASI KEPEGAWAIAN==========");
        System.out.println("Nama                               : ");
        String nama = in.next();
        System.out.println("ID pegawai                         : ");
        String id = in.next();
        System.out.println("Jabatan(Tetap,Tidak tetap,Manager) : ");
        String jabatan = in.next();
        System.out.println("Tahun masuk                        : ");
        int tahunmasuk = in.nextInt();
        System.out.println("Istri(y/n)                         : ");
        String istri = in.next();
        System.out.println("Anak(y/n)                          : ");
        String anak = in.next();
        System.out.println("");
        if (anak.equalsIgnoreCase("Y")) {
            System.out.print("masukkan jumlah anak      : ");
            jum_anak = in.nextInt();
        }
        System.out.println("");
        
    }
}
