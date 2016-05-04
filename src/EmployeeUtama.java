import java.util.*;
public class EmployeeUtama {
    private String id, jabatan, nama;
    private boolean istri, anak;
    private int tahun, lamabekerja;
    private double tunjangan, tunjanganistri, tunjangananak;
    private double gaji = 5000000;
    public EmployeeUtama(String nama, String idKerja, String jabatan, int tahun, boolean anak, boolean istri) {
        this.jabatan = jabatan;
        this.id = idKerja;
        this.nama = nama;
        this.istri = istri;
        this.anak = anak;
        this.tahun = tahun;
    }
    public double getTunjangan() {
        return tunjangan;
    }
    public double getGaji() {
        return gaji;
    }
    public double getTunjanganistri() {
        return tunjanganistri;
    }
    public double getTunjangananak() {
        return tunjangananak;
    }
    public void tunjanganistri(boolean istri) {
        if (istri == true) {
            tunjanganistri = 0.1 * (getGaji() + getLamabekerja() + getTunjangan());
        } else {
            tunjanganistri = 0;
        }
    }
    public void tunjangananak(boolean anak, int jmlanak) {
        double a;
        a = 0.15 * (getGaji() + getLamabekerja() + getTunjangan());
        if (anak == true) {
            tunjangananak = jmlanak * a;
            if (jmlanak >= 3) {
                tunjangananak = a * 3;
            }
        } else {
            tunjangananak = 0;
        }
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public void setAnak(boolean anak) {
        this.anak = anak;
    }
    public void setIdKerja(String idKerja) {
        this.id = idKerja;
    }
    public void setIstri(boolean istri) {
        this.istri = istri;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getIdKerja() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    public int getLamabekerja() {
        GregorianCalendar menjabat = new GregorianCalendar();
        lamabekerja = menjabat.get(Calendar.YEAR) - tahun;
        return lamabekerja;
    }
    public String getJabatan() {
        return jabatan;
    }
    public double bonus1() {
        double bonus1;
        if (getLamabekerja() <= 5) {
            return bonus1 = 0;
        } else if (getLamabekerja() > 5 && getLamabekerja() <10) {
            return bonus1 = 0.05 * getLamabekerja();
        } else if (getLamabekerja() > 10) {
            setTunjangan(0.1 * getLamabekerja());
            return bonus1 = (0.1 * getLamabekerja());
        } else {
            return 0;
        }
    }
}
