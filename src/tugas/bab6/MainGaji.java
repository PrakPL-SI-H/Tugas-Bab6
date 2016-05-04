
package maingaji;

import java.util.Scanner;


public class MainGaji {

    
    public static void main(String[] args) {
        System.out.println("++++++===========================================++++++");
        System.out.println("+++        Program Perhitungan Gaji Karyawan        +++");
        System.out.println("++++++===========================================++++++");
        System.out.println("\n\t\t+INPUTKAN Jumlah PEGAWAI+");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Pegawai   : ");
        int pegawai = input.nextInt();
        int jmlanak = 0;
        for (int i = 0; i < pegawai; i++) {
            System.out.println("\n\t\t+INPUTKAN DATA PEGAWAI+");
            System.out.print("Nama                       : ");
            String nama = input.next();
            System.out.print("ID                         : ");
            String id = input.next();
            System.out.print("Jabatan                    : ");
            String jabatan = input.next();
            System.out.print("Tahun Bekerja              : ");
            int masakerja = input.nextInt();
            System.out.print("Mempunyai istri(Ya/Tidak)  : ");
            String istri = input.next();
            System.out.print("Mempunyai anak(Ya/Tidak)   : ");
            String anak = input.next();
            if (anak.equalsIgnoreCase("Ya")) {
                System.out.print("\t--Jumlah anak :");
                jmlanak = input.nextInt();
            }
            if (jabatan.equalsIgnoreCase("NonPNS")) {
                System.out.print("Total jam kerja: ");
                int jamkerja = input.nextInt();
                PegawaiTakTetap pegawai1 = new PegawaiTakTetap(nama, id, jabatan, istri, anak, masakerja, 500000, jmlanak);
                pegawai1.setJamKerja(jamkerja);
                System.out.println("\n======================================================");
                System.out.println("                 DATA GAJI KARYAWAN                ");
                System.out.println("======================================================");
                System.out.println("Nama staff : " + pegawai1.getName());
                System.out.println("ID         : " + pegawai1.getID());
                System.out.println("Jabatan    : " + jabatan);
                System.out.println("Lama Kerja : " + pegawai1.lamaKerja());
                System.out.println("--------------------------------------------");
                System.out.println("Gaji                : " + 500000);
                System.out.println("Gaji lembur: " + pegawai1.getGajiLembur());
                System.out.println("-------------------------------------++++");
                System.out.println("Total Gaji : " + pegawai1.getGaji());
                System.out.println("--------------------------------------------");

            }
            if (jabatan.equalsIgnoreCase("PNS")) {
                PegawaiTetap staff = new PegawaiTetap(nama, id, jabatan, istri, anak, masakerja, 1000000, jmlanak);
                staff.tunjanganDanBonus(masakerja);
                System.out.println("\n======================================================");
                System.out.println("                 DATA GAJI KARYAWAN                ");
                System.out.println("=======================================================");
                System.out.println("Nama                : " + staff.getName());
                System.out.println("ID                  : " + staff.getID());
                System.out.println("Jabatan             : " + jabatan);
                System.out.println("Lama Kerja          : " + staff.lamaKerja());
                System.out.println("--------------------------------------------");
                System.out.println("Gaji                : " + 1000000);
                System.out.println("Tunjangan           : " + staff.getTunjangan());
                System.out.println("Bonus               : " + staff.getBonus());
                System.out.println("-------------------------------------++++");
                System.out.println("Total Gaji          : " + staff.getGaji());
                System.out.println("--------------------------------------------");
            }
            if (jabatan.equalsIgnoreCase("Manajer")) {
                Manajer boss = new Manajer(nama, id, jabatan, istri, anak, masakerja, 2500000, jmlanak);
                boss.tunjanganDanBonus(masakerja);
                System.out.println("\n======================================================");
                System.out.println("                 DATA GAJI KARYAWAN                ");
                System.out.println("======================================================");
                System.out.println("Nama                : " + boss.getName());
                System.out.println("ID                  : " + boss.getID());
                System.out.println("Jabatan             : " + jabatan);
                System.out.println("Lama Kerja          : " + boss.lamaKerja());
                System.out.println("--------------------------------------------");
                System.out.println("Gaji                : " + 2500000);
                System.out.println("Tunjangan           : " + boss.getTunjangan());
                System.out.println("Tunjangan Jabatan   : " + boss.gettunjanganJabatan());
                System.out.println("Bonus               : " + boss.getBonus());
                System.out.println("-------------------------------------++++");
                System.out.println("Total Gaji          : " + boss.getGaji());
                System.out.println("--------------------------------------------");
            }
            System.out.println("++++++===========================================++++++");
        }
    }
}
