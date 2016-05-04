package mainemployee;

public class pegawaiTetap extends Employee {

    private double tunjangan, tahun, bonus, tunjanganIstri, tunjanganAnak;

    public pegawaiTetap(String nama, int id, double salary, int tahun, String status, int anak) {
        super(nama, id, salary, tahun, status, anak);
        this.tahun = tahun;
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
            return tunjanganIstri = 0.1 * this.tahun * (super.getSalary() + getTunjangan());
        } else {
            return tunjanganIstri = 0;
        }
    }

    public double getTunjanganAnak() {
        if (super.getAnak() == 1) {
            return tunjanganAnak = 0.15 * this.tahun * (super.getSalary() + getTunjangan() + getTunjanganIstri());
        } else if (super.getAnak() == 2) {
            return tunjanganAnak = 2 * 0.15 * this.tahun * (super.getSalary() + getTunjangan() + getTunjanganIstri());
        } else if (super.getAnak() == 3) {
            return tunjanganAnak = 3 * 0.15 * this.tahun * (super.getSalary() + getTunjangan() + getTunjanganIstri());
        } else if (super.getAnak() > 3) {
            return tunjanganAnak = 3 * 0.15 * this.tahun * (super.getSalary() + getTunjangan() + getTunjanganIstri());
        } else {
            return tunjanganAnak = 0;
        }
    }

    public double getBonus() {
        if ((this.tahun) < 5) {
            return bonus = 0;
        } else if (this.tahun < 10 && this.tahun > 5) {
            return bonus = 0.05 * (this.tahun) * super.getSalary();
        } else if (this.tahun > 10) {
            return bonus = 0.1 * (this.tahun) * super.getSalary();
        } else {
            return bonus = 0;
        }
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + getTunjangan() + getBonus() + getTunjanganIstri() + getTunjanganAnak();
    }

}
