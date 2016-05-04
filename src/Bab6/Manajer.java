package Bab6;

public class Manajer extends Employee {

    public int Gaji;
    public int LamaKerja;

    public Manajer(String Nama, String Jabatan, String Id, String Istri, int Anak, int Tahun) {
        super(Nama, Jabatan, Id, Istri, Anak, Tahun);
    }

    public void Tunjangan() {
        LamaKerja = 2016 - Tahun;
        if (LamaKerja < 5) {
            Gaji = 5000000;
        } else if (LamaKerja >= 6 && LamaKerja <= 10) {
            Gaji += (Gaji * (0.05 / 100));
        } else {
            Gaji += (Gaji * (0.1 / 100)) + (Gaji * (0.1 / 100));
        }
        if ("Y".equalsIgnoreCase(Istri) && Gaji == 0) {
            Gaji += (Gaji * (0.1 / 100)) + (Gaji * (0.1 / 100));
        } else if ("Y".equalsIgnoreCase(Istri) && Anak < 4) {
            Gaji += (Gaji * (0.1 / 100)) + ((Gaji * (0.15 / 100)) * Anak) + (Gaji * (0.1
                    / 100));
        } else if ("Y".equalsIgnoreCase(Istri) && Anak > 3) {
            Gaji += (Gaji * (0.1 / 100)) + ((Gaji * (0.15 / 100)) * 3) + (Gaji * (0.1 / 100));
        } else if ("N".equalsIgnoreCase(Istri) && Anak < 4) {
            Gaji += ((Gaji * (0.15 / 100)) * Anak) + (Gaji * (0.1 / 100));
        } else if ("N".equalsIgnoreCase(Istri) && Anak > 3) {
            Gaji += ((Gaji * (0.15 / 100)) * 3) + (Gaji * (0.1 / 100));
        } else {
            Gaji += (Gaji * (0.1 / 100));
        }
    }
}
