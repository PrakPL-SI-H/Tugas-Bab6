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

}
