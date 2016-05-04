package PrakPemlan;

import java.util.Scanner;

public class PNS extends Employee1 {

    public int lama;
    Scanner in = new Scanner(System.in);
    Employee1 data = new Employee1();

    public void getData() {
        System.out.println();
        System.out.print("Masukkan nama lengkap : ");
        String nama = in.next();
        data.setName(nama);
        System.out.print("Masukkan ID kerja     : ");
        String id = in.next();
        data.setID(id);
        System.out.print("Masukkan jabatan      : ");
        String jabatan = in.next();
        data.setJabatan(jabatan);
        System.out.println();
        System.out.println("\t=== Kawin / Tidak Kawin ===");
        System.out.println("Kawin - Masukkan Jumlah Istri");
        System.out.println("Tidak Kawin - Masukkan Jumlah Istri = 0");
        System.out.print("Istri : ");
        int istri = in.nextInt();
        data.setJlhIstri(istri);
        System.out.println();
        System.out.println("\t=== Banyaknya Anak === ");
        System.out.println("Kawin - Masukkan Jumlah Anak");
        System.out.println("Tidak Kawin - Masukkan Jumlah Anak = 0");
        System.out.print("Anak : ");
        int anak = in.nextInt();
        data.setJlhAnak(anak);
        System.out.println();
        System.out.print("Masukkan tahun masuk kerja : ");
        int thn = in.nextInt();
        data.setTahun(thn);
    }

    public void setLamaKerja() {
        if (hsl <= 5) {
            System.out.println("Bonus = 0 rupiah");
        } else if (hsl >= 6 && hsl <= 10) {
            double a = 0.05 * gaji;
            System.out.println("Bonus 0,05 = " + a + " rupiah");
        } else {
            System.out.println("Bonus 0,1 + Tunjangan 0,1 = " + (gaji * 0.1) + (gaji * 0.1) + " rupiah");
        }
    }

    public void setSumIstri() {
        if (istri >= 1) {
            double b = 0.1 * (gaji + hsl + tunjangan);
            System.out.println("Tunjangan istri : " + b + " rupiah");
        } else {
            System.out.println("Tunjangan istri 0 rupiah");
        }
    }

    public void setSumAnak() {
        if (anak >= 1 && anak <= 3) {
            double c = 0.15 * (gaji + hsl + tunjangan);
            System.out.println("Tunjangan anak : " + c + " rupiah");
        } else {
            System.out.println("Tunjangan anak 0 rupiah");
        }
    }
}