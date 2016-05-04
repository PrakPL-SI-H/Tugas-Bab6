package Bab6;

public class PegawaiTetap extends Employee {

    protected double bonus;
    protected double tunjangan;

    private int lamaKerja = super.yearNow - super.yearIn;

    public PegawaiTetap() {
    }

    public PegawaiTetap(String name, String id, String pos,
            String marriedStatus, int countKid, int yearIn) {
        super(name, id, pos, marriedStatus, countKid, yearIn);
    }

    public double getSalary() {
        double totalSalary;
        if (lamaKerja <= 5) {
            bonus = 0;
            tunjangan = 0;
        } else if (lamaKerja <= 10) {
            bonus = salary * (0.05 * lamaKerja);
            tunjangan = 0;
        } else if (lamaKerja > 10) {
            bonus = salary * (0.1 * lamaKerja);
            tunjangan = salary * (0.1 * lamaKerja);
        }
        totalSalary = salary + bonus + tunjangan;

        if (marriedStatus.equalsIgnoreCase("Y")) {
            totalSalary += (totalSalary * 0.1);
        }

        if (countKid >= 1) {
            if (countKid == 1) {
                totalSalary += (totalSalary * 0.15);
            } else if (countKid == 2) {
                totalSalary += (totalSalary * 0.30);
            } else if (countKid >= 3) {
                totalSalary += (totalSalary * 0.45);
            }
        }
        return totalSalary;
    }
}
