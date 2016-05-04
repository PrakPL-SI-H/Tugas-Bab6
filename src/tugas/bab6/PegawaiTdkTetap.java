
import laporan.bab6.Employee;


public class PegawaiTdkTetap extends Employee {

    public float gaji = 2500000;
    public float gajiLembur;
    public int jamLembur;

    public PegawaiTdkTetap() {

    }

    public void setJamLembur(int j) {
        this.jamLembur = j;
    }

    public void gajiLembur() {
        if (jamLembur > 10) {
            float lembur = jamLembur * 10000;
            this.gajiLembur = lembur;
        } else {
            this.gajiLembur = 0;
        }
    }

    public void print() {
        super.print();
        System.out.println("Status : Pegawai Tidak Tetap");
        System.out.println("Lembur : " + jamLembur + " jam");
        System.out.println("Total Gaji : Rp." + (gaji + gajiLembur));
    }
}
