package Laporan6Bab6;

import java.util.Scanner;

public class MainKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        String nama, idkerja, pilis, jabatan, lagi = null;
        int anak, pilih, tahunKerja, istri, jam, hari;
        while (!"N".equals(lagi)) {
            System.out.println("========================= =================================");
            System.out.println("                  Program Gaji Perusahaan");
            System.out.println("========================= =================================");
            System.out.print("Masukkan Nama                     : ");
            nama = inputStr.nextLine();
            System.out.print("Masukkan ID                       : ");
            idkerja = inputStr.nextLine();
            System.out.print("Apakah Anda Mempunyai Istri (Y/N) : ");
            pilis = inputStr.nextLine();
            if ("Y".equals(pilis)) {
                istri = 1;
            } else {
                istri = 0;
            }
            System.out.print("Jumlah Anak Kandung               : ");
            anak = input.nextInt();
            System.out.println("======================== ==================================");
            System.out.println("1. Manager");
            System.out.println("2. Pegawai Tetap");
            System.out.println("3. Pegawai Tidak Tetap");
            System.out.print("Masukkan Nomor Jabatan : ");
            pilih = input.nextInt();
            if (pilih == 1) {
                jabatan = "Manager";
                System.out.print("Bekerja Sejak Tahun : ");
                tahunKerja = input.nextInt();
                Manager tes = new Manager(nama, idkerja, jabatan, istri, anak, tahunKerja);
                System.out.println(tes);
            } else if (pilih == 2) {
                jabatan = "Pegawai Tetap";
                System.out.print("Bekerja Sejak Tahun : ");
                tahunKerja = input.nextInt();
                KaryawanTetap tes = new KaryawanTetap(nama, idkerja, jabatan, istri, anak, tahunKerja);
                System.out.println(tes);
            } else if (pilih == 3) {
                jabatan = "Pegawai Tidak Tetap";
                System.out.print("Lama berkerja dalam sehari (jam)          : ");
                jam = input.nextInt();
                System.out.print("Lama Bekerja Lembur dalam Seminggu (hari) : ");
                hari = input.nextInt();
                KaryawanTidakTetap tes = new KaryawanTidakTetap(nama, idkerja, jabatan, istri, anak, hari, jam);
                System.out.println(tes);
            }
            System.out.print("Apakah anda ingin menginputnya lagi (Y/N) : ");
            lagi = inputStr.next();
        }
    }
}
