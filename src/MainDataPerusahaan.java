package laporaninherit;

/**
 *
 * @author Istighfarin Bahtiar Amry
 * @NIM 155150401111129
 * @KElas SI-H
 */
import java.util.Scanner;

public class MainDataPerusahaan {

    public String daftar = "\n| ID Kerja\t| Nama Pegawai\t\t"+ "|Jabatan\t\t"+ "| Gaji Pokok\t\t|Gaji Total     |\n"+ "|=======================================================================================================|\n";
    int gman = 5000000, pegt = 4000000, pegtt = 2000000;

    public static void main(String[] args) {
        MainDataPerusahaan go = new MainDataPerusahaan();
        

    }

    public void showTime() {
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\t=================PT.BafarCorp Hi-Tech================");
        System.out.println("\t\t\t    ===========GAJI PEGAWAI PT.BafarCorp===========");
        System.out.println("");
        System.out.print("Jumlah Data Yang Ingin Dimasukan : ");
        int ndata = in.nextInt();
        System.out.println();
        
        

    }
}
