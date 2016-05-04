package laporan.bab6;

public class Employee {

    protected String nama;
    protected int id;
    protected String jab;
    protected int Lmkerja;
    protected boolean istri;
    protected boolean anak;
    protected float tunjangan;
    protected float bonus;
    protected float tunjIstri;
    protected float tunjAnak;

    public void setNama(String n) {
        this.nama = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int LmKerja(int i) {
        return Lmkerja = 2016 - i;
    }

    protected void setJab(String j) {
        this.jab = j;
    }

    public void print() {
        System.out.println("\n====== GAJI ANDA ======");
        System.out.println("Nama : " + nama);
        System.out.println("Id   : " + id);
    }
}
