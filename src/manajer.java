package ww;
public class manajer extends employee {
    private double TunjanganJabatan;
    public manajer(String name, String id, String Jabatan, String istri, String anak, int ThnKerja, double gaji, int jmlhAnak) {
        super(name, id, Jabatan, istri, anak, ThnKerja, gaji, jmlhAnak);
    } public double getTunjanganJabatan() {
    return this.TunjanganJabatan = 0.1 * (gaji + bonus + tunjangan);

    } public double getGaji() {
        double gajiManager = super.getGaji();
        return gajiManager + getTunjanganJabatan();
    }
}