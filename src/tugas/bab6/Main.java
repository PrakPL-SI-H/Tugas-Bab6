package XXX;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int jum_anak = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("===========SISTEM INFORMASI KEPEGAWAIAN==========");

        System.out.print("Nama                               : ");
        String nama = in.next();
        System.out.print("ID pegawai                         : ");
        String id = in.next();
        System.out.print("Jabatan(Manager,TidakTetap,Tetap)  : ");
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
        if (jabatan.equalsIgnoreCase("manager")) {
            Manager O1 = new Manager(nama, id, jabatan, istri, anak, tahunmasuk, jum_anak);
            O1.setJabatan(tahunmasuk);
            System.out.println("");
            System.out.println("=====Informasi Pegawai=====");
            System.out.println("Nama    : " + nama);
            System.out.println("Id      : " + id);
            System.out.println("Jabatan : " + jabatan);
            System.out.println("Gaji pokok  : Rp." + O1.getGaji());
            System.out.println("Bonus       : Rp." + O1.getBonus());
            System.out.println("Tunjangan   : Rp." + O1.getTunjangan());
            System.out.println("Tun.jabatan : Rp." + O1.getTunjanganJabatan());
            System.out.println("Total       : Rp." + O1.total());
        } else if (jabatan.equalsIgnoreCase("TidakTetap")) {
            PegawaiTidakTetap O2 = new PegawaiTidakTetap(nama, id, jabatan, istri, anak, tahunmasuk, jum_anak);
            System.out.print("Masukkan jam kerja : ");
            int jam = in.nextInt();
            System.out.println("");
            O2.setJamKerja(jam);
            System.out.println("");
            System.out.println("=====Informasi Pegawai=====");
            System.out.println("Nama    : " + nama);
            System.out.println("Id      : " + id);
            System.out.println("Jabatan : " + jabatan);
            System.out.println("Gaji pokok  : Rp." + O2.getGaji());
            System.out.println("Gaji lembur : Rp." + O2.setLembur());
            System.out.println("Total       : Rp." + O2.total());
        } else if (jabatan.equalsIgnoreCase("tetap")) {
            PegawaiTetap O3 = new PegawaiTetap(nama, id, jabatan, istri, anak, tahunmasuk, jum_anak);
            O3.setJabatan(tahunmasuk);
            System.out.println("");
            System.out.println("=====Informasi Pegawai=====");
            System.out.println("Nama    : " + nama);
            System.out.println("Id      : " + id);
            System.out.println("Jabatan : " + jabatan);
            System.out.println("Gaji pokok  : Rp." + O3.getGaji());
            System.out.println("Bonus       : Rp." + O3.getBonus());
            System.out.println("Tunjangan   : Rp." + O3.getTunjangan());
            System.out.println("Total       : Rp." + O3.total());

        }
    }
}
