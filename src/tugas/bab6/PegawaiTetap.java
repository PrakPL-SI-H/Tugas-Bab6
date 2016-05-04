
package tugasemployee;

public class PegawaiTetap extends Employee {

    public PegawaiTetap(String a, String b, String c, String d, String e, int f, int g) {
        super(a, b, c, d, e, f, g);
    }

    public double total() {
        return super.gajiTotal() + getTunjangan();
    }
}
