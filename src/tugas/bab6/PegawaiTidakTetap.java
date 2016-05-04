package Bab6;
public class PegawaiTidakTetap extends Employee {
         
    private double masakerja, gajilembur;
    public double jamlembur; 

    public PegawaiTidakTetap(String nama, int id, String jabatan, int tahunmasuk, double salary, String status, int anak, double jamlembur) {
        super(nama, id, jabatan, tahunmasuk, salary, status, anak);
        this.jamlembur = jamlembur;
        masakerja = this.tahunsekarang-tahunmasuk;
    }

    public void getGajiLembur() { 
        if (jamlembur > 10) 
            gajilembur = 10000 * jamlembur; 
        else
            gajilembur = 0; 
    } 
    public double getSalary() { 
        double baseSalary = super.getSalary(); 
        return baseSalary + gajilembur; 
  } 
}
