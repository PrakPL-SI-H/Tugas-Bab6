package Praktikum6;

import java.util.Scanner;

public class KepegawaianMain {

    public static void main(String[] args) {
        int jum_anak = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("===========SISTEM INFORMASI KEPEGAWAIAN==========");
        System.out.print("Nama                               : ");
        String nama = in.next();
        System.out.print("ID pegawai                         : ");
        String id = in.next();
        System.out.print("Jabatan(Tetap,TidakTetap,Manager)  : ");
        String jabatan = in.next();
        System.out.print("Tahun masuk                        : ");
        int tahunmasuk = in.nextInt();
        System.out.print("Istri(y/n)                         : ");
        String istri = in.next();
        System.out.print("Anak(y/n)                          : ");
        String anak = in.next();
        if (anak.equalsIgnoreCase("Y")) {
            System.out.print("masukkan jumlah anak      : ");
            jum_anak = in.nextInt();
        }
        if (jabatan.equalsIgnoreCase("TidakTetap")) {
            PegawaiTidakTetap obj1 = new PegawaiTidakTetap(nama, id, jabatan, istri, anak, tahunmasuk, jum_anak);
            System.out.print("Masukkan jam kerja : ");
            int jam = in.nextInt();
            System.out.println("");
            obj1.setJamKerja(jam);
            System.out.println("=====Informasi Pegawai=====");
            System.out.println("nama    : " + nama);
            System.out.println("id      : " + id);
            System.out.println("jabatan : " + jabatan);
            System.out.println("gaji        : Rp." + obj1.getGaji());
            System.out.println("gaji lembur : Rp." + obj1.setLembur());
            System.out.println("total       : Rp." + obj1.total());
        } else if (jabatan.equals("manager")) {
            Manager obj2 = new Manager(nama, id, jabatan, istri, anak, tahunmasuk, jum_anak);
            obj2.setJabatan(tahunmasuk);
            System.out.println("=====Informasi Pegawai=====");
            System.out.println("nama    : " + nama);
            System.out.println("id      : " + id);
            System.out.println("jabatan : " + jabatan);
            System.out.println("gaji        : Rp." + obj2.getGaji());
            System.out.println("bonus       : Rp." + obj2.getBonus());
            System.out.println("tunjangan   : Rp." + obj2.getTunjangan());
            System.out.println("tun.jabatan : Rp." + obj2.getTunjanganJabatan());
            System.out.println("total       : Rp." + obj2.total());
        }
    }
}
