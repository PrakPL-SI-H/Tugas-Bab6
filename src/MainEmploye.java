package ww;
import java.util.Scanner;
public class MainEmploye {
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
            System.out.print("Tahun Masuk Kerja          : ");
            int masakerja = input.nextInt();
            System.out.print("Mempunyai istri(Ya/Tidak)  : ");
            String istri = input.next();
            System.out.print("Mempunyai anak(Ya/Tidak)   : ");
            String anak = input.next();
            if (anak.equalsIgnoreCase("Ya")) {
                System.out.print("\t--Jumlah anak :");
                jmlhAnak = input.nextInt();
            }  if (jabatan.equalsIgnoreCase("PegawaiTidakTetap")) {
                System.out.println("Total jam kerja: ");
                int jamkerja = input.nextInt();
               pegawaiTidakTetap tidak = new pegawaiTidakTetap(nama, "037", jabatan, istri, anak, masakerja, 5000000, jmlhAnak);
                tidak.setJamKerja(jamkerja);
                System.out.println(""); 
                System.out.println("==============================================");
System.out.println("=============DATA GAJI KARYAWAN==============="); 
System.out.println("==============================================");
System.out.println("ID : " + tidak.getID() + "" +tidak.Counting());
System.out.println("Nama       : " + tidak.getNama());
System.out.println("Jabatan    : " + jabatan);
System.out.println("............................................");
System.out.println("Gaji              : Rp" + 5000000);
System.out.println("Gaji lembur       : Rp" + tidak.getGajiLembur());
System.out.println("............................................+");
System.out.println("Total Gaji :Rp " + tidak.getGaji());
System.out.println("............................................");
            } if (jabatan.equalsIgnoreCase("PegawaiTetap")) {
                PegawaiTetap tetap = new PegawaiTetap(nama, "P01", jabatan, istri, anak, masakerja, 5000000, jmlhAnak);
                tetap.tunjanganDanBonus(masakerja);
                System.out.println("");            
                System.out.println("==============================================");
System.out.println("=============DATA GAJI KARYAWAN===============");  
System.out.println("==============================================");
System.out.println("ID     : " + tetap.getID()  + "" + tetap.Counting());
System.out.println("Nama                : " + tetap.getNama());
System.out.println("Jabatan             : " + jabatan);
System.out.println("............................................");
System.out.println("Gaji                : Rp " + 5000000);
System.out.println("Tunjangan           : Rp " + tetap.getTunjangan());
System.out.println("Bonus               : Rp " + tetap.getBonus());
System.out.println("........................................+");
System.out.println("Total Gaji          : Rp " + tetap.getGaji());
System.out.println("............................................");
            } if (jabatan.equalsIgnoreCase("manajer")) {
                manajer boss = new manajer(nama, "M01", jabatan, istri, anak, masakerja, 5000000, jmlhAnak);
                boss.tunjanganDanBonus(masakerja);
                System.out.println("");    
                System.out.println("==============================================");
System.out.println("=============DATA GAJI KARYAWAN===============");                
System.out.println("==============================================");
System.out.println("ID    : " + boss.getID() + "" + boss.Counting());
System.out.println("Nama                : " + boss.getNama());
System.out.println("Jabatan             : " + jabatan);
System.out.println("............................................."); 
System.out.println("Gaji                : Rp " + 5000000);
System.out.println("Tunjangan           : Rp " + boss.getTunjangan());
System.out.println("Tunjangan Jabatan   : Rp "+boss.getTunjanganJabatan());
System.out.println("Bonus               : Rp " + boss.getBonus());
System.out.println("............................................+");
System.out.println("Total Gaji          : Rp " + boss.getGaji());
System.out.println("............................................"); }      
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
      System.out.println("Pilihan yg dimasukkan salah");
                break;
            }
        } while (ulang == true);
    }
}