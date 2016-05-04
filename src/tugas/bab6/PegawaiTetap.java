package Bab6;
public class PegawaiTetap extends Employee {
    private double tunjangan, bonus, masakerja, tunjanganistri, tunjangananak;
    public PegawaiTetap(String nama, int id, String jabatan, int tahunmasuk, double salary, String status, int anak) {
        super(nama, id, jabatan, tahunmasuk, salary, status, anak);
    }
    public double getTunjangan() {
        if (masakerja > 10) {
            return tunjangan = 0.1 * masakerja * super.getSalary();
        } else {
            return tunjangan = 0;
        }
    }
    public double getTunjanganIstri() {
        if (status.equalsIgnoreCase("menikah")) {
            return tunjanganistri = 0.1 *  (super.getSalary() + masakerja + getTunjangan());
        } else {
            return tunjanganistri = 0;
        }
    }
    public double getTunjanganAnak() {
        if (getAnak() <= 3) {
            return tunjangananak = getAnak() * 0.15 * (super.getSalary() + masakerja + getTunjangan() + getTunjanganIstri());
        } else if (getAnak() > 3) {
            return tunjangananak = 3 * 0.15 * (super.getSalary() + masakerja + getTunjangan() + getTunjanganIstri());
        } else {
            return tunjangananak = 0;
        }
    }
    public double getBonus() {
        if (masakerja > 10) {
            return bonus = 0.1 * masakerja * super.getSalary();
        } else if (masakerja < 10 && masakerja > 5) {
            return bonus = 0.05 * masakerja * super.getSalary();
        } else {
            return bonus = 0;
        }
    }
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + getTunjangan() + getBonus()
                + getTunjanganIstri() + getTunjanganAnak();
    }
}
