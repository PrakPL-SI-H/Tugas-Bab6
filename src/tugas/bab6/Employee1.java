package PrakPemlan;

public class Employee1 {

    public String nama, id, jabatan;
    public static int istri, anak, tahun, skrg, hsl;
    public static double gaji = 3000000;
    public double tunjangan;

    public void getGaji() {
        System.out.println("Penghasilan : " + gaji + " rupiah");
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setJlhIstri(int istri) {
        Employee1.istri = istri;
    }

    public void setJlhAnak(int Anak) {
        Employee1.anak = Anak;
    }

    public void setTahun(int thn) {
        tahun = thn;
    }

    public void setTahunSekarang(int a) {
        skrg = a;
    }

    public void setHasil() {
        hsl = skrg - tahun;
    }
}