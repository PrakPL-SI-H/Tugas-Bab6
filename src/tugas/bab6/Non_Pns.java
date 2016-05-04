package tugas.bab6;

public class Non_Pns extends Employee {

    private int GajiLembur, MulaiKerja;

    public Non_Pns(String nama, String id, String jabatan, String istri, String anak, int bnykAnak, int tahunMasuk) {
        super(nama, id, jabatan, istri, anak, bnykAnak, tahunMasuk);
    }

    public void setJamKerja(int a) {
        MulaiKerja = a;
    }

    public double getGajiLembur() {
        if (MulaiKerja > 10) {
            GajiLembur = (MulaiKerja - 10) * 10000;
        } else {
            GajiLembur = 0;
        }
        return GajiLembur;
    }

    @Override
    public double getGaji() {
        return Gaji + getGajiLembur();
    }
}
