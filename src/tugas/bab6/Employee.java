
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


}
