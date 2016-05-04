package ww;
public class pegawaiTidakTetap extends employee {
private int GajiLembur, JamKer;
    public pegawaiTidakTetap(String name, String id, String Jabatan, String istri, String anak, int ThnKerja, double gaji, int jmlhAnak) {
        super(name, id, Jabatan, istri, anak, ThnKerja, gaji, jmlhAnak);
    } public void setJamKerja(int a) {
        JamKer = a;
    } public double getGajiLembur() {
        if (JamKer > 10) {
            GajiLembur = (JamKer - 10) * 10000;
        } else {
            GajiLembur = 0;
        } return GajiLembur;
    } public double getGaji() {
        return gaji + getGajiLembur();
    }
}