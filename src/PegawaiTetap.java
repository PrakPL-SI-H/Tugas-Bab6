package PrakSIH;
import java.util.Scanner;
public class PegawaiTetap extends Employee {
    
    private int jamLembur, hariLembur;
    

    public PegawaiTetap(String name, String id, String jabatan, String istri,
            String anak, int thnkerja, int gaji, int jmlanak) {
        super(name, id, jabatan, istri, anak, thnkerja, gaji, jmlanak);
    }
    public PegawaiTetap(){   
    }
    
    public void pegTetap(){
        Scanner input = new Scanner (System.in);
        System.out.println("-------------DATA PEGAWAI TETAP -------------");
        System.out.print("Masukkan Nama              : ");
        super.name = input.nextLine();
        System.out.print("Masukkan ID                : ");
        super.idKerja = input.nextLine();
        System.out.print("Masukkan Jabatan           : ");
        super.jabatan = input.nextLine();
        System.out.print("Masukkan Tahun Bekerja     : ");
        super.thnkerja = input.nextInt();
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
    public void cetakPegawaiTetap(){
        pegTetap();
        super.gaji = 500000;
        System.out.println("=============================================");
        System.out.println("           DATA GAJI PEGAWAI TETAP           ");
        System.out.println("=============================================");
        System.out.println("Nama                : " + getName());
        System.out.println("ID                  : " + getID());
        System.out.println("Jabatan             : " + getJabatan());
        System.out.println("Lama Kerja          : " + lamaKerja() + " Tahun");
        System.out.println("Gaji Awal           : Rp." + gaji);
        System.out.println("Tunjangan dan Bonus : Rp." + (super.tunjanganDanBonus()));
        System.out.println("---------------------------------------------");
        System.out.println("Total Gaji          : Rp." + getGaji());
        System.out.println();
    }
}