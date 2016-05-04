
import java.util.Scanner;


public class MainEmployee {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      String name, idKerja, jabatan;
       int piljab = 0, pilih = 0, pilistri = 0, pilanak = 0, jamKerja = 0, hariKerja = 0, jumAnak = 0, hireYear = 0;
       boolean ist = true, ank = true;
      
       System.out.println("=====================================================");
            System.out.printf("%35s \n","PENDATAAN KARYAWAN");
            System.out.println("=====================================================\n");
            System.out.print("Masukkan Nama\t\t: ");
            name = in.nextLine();
            System.out.print("Masukkan ID Kerja\t: ");
            idKerja = in.nextLine();
            
              System.out.println("Jabatan\t: ");
                System.out.println("1. Manager ");
                System.out.println("2. Pegawai Tetap");
                System.out.println("3. Pegawai Tidak Tetap");
                System.out.print("Masukkan Jabatan\t: ");
                piljab = in.nextInt();
                if (piljab == 1) {
                    jabatan = "Manager";
                } else if (piljab == 2) {
                    jabatan = "Pegawai Tetap";
                } else if (piljab == 3) {
                    jabatan = "Pegawai Tidak Tetap";
                } else {
                    System.out.println("Inputan Tidak Tersedia, Silahkan Masukkan Lagi");
                }
                
                if (piljab == 3) {
                System.out.print("Jumlah Hari Kerja\t: ");
                hariKerja = in.nextInt();
                System.out.print("Jumlah Jam Kerja\t: ");
                jamKerja = in.nextInt();               
            }
                
                 System.out.println("Memiliki istri? ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Pilihan anda\t\t: ");
                pilistri = in.nextInt();

                if (pilistri == 1) {
                    ist = true;
                } else if (pilistri == 2) {
                    ist = false;
                } else {
                    System.out.println("Inputan Tidak Tersedia, Silahkan Masukkan Lagi");
                }
                
                   System.out.println("Memiliki Anak? ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Pilihan anda\t\t: ");
                pilanak = in.nextInt();
                if (pilanak == 1) {
                    ank = true;
                    System.out.print("Jumlah Anak\t\t: ");
                    jumAnak = in.nextInt();
                } else if (pilanak == 2) {
                    ank = false;
                } else {
                    System.out.println("Inputan Tidak Tersedia, Silahkan Masukkan Lagi");
                }
                
                 System.out.print("Tahun Masuk\t\t: ");
            hireYear = in.nextInt();
                
    }  
}
