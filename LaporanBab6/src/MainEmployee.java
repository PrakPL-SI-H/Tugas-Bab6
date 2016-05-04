
import java.util.Scanner;


public class MainEmployee {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      String name, idKerja, jabatan;
       int piljab = 0;
      
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
                
                
    }  
}
