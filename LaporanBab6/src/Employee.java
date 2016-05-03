
public class Employee {
    private String name;
    private String idKerja;
    private String jabatan;
    private boolean istri;
    private boolean anak;
    private int hireYear;
    private double bonus;
    private double salary;
    private int lamaKerja;
      private double totalSalary;
    private double tunjangan ;
    private double tunjanganIstri ;
    private double tunjanganAnak;
    private int jumlahAnak;
    
      public Employee(String name, String idKerja, String jabatan, boolean istri, boolean anak, int hireYear, int jumnak) {
        this.name = name;
        this.idKerja = idKerja;
        this.jabatan = jabatan;
        this.istri = istri;
        this.anak = anak;
        this.hireYear = hireYear;
        this.jumlahAnak = jumnak;
    }
      
       public int getLamaKerja() {
        lamaKerja = 2016 - hireYear;
        return lamaKerja;
    }

    public String getName() {
        return name;
    }
     public String getIDKerja() {
        return idKerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getHireYear() {
        return hireYear;
    }
      
    
}
