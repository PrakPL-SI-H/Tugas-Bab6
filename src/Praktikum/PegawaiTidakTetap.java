package Praktikum;

public class PegawaiTidakTetap extends Employee {

    private double tunjangan, tahun, bonus, jam;

    public PegawaiTidakTetap(String name, int id, double salary, int year, String status, int anak) {
        super(name, id, salary, year, status, anak);
    }
    
    public void setLembur(int jam){
        this.jam = jam;
    }

    public int getLembur() {
        if (jam > 10) {
            this.bonus = 0.1 * jam;
            return (int) bonus;
        } else if (jam < 10) {
            this.bonus = 0;
            return (int) bonus;
        }
        return 0;
    }


    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus + getLembur();
    }
}

