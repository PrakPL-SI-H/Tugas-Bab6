package mainemployee;

public class pegawaiTidakTetap extends Employee {

    private double tunjangan, tahun, bonus;

    public pegawaiTidakTetap(String name, int id, double salary, int tahun, String status, int anak) {
        super(name, id, salary, tahun, status, anak);
    }

    public void setLembur(int jam) {
        if (jam > 10) {
            this.bonus = 0.1 * jam;
        } else if (jam < 10) {
            this.bonus = 0;
        }
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus;
    }

}
