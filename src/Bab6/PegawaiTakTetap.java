package Bab6;

public class PegawaiTakTetap extends Employee {

    public int Gaji = GajiPokokPegTakTetap;
    public int Jam;

    public PegawaiTakTetap(String Nama, String Jabatan, String Id, String Istri, int Anak, int Tahun, int Jam) {
        super(Nama, Jabatan, Id, Istri, Anak, Tahun);
        this.Jam = Jam;
    }

    public void GajiKotor() {
        Gaji = GajiPokokPegTakTetap;
        if (Jam > 10) {
            Gaji += 10000 * (Jam - 10);
        } else {
            Gaji = GajiPokokPegTakTetap;
        }
        System.out.println("Gaji                    : " + Gaji);
    }
}
