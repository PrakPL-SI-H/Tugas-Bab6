package Laporan6Bab6;

public class KaryawanTetap extends Karyawan {

    public KaryawanTetap (String nama, String idKerja, String jabatan, int istri, int anak, int lamaKerja) {
        super(nama, idKerja, jabatan, istri, anak);
        this.lamaKerja = lamaKerja;
        setTunjangan(lamaKerja);
        setBonus(lamaKerja);
        setTotalGaji();
        gajiPenuh = totalGaji + tunjanganIstri(istri) + tunjanganAnak(anak, istri);
    }

    public double tunjanganIstri(int istri) {
        double tambahanIstri;
        tambahanIstri = istri * 0.1 * totalGaji;
        return tambahanIstri;
    }

    public double tunjanganAnak(int anak, int istri) {
        double tambahanAnak;
        if (anak > 3) {
            tambahanAnak = 3 * 0.15 * (totalGaji + tunjanganIstri(istri));
            return tambahanAnak;
        } else {
            tambahanAnak = anak * 0.15 * (totalGaji + tunjanganIstri(istri));
            return tambahanAnak;
        }
    }

    public String toString() {
        return super.toString() + String.format("Bonus Kerja     : Rp. %16s\nTunjangan Kerja : Rp. %16s\nTunjangan Istri : Rp. %16s\nTunjangan Anak  : Rp. %16s\nTotal Gaji      : Rp. %16s\n", (long) bonus, (long) tunjangan, (long) tunjanganIstri(istri), (long) tunjanganAnak(anak, istri), (long) gajiPenuh);
    }
}
