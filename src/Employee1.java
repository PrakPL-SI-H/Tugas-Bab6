package bab6;

public class Employee1 {

    public String nama;
    public String id;
    public String jabatan;
    public static int istri;
    public static int anak;
    public static int tahun;
    public static int sekarang;
    public static int hasil;
    public static double gaji = 5000000;
    public double tunjangan;

    public void getGaji() {
        System.out.println("Penghasilan                 : " + (int) gaji + "\t Rupiah");
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setIstri(int istri) {
        Employee1.istri = istri;
    }

    public void setAnak(int Anak) {
        Employee1.anak = Anak;
    }

    public void setTahun(int thun) {
        tahun = thun;
    }

    public void setTahunSekarang(int a) {
        sekarang = a;
    }

    public void setHasil() {
        hasil = sekarang - tahun;
    }
}
