package tugas.bab6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t   Pengecekan Gaji Pegawai    ");
        System.out.println("\t==============================");
        System.out.println("");
        int bnykAnak = 0;
        System.out.print("Nama                  : ");
        String nama = input.nextLine();
        System.out.print("ID                    : ");
        String id = input.next();
        input.nextLine();
        System.out.print("Jabatan               : ");
        String jabatan = input.nextLine();
        System.out.print("Mulai Bekerja Tahun   : ");
        int TahunMasuk = input.nextInt();
        System.out.print("Mempunyai istri(Y/N)  : ");
        String istri = input.next();
        System.out.print("Mempunyai anak (Y/N)  : ");
        String anak = input.next();

        if (anak.equalsIgnoreCase("Y")) {
            System.out.print("Mempunyai berapa anak : ");
            bnykAnak = input.nextInt();
        }
        if (jabatan.equalsIgnoreCase("Non Pns")) {
            System.out.println("Total jam kerja: ");
            int jamkerja = input.nextInt();
            Non_Pns pegawai1 = new Non_Pns(nama, id,jabatan, istri, anak, bnykAnak, TahunMasuk);
            pegawai1.setJamKerja(jamkerja);
            System.out.println();
            System.out.println("       DATA GAJI ANDA       ");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            System.out.println("Nama Pegawai : " + pegawai1.getNama());
            System.out.println("Jabatan      : " + jabatan);
            System.out.println();
            System.out.println("Gaji Pokok Anda   :Rp  " + pegawai1.Gaji);
            System.out.println("Gaji lembur Anda  :Rp  " + pegawai1.getGajiLembur());
            System.out.println("============================");
            System.out.println();
            System.out.println("Total Gaji yang anda peroleh    :Rp  " + pegawai1.getGaji());
            System.out.println("============================");
            System.out.println();
        }
        if (jabatan.equalsIgnoreCase("PNS")) {
            Pns staff = new Pns(nama, id, jabatan, istri, anak,bnykAnak, TahunMasuk);
            int lama = 2016 - TahunMasuk;
            staff.tunjanganDanBonus(lama);
            System.out.println();
            System.out.println("         DATA GAJI ANDA     ");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            System.out.println("Nama Staff          : " + staff.getNama());
            System.out.println("Jabatan             : " + jabatan);
            System.out.println();
            System.out.println("Gaji Pokok Anda           :Rp  " + staff.Gaji);
            System.out.println("Tunjangan Anda            :Rp  " + staff.getTunjangan());
            System.out.println("Bonus yang anda peroleh   :Rp  " + staff.getBonus());
            System.out.println("============================");
            System.out.println();
            System.out.println("Total Gaji yang anda peroleh    :Rp  " + staff.getGaji());
            System.out.println("============================");
            System.out.println();
        }
        if (jabatan.equalsIgnoreCase("Manager")) {
            Manager atasan = new Manager(nama, id, jabatan, istri, anak, bnykAnak, TahunMasuk);
            int lama = 2016 - TahunMasuk;
            atasan.tunjanganDanBonus(lama);
            System.out.println();
            System.out.println("       DATA GAJI ANDA       ");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            System.out.println("Nama Manager        : " + atasan.getNama());
            System.out.println("Jabatan             : " + jabatan);
            System.out.println();
            System.out.println("Gaji Pokok Anda           :Rp  " + atasan.Gaji);
            System.out.println("Tunjangan Anda            :Rp  " + atasan.getTunjangan());
            System.out.println("Tunjangan Jabatan Anda    :Rp  " + atasan.gettunjanganJabatan());
            System.out.println("Bonus yang anda peroleh   :Rp  " + atasan.getBonus());
            System.out.println("============================");
            System.out.println();
            System.out.println("Total Gaji yang anda peroleh    :Rp  " + atasan.getGaji());
            System.out.println("============================");
            System.out.println();
        }
    }
}
