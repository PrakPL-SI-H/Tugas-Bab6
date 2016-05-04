
package tugasemployee;

public class Employee {

    private String nama, idKerja, jabatan, istri, anak;
    int tahun_masuk, jumlah_anak, lama, gaji = 20000;
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
        tahun_masuk = f;
        lama = 2016 - tahun_masuk;
    }

    public void hitung(int tahun_masuk) {
        if (2015 - tahun_masuk < 5) {
            bonus = 0;
            tunjangan = 0;
        } else if (2015 - tahun_masuk <= 6 && 2015 - tahun_masuk <= 10) {
            bonus = 0.05 * gaji * lama;
            tunjangan = 0;
        } else if (2015 - tahun_masuk > 10) {
            bonus = 0.1 * gaji * lama;
            tunjangan = 0.1 * gaji * lama;
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


}
