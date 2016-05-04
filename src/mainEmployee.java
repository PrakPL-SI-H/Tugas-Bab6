package employee;

import java.util.Scanner;

public class mainEmployee {

    public static void main(String[] args) {

        System.out.println("========Perhitungan Gaji Karyawan========");
        System.out.println("");
        System.out.println("DATA PEGAWAI");
        Scanner input = new Scanner(System.in);
        int jmlhAnak = 0;
        boolean ulang = false;
        do {
            ulang = false;
            System.out.print("Nama                       : ");
            String nama = input.next();
            System.out.print("Jabatan                    : ");
            String jabatan = input.next();
            System.out.print("Tahun Masuk Kerja (Tahun)  : ");
            int masakerja = input.nextInt();
            System.out.print("Mempunyai istri(Ya/Tidak)  : ");
            String istri = input.next();
            System.out.print("Mempunyai anak(Ya/Tidak)   : ");
            String anak = input.next();
            if (anak.equalsIgnoreCase("Ya")) {
                System.out.print("\t--Jumlah anak :");
                jmlhAnak = input.nextInt();
            }
            if (jabatan.equalsIgnoreCase("NonPNS")) {
                System.out.println("Total jam kerja: ");
                int jamkerja = input.nextInt();
                pegawaiTidakTetap NonPNS = new pegawaiTidakTetap(nama, "037", jabatan, istri, anak, masakerja, 500000, jmlhAnak);
                NonPNS.setJamKerja(jamkerja);
                System.out.println("");
                System.out.println("==============================================");
                System.out.println("             DATA GAJI KARYAWAN               ");
                System.out.println("==============================================");
                System.out.println("ID         : " + NonPNS.getID() + "" + NonPNS.Counting());
                System.out.println("Nama       : " + NonPNS.getNama());
                System.out.println("Jabatan    : " + jabatan);
                System.out.println("--------------------------------------------");
                System.out.println("Gaji          : Rp" + 500000);
                System.out.println("Gaji lembur   : Rp" + NonPNS.getGajiLembur());
                System.out.println("--------------------------------------------+");
                System.out.println("Total Gaji    : Rp " + NonPNS.getGaji());
                System.out.println("--------------------------------------------");
            }
            if (jabatan.equalsIgnoreCase("PNS")) {
                pegawaiTetap PNS = new pegawaiTetap(nama, "P01", jabatan, istri, anak, masakerja, 500000, jmlhAnak);
                PNS.tunjanganDanBonus(masakerja);
                System.out.println("");
                System.out.println("==============================================");
                System.out.println("             DATA GAJI KARYAWAN               ");
                System.out.println("==============================================");
                System.out.println("ID          : " + PNS.getID() + "" + PNS.Counting());
                System.out.println("Nama        : " + PNS.getNama());
                System.out.println("Jabatan     : " + jabatan);
                System.out.println("--------------------------------------------");
                System.out.println("Gaji          : Rp" + 500000);
                System.out.println("Tunjangan     : Rp " + PNS.getTunjangan());
                System.out.println("Bonus         : Rp " + PNS.getBonus());
                System.out.println("--------------------------------------------+");
                System.out.println("Total Gaji    : Rp" + PNS.getGaji());
                System.out.println("--------------------------------------------");
            }
            if (jabatan.equalsIgnoreCase("manager")) {
                manager boss = new manager(nama, "M01", jabatan, istri, anak, masakerja, 500000, jmlhAnak);
                boss.tunjanganDanBonus(masakerja);
                System.out.println("");
                System.out.println("==============================================");
                System.out.println("             DATA GAJI KARYAWAN               ");
                System.out.println("==============================================");
                System.out.println("ID          : " + boss.getID() + "" + boss.Counting());
                System.out.println("Nama        : " + boss.getNama());
                System.out.println("Jabatan     : " + jabatan);
                System.out.println("--------------------------------------------");
                System.out.println("Gaji                : Rp " + 500000);
                System.out.println("Tunjangan           : Rp " + boss.getTunjangan());
                System.out.println("Tunjangan Jabatan   : Rp " + boss.getTunjanganJabatan());
                System.out.println("Bonus               : Rp" + boss.getBonus());
                System.out.println("--------------------------------------------+");
                System.out.println("Total Gaji          : Rp " + boss.getGaji());
                System.out.println("--------------------------------------------");
            }
            System.out.println("===========================================");
            System.out.println("Apakah anda ingin menginputkan lagi? ");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Masukkan pilihan: ");
            int pil = input.nextInt();
            if (pil == 1) {
                ulang = true;
            } else if (pil == 2) {
                System.out.println("==============TERIMAKASIH==============");
                break;
            } else {
                System.out.println("Maaf pilihan yg diinputkan salah");
                break;
            }
        } while (ulang == true);
    }
}