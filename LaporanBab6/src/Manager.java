
public class Manager extends Employee {
       public Manager(String name, String idKerja, String jabatan, boolean istri, boolean anak, int hireYear,int jumlahAnak) {
        super(name, idKerja, jabatan, istri, anak, hireYear,jumlahAnak);
    }
       @Override
        public double getSalary(){        
        double bonus = super.getSalary() * 0.1;
        double managerSalary = super.getSalary() + bonus;
        return managerSalary;     
    }
}
