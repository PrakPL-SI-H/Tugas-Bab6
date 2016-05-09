package Laporan6Bab6;

public class KaryawanTidakTetap extends Karyawan {

    private double GajiKhusus, jamKerja, hariLembur, bonusKhusus;

    public KaryawanTidakTetap (String nama, String idKerja, String jabatan, int istri, int anak, int hari, int jam) {
        super(nama, idKerja, jabatan, istri, anak);
        jamKerja = jam;
        hariLembur = hari;
        setTotalGaji();
        gajiPenuh = totalGaji;
        setBonusKhusus();
        GajiKhusus = gajiPenuh + bonusKhusus;
    }

    public void setBonusKhusus() {
        double lamaLembur = jamKerja - 10;
        bonusKhusus = lamaLembur * 10000 * hariLembur;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Gaji Lembur     : Rp. %16s\nGaji Akhir      : Rp. %16s\n", (long) bonusKhusus, (long) GajiKhusus);
    }
}
