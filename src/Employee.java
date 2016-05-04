package PrakBab6;
import java.util.Scanner;
public class Employee {
    Scanner puta = new Scanner(System.in);

    public static String nama, id, jabatan;
    public boolean istri;
    public int tahun, anak;
    public int gaji, bonus, tunjangan, total;
    public final int employeegaji = 3000000;

    public Employee(String n, String i, String j, String is, int t) {
        this.nama = n;
        this.id = i;
        this.jabatan = j;
        if (is.equalsIgnoreCase("ya")) {
            this.istri = true;

            System.out.print("Apakah anda punya anak? (ya/tidak) = ");
            String an = puta.next();

            if (an.equalsIgnoreCase("ya")) {
                System.out.print("Jumlah anak = ");
                this.anak = puta.nextInt();
            } else if (an.equalsIgnoreCase("tidak")) {
                this.anak = 0;
            } else {
                this.anak = 0;
            }
        } else {
            this.istri = false;
        }

        this.tahun = t;
    }

    public String getNama() {
        return nama;
    }

    public String getID() {
        return id;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getTahun() {
        return tahun;
    }

    public int getSalary(int gaj) {
        int lama = 2016 - tahun;
        gaji = gaj;
        int tunis, tunak;

        if (lama > 10) {
            bonus = 10 * lama * gaji / 100;
            tunjangan = 10 * lama * gaji / 100;
        } else if (lama > 5) {
            bonus = 5 * lama * gaji / 100;
            tunjangan = 0;
        } else {
            bonus = 0;
            tunjangan = 0;
        }

        if (istri == true) {
            tunis = 1 * (gaji + bonus + tunjangan) / 10;
            if (anak == 0) {
                tunak = 0;
            } else if (anak > 3) {
                tunak = 15 * 3 * (gaji + bonus + tunjangan) / 100;
            } else {
                tunak = 15 * anak * (gaji + bonus + tunjangan) / 100;
            }
        } else {
            tunis = 0;
            tunak = 0;
        }

        total = gaji + bonus + tunjangan + tunis + tunak;
        return total;
    }

}
