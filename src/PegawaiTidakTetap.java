package PrakSIH;
import java.util.Scanner;
public class PegawaiTidakTetap extends Employee {
    
    private int gajilembur, jamKerja, hariLembur;

    public PegawaiTidakTetap(String name, String id, String jabatan, String istri,
            String anak, int thnkerja, int gaji, int jmlanak) {
        super(name, id, jabatan, istri, anak, thnkerja, gaji, jmlanak);
    }
    public PegawaiTidakTetap(){
    }
    public void setJamKerja(int a) {
        jamKerja = a;
    }
    public double getGajiLembur() {
        if (jamKerja > 10) {
            gajilembur = ((jamKerja - 10) * 10000)*hariLembur;
        } else {
            gajilembur = 0;
        }
        return gajilembur;
    }
    public double getGaji() {
        return gaji + getGajiLembur();
    }
    public void pegTidak(){
        Scanner input = new Scanner (System.in);
        System.out.println("----------DATA PEGAWAI TIDAK TETAP----------");
        System.out.print("Masukkan Nama              : ");
        super.name = input.nextLine();
        System.out.print("ID                         : ");
        super.idKerja = input.nextLine();
        System.out.print("Masukkan Jabatan           : ");
        super.jabatan = input.nextLine();
        System.out.print("Masukkan Tahun Bekerja     : ");
        super.thnkerja = input.nextInt();
        System.out.print("Total Hari Lembur          :  ");
        this.hariLembur = input.nextInt();
        System.out.print("Total Jam Kerja            : ");
        this.jamKerja = input.nextInt();
        System.out.print("Mempunyai Istri (Ya/Tidak) : ");
        super.istri = input.next();
        System.out.print("Mempunyai Anak (Ya/Tidak)  : ");
        super.anak = input.next();
            if (anak.equalsIgnoreCase("Ya")) {
                System.out.print("Masukkan Jumlah anak       : ");
                jmlanak = input.nextInt();
            } else {
                System.out.println();
            }
    }
    public void cetakTidakTetap(){
        pegTidak();
        super.gaji = 250000;
        System.out.println("============================================");
        System.out.println("        DATA GAJI PEGAWAI TIDAK TETAP       ");
        System.out.println("============================================");
        System.out.println("Nama Staff          : " + getName());
        System.out.println("ID                  : " + getID());
        System.out.println("Jabatan             : " + getJabatan());
        System.out.println("Lama Kerja          : " + lamaKerja() + " Tahun");
        System.out.println("Gaji Awal           : Rp." + gaji);
        System.out.println("Gaji Lembur         : Rp." + getGajiLembur());
        System.out.println("--------------------------------------------");
        System.out.println("Total Gaji          : Rp." + (double)(super.getGaji()+getGajiLembur()));
        System.out.println();
    }
}