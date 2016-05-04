package mainemploye;

import java.util.Scanner;

public class MainEmploye {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil;
        String masuk;
        System.out.println("Selamat Datang di program Empolyee");
        System.out.println("Silahkan Masukkan data anda.......");
        System.out.println("");
        System.out.println("======= >> DATA PEGAWAI << =======");
        System.out.println(">> Pilih Jabatan <<");
        System.out.println("1. Manajer");
        System.out.println("2. Pegawai Tetap (PNS)");
        System.out.println("3. Pegawai Tidak Tetap (Non-PNS)");
        System.out.print("Masukkan pilihan   : ");
        pil = in.nextInt();
        switch (pil) {
            case 1:
                Manager b = new Manager();
                System.out.print("Masukkan nama anda : ");
                b.nama = in.next();
                System.out.print("Masukkan id anda   : ");
                b.id = in.next();
                b.jabatan = "Manajer";
                System.out.print("Masukkan Tahun Masuk : ");
                b.masuk = in.nextInt();
                System.out.print("Apakah anda punya istri (ya/tidak) ???  ");
                masuk = in.next();
                if ("ya".equals(masuk)) {
                    b.istri = true;
                }else if ("tidak".equals(masuk)){
                    b.istri = false;
                }
                System.out.print("Apakah anda punya anak (ya/tidak) ???  ");
                masuk = in.next();
                if ("ya".equals(masuk)) {
                    b.anak = true;
                } else if ("tidak".equals(masuk)){
                    b.anak = false;
                }
                System.out.print("Masukkan jumlah gaji anda per-bulan : ");
                b.gaji = in.nextDouble();
                b.setTunjangan();
                b.setBonus();                        
                b.tampilan();
                break;
            case 2 :
                PegawaiTetap c = new PegawaiTetap();
                System.out.print("Masukkan nama anda : ");
                c.nama = in.next();
                System.out.print("Masukkan id anda   : ");
                c.id = in.next();
                c.jabatan = "Pegawai Tetap (PNS)";
                System.out.print("Masukkan Tahun Masuk : ");
                c.masuk = in.nextInt();
                System.out.print("Apakah anda punya istri (ya/tidak) ???  ");
                masuk = in.next();
                if ("ya".equals(masuk)) {
                    c.istri = true;
                }else if ("tidak".equals(masuk)){
                    c.istri = false;
                }
                System.out.print("Apakah anda punya anak (ya/tidak) ???  ");
                masuk = in.next();
                if ("ya".equals(masuk)) {
                    c.anak = true;
                } else if ("tidak".equals(masuk)){
                    c.anak = false;
                }
                System.out.print("Masukkan jumlah gaji anda per-bulan : ");
                c.gaji = in.nextDouble();
                c.setTunjangan();
                c.setBonus();                        
                c.tampilan();
                break;
            case 3 :
                PegawaiTidakTetap d = new PegawaiTidakTetap();
                System.out.print("Masukkan nama anda : ");
                d.nama = in.next();
                System.out.print("Masukkan id anda   : ");
                d.id = in.next();
                d.jabatan = "Pegawai Tidak Tetap (Non-PNS)";
                System.out.print("Masukkan Tahun Masuk : ");
                d.masuk = in.nextInt();
                System.out.print("Apakah anda punya istri (ya/tidak) ???  ");
                masuk = in.next();
                if ("ya".equals(masuk)) {
                    d.istri = true;
                }else if ("tidak".equals(masuk)){
                    d.istri = false;
                }
                System.out.print("Apakah anda punya anak (ya/tidak) ???  ");
                masuk = in.next();
                if ("ya".equals(masuk)) {
                    d.anak = true;
                } else if ("tidak".equals(masuk)){
                    d.anak = false;
                }
                System.out.print("Masukkan jumlah gaji anda per-bulan : ");
                d.gaji = in.nextDouble();
                System.out.print("Masukkan Jumlah Jam Lembur : ");
                d.jamlembur = in.nextInt();
                d.setLemburan();
                d.tampilan();
                break;
        }
    }

}
