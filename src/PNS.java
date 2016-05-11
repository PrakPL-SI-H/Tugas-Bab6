package bab6;

import java.util.Scanner;

public class PNS extends Employee1 {

    private int TotalGaji;
    public int lama;
    Scanner input = new Scanner(System.in);
    Employee1 data = new Employee1();

    public void getData() {
        System.out.println("");
        System.out.println("== DATA KEPEGAWAIAN PERUSAHAAN ==");
        System.out.println("");
        System.out.print("Masukkan Nama Lengkap     : ");
        String nama = input.next();
        data.setName(nama);
        System.out.print("Masukkan ID Kerja         : ");
        String id = input.next();
        data.setId(id);
        System.out.print("Masukkan Jabatan          : ");
        String jabatan = input.next();
        data.setJabatan(jabatan);
        System.out.println("");
        System.out.println(" === Kawin / Tidak Kawin === ");
        System.out.println("Kawin - Masukkan Jumlah Istri");
        System.out.println("Tidak Kawin - Masukkan Jumlah Istri = 0");
        System.out.print("Istri : ");
        int istri = input.nextInt();
        data.setIstri(istri);
        System.out.println("");
        System.out.println(" === Banyaknya Anak === ");
        System.out.println("Kawin - Masukkan Jumlah Anak");
        System.out.println("Tidak Kawin - Masukkan Jumlah Anak = 0");
        System.out.print("Anak : ");
        int anak = input.nextInt();
        data.setAnak(anak);
        System.out.println("");
        System.out.print("Masukkan Tahun Masuk Kerja : ");
        int thun = input.nextInt();
        data.setTahun(thun);

    }

    public void setLamakerja() {
        if (hasil <= 5) {
            System.out.println("Bonus                 : 0 Rupiah");
        } else if (hasil >= 6 && hasil <= 10) {
            double a = 0.05 * gaji;
            System.out.println("Bonus 0,05                  :" + (int) a + "\t Rupiah");
        } else {
            System.out.println("Bonus 0,1 + Tunjangan 0,1    :" + (int) (gaji * 0.1 + gaji * 0.1) + "\tRupiah");
        }

    }

    public void setSumIstri() {
        if (istri >= 1) {
            double b = 0.1 * (gaji + hasil) - istri * 1;
            System.out.println("Tunjangan Istri             : " + (int) b + "\t Rupiah");
        } else {
            System.out.println("Tunjangan istri 0 rupiah");
        }
    }

    public void setSumAnak() {
        if (anak >= 1 && anak <= 3) {
            double c = (0.15 * anak * (gaji + hasil)) - anak * 2;
            System.out.println("Tunjangan Anak              : " + (int) c + "\t Rupiah");
        } else {
            System.out.println("Tunjangan anak 0 rupiah");
        }
    }

    public void TotalGaji() {
        System.out.println("Total Gaji :" + (int) (gaji + hasil));
    }
}
