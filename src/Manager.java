package PrakSIH;
import java.util.Scanner;
public class Manager extends Employee {
    
    private double tunjanganjabatan;
    
    public Manager(String name, String id, String jabatan, String istri,
            String anak, int thnkerja, int gaji, int jmlanak) {
        super(name, id, jabatan, istri, anak, thnkerja, gaji, jmlanak);
    }
    public Manager() {   
    }
    public double getTunjanganJabatan() {
        return this.tunjanganjabatan = 0.1 * (gaji + lamakerja + tunjangan);
    }
    public double getGaji() {
        double gajiManager = super.getGaji();
        return gajiManager + getTunjanganJabatan();
    }
    public void mene(){
        Scanner input = new Scanner (System.in);
        System.out.println("----------------DATA MANAGER----------------");
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
    public void cetakManager(){
        mene();
        super.gaji = 1000000;
        System.out.println("============================================");
        System.out.println("              DATA GAJI MANAGER             ");
        System.out.println("============================================");
        System.out.println("Nama                : " + getName());
        System.out.println("ID                  : " + getID());
        System.out.println("Jabatan             : " + getJabatan());
        System.out.println("Lama Kerja          : " + lamaKerja() + " Tahun");
        System.out.println("Gaji Awal           : Rp." + gaji);
        System.out.println("Tunjangan dan Bonus : Rp." + (super.tunjanganDanBonus()));
        System.out.println("Tunjangan Jabatan   : Rp." + getTunjanganJabatan());
        System.out.println("--------------------------------------------");
        System.out.println("Total Gaji          : Rp." + (double)(super.getGaji()+getTunjanganJabatan()));
        System.out.println();
    }
}