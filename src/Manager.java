package Praktikum6;

public class Manager extends Employee {

    public Manager(String n, String id, String j, String i, String a, int m, int x) {
        super(n, id, j, i, a, m, x);
    }

    public double getTunjanganJabatan() {
        return 0.1 * (super.getGaji() + super.getLama() + super.getTunjangan());
    }
}
