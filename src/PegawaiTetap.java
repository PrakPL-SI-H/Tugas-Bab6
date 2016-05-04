package Praktikum6;

public class PegawaiTetap extends Employee {

    public PegawaiTetap(String n, String id, String j, String i, String a, int m, int x) {
        super(n, id, j, i, a, m, x);
    }

    public double total() {
        return super.gajiTotal() + getTunjangan();
    }

}
