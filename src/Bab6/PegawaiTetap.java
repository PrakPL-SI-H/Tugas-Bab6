package Bab6;

public class PegawaiTetap extends Employee {

    public int Gaji;
    public int LamaKerja;

    public PegawaiTetap(String Nama, String Jabatan, String Id, String Istri, int Anak, int Tahun) {
        super(Nama, Jabatan, Id, Istri, Anak, Tahun);
    }

    public void GajiKotor() {
        LamaKerja = 2016 - Tahun;
        if (LamaKerja < 5) {
            Gaji = GajiPokokPegTetap;
        } else if (LamaKerja >= 6 && LamaKerja <= 10) {
            Gaji += (Gaji * (0.05 / 100));
        } else {
            Gaji += (Gaji * (0.1 / 100)) + (Gaji * (0.1 / 100));
        }
        if ("Y".equals(Istri) && Anak == 0) {
            Gaji += (Gaji * (0.1 / 100));
        } else if ("Y".equals(Istri) && Anak < 4) {
            Gaji += (Gaji * (0.1 / 100)) + ((Gaji * (0.15 / 100)) * Anak);
        } else if ("Y".equals(Istri) && Anak > 3) {
            Gaji += (Gaji * (0.1 / 100)) + ((Gaji * (0.15 / 100)) * 3);
        } else if ("N".equals(Istri) && Anak < 4) {
            Gaji += ((Gaji * (0.15 / 100)) * Anak);
        } else if ("N".equals(Istri) && Anak > 3) {
            Gaji += ((Gaji * (0.15 / 100)) * 3);
        } else {
            Gaji += 0;
        }
    }
}
