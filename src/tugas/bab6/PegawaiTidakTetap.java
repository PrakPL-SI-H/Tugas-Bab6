//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package tugasemployee;

public class PegawaiTidakTetap extends Employee {

    private int jam = 8;
    private double lembur;

    public PegawaiTidakTetap(String a, String b, String c, String d, String e, int f, int g) {
        super(a, b, c, d, e, f, g);
    }

    public double lembur() {
        if (jam > 10) {
            lembur = (jam - 10) * 10000;
        } else {
            lembur = 0;
        }
        return lembur;
    }

    public double total() {
        return super.getgaji() + lembur;
    }
}
