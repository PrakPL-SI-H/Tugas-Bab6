package Praktikum;

public class PegawaiTetap extends Employee {

    private double tunjangan, tahun, bonus, tunjangan_istri, tunjangan_anak;

    public PegawaiTetap(String nama, int id, double salary, int year, String status, int anak) {
        super(nama, id, salary, year, status, anak);
        this.tahun = year;
    }

    public double getTunjangan() {
        if (this.tahun < 10) {
            return tunjangan = 0;
        } else if (this.tahun > 10) {
            return tunjangan = 0.1 * this.tahun * super.getSalary();
        } else {
            return tunjangan = 0;
        }
    }

    public double getTunjanganIstri() {
        if (status.equals("Menikah")) {
            return tunjangan_istri = 0.1 * this.tahun * (super.getSalary() + getTunjangan());
        } else {
            return tunjangan_istri = 0;
        }
    }

    public double getTunjanganAnak() {
        if (super.getAnak() == 1) {
            return tunjangan_anak = 0.15 * this.tahun * (super.getSalary() + getTunjangan() + getTunjanganIstri());
        } else if (super.getAnak() == 2) {
            return tunjangan_anak = 2 * 0.15 * this.tahun * (super.getSalary() + getTunjangan() + getTunjanganIstri());
        } else if (super.getAnak() == 3) {
            return tunjangan_anak = 3 * 0.15 * this.tahun * (super.getSalary() + getTunjangan() + getTunjanganIstri());
        } else if (super.getAnak() > 3) {
            return tunjangan_anak = 3 * 0.15 * this.tahun * (super.getSalary() + getTunjangan() + getTunjanganIstri());
        } else {
            return tunjangan_anak = 0;
        }
    }

    public double getBonus() {
        if ((this.tahun) < 5) {
            return bonus = 0;
        } else if (this.tahun < 10 && this.tahun > 5) {
            return bonus = 0.05 * (this.tahun)
                    * super.getSalary();
        } else if (this.tahun > 10) {
            return bonus = 0.1 * (this.tahun) * super.getSalary();
        } else {
            return bonus = 0;
        }
    }


    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + getTunjangan() + getBonus() + getTunjanganIstri() + getTunjanganAnak();
    }
}
