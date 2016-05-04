package mainemploye;

import java.util.Scanner;

public class MainEmploye {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil;
        Employee a = new Employee();
        System.out.println("Selamat Datang di program Empolyee");
        System.out.println("Silahkan Masukkan data anda.......");
        System.out.println("");
        System.out.println("======= >> DATA PEGAWAI << =======");
        System.out.print("Masukkan nama anda : ");
        a.nama = in.next();
        System.out.print("Masukkan id anda   : ");
        a.id = in.next();
        System.out.print(">> Pilih Jabatan <<");
        System.out.println("1. Manajer");
        System.out.println("2. Pegawai Tetap (PNS)");
        System.out.println("3. Pegawai Tidak Tetap (Non-PNS)");
        System.out.print("Masukkan pilihan   :");
        pil = in.nextInt();
        switch (pil) {
            case 1:
                Manager b = new Manager();
                b.jabatan = "Manajer";
                System.out.print("Masukkan Tahun Masuk : ");
                b.masuk = in.nextInt();
                System.out.print("Apakah anda punya istri (true/false) ???  ");
                b.istri = in.hasNextBoolean();
                System.out.print("Apakah anda punya anak (true/false) ???  ");
                b.anak = in.hasNextBoolean();
                System.out.print("Masukkan jumlah gaji anda per-bulan : ");
                b.gaji = in.nextDouble();
                b.tampilan();
                break;
        }
    }

}
