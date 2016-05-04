//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package tugasemployee;

public class Employee {

    private String nama, idKerja, jabatan, istri, anak;
    int tahunmasuk, jumlah_anak, tahunkerja, gaji = 100000;
    double bonus, tunjangan;

    public Employee(String a, String b, String c, String d, String e, int f, int g) {
        nama = a;
        idKerja = b;
        jabatan = c;
        istri = d;
        anak = e;
        if (g > 3) {
            jumlah_anak = 3;
        } else {
            jumlah_anak = g;
        }
        tahunmasuk = f;
        tahunkerja = 2016 - tahunmasuk;
    }

    public void hitung(int tahun_masuk) {
        if (tahunkerja < 5) {
            bonus = 0;
            tunjangan = 0;
        } else if (tahunkerja <= 10) {
            bonus = 0.05 * gaji * tahunkerja;
            tunjangan = 0;
        } else if (tahunkerja > 10) {
            bonus = 0.1 * gaji * tahunkerja;
            tunjangan = 0.1 * gaji * tahunkerja;
        }

        if (istri.equalsIgnoreCase("y") && anak.equalsIgnoreCase("y")) {
            tunjangan += (0.1 * (gaji + tunjangan)) + ((0.15 * jumlah_anak) * (tunjangan + gaji));
        } else if (istri.equalsIgnoreCase("y") && anak.equalsIgnoreCase("n")) {
            tunjangan += (0.1 * (gaji + tunjangan));
        } else if (istri.equalsIgnoreCase("n") && anak.equalsIgnoreCase("y")) {
            tunjangan += ((0.15 * jumlah_anak) * (tunjangan + gaji));
        } else if (istri.equalsIgnoreCase("n") && anak.equalsIgnoreCase("n")) {
            tunjangan = tunjangan;
        }
    }

    public int getgaji() {
        return gaji;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double gajiTotal() {
        return gaji + tunjangan + bonus;
    }

}
