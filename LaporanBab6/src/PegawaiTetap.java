
public class PegawaiTetap extends Employee {
     public PegawaiTetap(String name, String idKerja, String jabatan, boolean istri, boolean anak, int hireYear,int jumlahAnak) {
        super(name, idKerja, jabatan, istri, anak, hireYear,jumlahAnak);
    }
    
    public double getSalary(){
        double pegawaiSalary = super.getSalary();
        return pegawaiSalary;
    }
}
