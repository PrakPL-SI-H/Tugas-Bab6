package Praktikum6;

public class PegawaiTidakTetap extends Employee {

    private int jam;
    private double lembur;

    public PegawaiTidakTetap(String n, String id, String j, String i, String a, int m, int x) {
        super(n, id, j, i, a, m, x);
    }

    public void setJamKerja(int j) {
        jam = j;
    }

    public double setLembur() {
        if (jam > 10) {
            lembur = (jam - 10) * 10000;
        } else {
            lembur = 0;
        }
        return lembur;
    }

}
