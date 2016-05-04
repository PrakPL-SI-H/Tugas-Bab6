package inheritance;
public class PegawaiTakTetap extends Employee {  
    private double tunjangan, tahun, bonus;
    public PegawaiTakTetap(String nama, int id, double salary, int year, String status, int anak) {
        super(nama, id, salary, year, status, anak);
    }
    public void setLembur(int jam){
        if (jam > 10) {
            this.bonus = 0.1 * jam;
        } else if (jam < 10 ) {
            this.bonus = 0;
        }
    }
    public double getSalary () {
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus;
    }   
}
