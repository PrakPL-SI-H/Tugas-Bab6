package Praktikum6;

public class Employee {

    private String name, idKerja, jabatan, istri, anak;
    private int tahunmasuk, jumlahanak, lama, gaji = 2000000;
    private double bonus, tunjangan;

    public Employee(String n, String id, String j, String i, String a, int m, int x) {
        name = n;
        idKerja = id;
        jabatan = j;
        istri = i;
        anak = a;
        if (x > 3) {
            jumlahanak = 3;
        } else {
            jumlahanak = x;
        }
        tahunmasuk = m;
        lama = 2016 - tahunmasuk;
    }

    public void setJabatan(int tahun_masuk) {
        if (2016 - tahun_masuk < 5) {
            bonus = 0;
            tunjangan = 0;
        } else if (2016 - tahun_masuk >= 6 && 2016 - tahun_masuk <= 10) {
            bonus = 0.05 * gaji * lama;
            tunjangan = 0;
        } else if (2016 - tahun_masuk > 10) {
            bonus = 0.1 * gaji * lama;
            tunjangan = 0.1 * gaji * lama;
        }
        if (istri.equalsIgnoreCase("y") && anak.equalsIgnoreCase("y")) {
            tunjangan += (0.1 * (gaji + tunjangan)) + ((0.15 * jumlahanak) * (tunjangan + gaji));
        } else if (istri.equalsIgnoreCase("y") && anak.equalsIgnoreCase("n")) {
            tunjangan += (0.1 * (gaji + tunjangan));
        } else if (istri.equalsIgnoreCase("n") && anak.equalsIgnoreCase("y")) {
            tunjangan += ((0.15 * jumlahanak) * (tunjangan + gaji));
        } else if (istri.equalsIgnoreCase("n") && anak.equalsIgnoreCase("n")) {
            tunjangan = tunjangan;
        }
    }

    public String getNama() {
        return name;
    }

    public String getId() {
        return idKerja;
    }

    public String getIstri() {
        return istri;
    }

    public String getAnak() {
        return anak;
    }

    public int getTahunMasuk() {
        return tahunmasuk;
    }

    public int getLama() {
        return lama;
    }

    public int getGaji() {
        return gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double gajiTotal() {
        return gaji + tunjangan + bonus;
    }

}
