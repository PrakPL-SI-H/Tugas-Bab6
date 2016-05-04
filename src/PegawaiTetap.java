package PrakBab6;

public class PegawaiTetap extends Employee {

    private final int gajiPNS = 5000000;

    public PegawaiTetap(String n, String i, String j, String is, int t) {
        super(n, i, j, is, t);
    }

    public int salaryPNS() {
        return getSalary(gajiPNS);
    }
}
