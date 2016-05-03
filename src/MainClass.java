import java.util.Scanner;
public class MainClass {
   public static void main(String[] args) {
   String nama, idKerja,jabatan, istri;
   int anak, thn, jam;
        Scanner in = new Scanner(System.in);
        System.out.print("Nama              : ");
        nama = in.next();
        System.out.print("ID                : ");
        idKerja = in.next();
        System.out.print("Tahun Masuk       : ");
        thn = in.nextInt();
        System.out.print("Jabatan           : ");
        jabatan = in.next();
        
        if(jabatan.equalsIgnoreCase("Pegawai Tetap")){
            System.out.print("Mempunyai Istri (y/n) : ");
            istri = in.next();
            System.out.print("Jumlah Anak           : ");
            anak = in.nextInt();
            PegawaiTetap PT = new PegawaiTetap(nama,jabatan,idKerja,istri,anak,thn);
            PT.HitungGaji();
            PT.Tampikan();
        }
        else if(jabatan.equalsIgnoreCase("Manajer")){
            System.out.print("Mempunyai Istri (y/n) : ");
            istri = in.next();
            System.out.print("Jumlah Anak           : ");
            anak = in.nextInt();
            Manajer M = new Manajer(nama,jabatan,idKerja,istri,anak,thn);
            M.HitungGaji();
            M.Tampikan();
        }
        else if(jabatan.equalsIgnoreCase("Pegawai Tidak Tetap")){
            System.out.print("Jumlah Jam Bekerja    : ");
            jam = in.nextInt();
            PegawaitdkTetap PTT = new PegawaitdkTetap(nama,jabatan,idKerja,"n",0,thn, jam);
            PTT.HitungGaji();
            PTT.Tampilkan();
        }
        else{
            System.out.println("-Masukan Tidak Valid-");
        }
}
}
