
package maingaji;


public class PegawaiTakTetap extends Employee{
    private int gajilembur, jamKerja;

    public PegawaiTakTetap(String name, String id, String jabatan, String istri, String anak, int thnkerja, int gaji, int jmlanak) {
        super(name, id, jabatan, istri, anak, thnkerja, gaji, jmlanak);

    }

    public void setJamKerja(int a) {
        jamKerja = a;
    }

    public double getGajiLembur() {
        if (jamKerja > 10) {
            gajilembur = (jamKerja - 10) * 10000;
        } else {
            gajilembur = 0;
        }
        return gajilembur;
    }

    @Override
    public double getGaji() {
        return gaji + getGajiLembur();
    }

}
