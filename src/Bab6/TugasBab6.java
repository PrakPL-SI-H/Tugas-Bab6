package Bab6;

import java.util.Scanner;

public class TugasBab6 {

    static String Nama;
    static String Jabatan;
    static String Id;
    static String Istri;
    static int Anak;
    static int Tahun;
    static int Jam;
    static String Line = "==========================================";
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println(Line);
        System.out.println("CTOMATO CORP");
        System.out.println("EMPLOYEE SALARY");
        System.out.println(Line);
        System.out.print("Masukkan jumlah data: ");
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(Line);
            System.out.println("Data " + (i + 1));
            System.out.println("");
            Input();
        }
        System.out.println(Line);
    }
    
    public static void Input() {
        System.out.print("Nama                    : ");
        Nama = in.next();
        System.out.print("ID                      : ");
        Id = in.next();
        System.out.print("Tahun bergabung         : ");
        Tahun= in.nextInt();
        System.out.print("Jabatan                 : ");
        Jabatan = in.next();
        
        if(Jabatan.equalsIgnoreCase("Manajer")){
            System.out.print("Status Perkawinan(Y/N)  : ");
            Istri = in.next();
            System.out.print("Jumlah Anak             : ");
            Anak = in.nextInt();
            Manajer M1 = new Manajer(Nama, "Manajer", Id, Istri, Anak, Tahun);
            System.out.println(Line);
            M1.GetData();
            M1.GajiKotor();
        }
        
        else if(Jabatan.equalsIgnoreCase("PegawaiTetap")){
            System.out.print("Status Perkawinan(Y/N)  : ");
            Istri = in.next();
            System.out.print("Jumlah Anak             : ");
            Anak = in.nextInt();
            PegawaiTetap P1 = new PegawaiTetap(Nama, "Pegawai Tetap", Id, Istri, Anak, Tahun);
            System.out.println(Line);
            P1.GetData();
            P1.GajiKotor();
        }
        
        else if(Jabatan.equalsIgnoreCase("PegawaiTidakTetap")){
            System.out.print("Jumlah Jam Bekerja      : ");
            Jam = in.nextInt();
            PegawaiTakTetap T1 = new PegawaiTakTetap(Nama, "Pegawai Tetap", Id, "N", 0, Tahun, Jam);
            System.out.println(Line);
            T1.GetData();
            T1.GajiKotor();
        }
        else{
            System.out.println("Data Tidak Valid");
        }
   }
}
