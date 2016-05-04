package PrakBab6;

public class PegawaiTidakTetap extends Employee {

    private int lembur;

    public PegawaiTidakTetap(String n, String i, String j, String is, int t) {
        super(n, i, j, is, t);
    }

    public int salaryNonPNS(int jam) {
        if (jam > 10) {
            lembur = (jam - 10) * 10000;
        } else {
            lembur = 0;
        }
        istri = false;
        anak = 0;
        
        return getSalary(employeegaji) + lembur;
    }
}
