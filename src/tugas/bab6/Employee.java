package mainemployee;

public class Employee { //superclassnya

    public String nama;
    public String idKerja;
    public String jabatan;
    public String punyaIstri;
    public int punyaAnak;
    public int tahunMasuk;
    public int gaji;

    public Employee(String nama, String idKerja, String jabatan, String punyaIstri, int punyaAnak, int tahunMasuk) { //konstruktor superclass Employee
        this.nama = nama;
        this.idKerja = idKerja;
        this.jabatan = jabatan;
        this.punyaIstri = punyaIstri;
        this.punyaAnak = punyaAnak;
        this.tahunMasuk = tahunMasuk;
    }

    public String getNama() {
        return nama;
    }

    public String getIdKerja() {
        return idKerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getPunyaIstri() {
        return punyaIstri;
    }

    public int getPunyaAnak() {
        return punyaAnak;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public double getGaji() {
        return gaji;
    }
}
