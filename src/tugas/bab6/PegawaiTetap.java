
import laporan.bab6.Employee;


public class PegawaiTetap extends Employee {

    private float gaji = 3500000;

    public PegawaiTetap() {

    }

    public void Bonus() {
        if (Lmkerja >= 6 && Lmkerja <= 10) {
            float b = 100000 * (0.05f * Lmkerja);
            bonus = b;
        } else if (Lmkerja > 10) {
            float b = 100000 * (0.1f * Lmkerja);
            this.bonus = b;
            this.tunjangan = gaji * 0.1f;
        } else {
            this.bonus = 0;
        }
    }

    public void tunjIstri(boolean i) {
        float a = gaji + tunjangan + bonus;
        if (i == true) {
            this.tunjIstri = a * 0.1f;
        } else {
            this.tunjIstri = 0;
        }
    }

    public void tunjAnak(boolean i) {
        float a = gaji + tunjangan + bonus;
        if (i == true) {
            this.tunjAnak = a * 0.15f;
        } else {
            this.tunjAnak = 0;
        }
    }

    public void print() {
        super.print();
        System.out.println("Status : Pegawai Tetap");
        System.out.println("Lama Kerja : " + Lmkerja + " tahun");
        System.out.println("Total Gaji : Rp." + (gaji + tunjangan + bonus + tunjAnak + tunjIstri));
    }
}
