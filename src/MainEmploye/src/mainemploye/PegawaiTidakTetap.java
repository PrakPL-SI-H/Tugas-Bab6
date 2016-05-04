package mainemploye;

public class PegawaiTidakTetap extends Employee {

    private double lemburan;
    int jamlembur;

    public double setLemburan() {
        if (jamlembur > 10) {
            gaji = gaji + (10000 * jamlembur);
        }
        return gaji;
    }
}
