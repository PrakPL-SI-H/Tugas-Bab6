
import java.util.Scanner;


public class MainEmployee {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      String name, idKerja;
      
       System.out.println("=====================================================");
            System.out.printf("%35s \n","PENDATAAN KARYAWAN");
            System.out.println("=====================================================\n");
            System.out.print("Masukkan Nama\t\t: ");
            name = in.nextLine();
            System.out.print("Masukkan ID Kerja\t: ");
            idKerja = in.nextLine();
    }  
}
