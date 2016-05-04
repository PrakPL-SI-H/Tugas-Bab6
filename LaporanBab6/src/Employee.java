
public class Employee {
    private String name;
    private String idKerja;
    private String jabatan;
    private boolean istri;
    private boolean anak;
    private int hireYear;
    private double bonus;
    protected final double salary = 3000000;
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
      public double getSalary() {
        getLamaKerja();
        if (lamaKerja >= 6 && lamaKerja <= 10) {
            bonus = 0.05 * salary;
        } else if (lamaKerja > 10) {
            bonus = 0.1 * salary;
            tunjangan = 0.1 * salary;
        }

        if (istri == true) {
            tunjanganIstri = 0.1 * (salary + bonus + tunjangan);
        }

        if (anak == true) {
            if (jumlahAnak >= 0 && jumlahAnak <= 3) {
                tunjanganAnak = jumlahAnak * 0.15 * (salary + bonus + tunjangan);
            } else if (jumlahAnak > 3){
                tunjanganAnak = 3 * 0.15 * (salary + bonus + tunjangan);
            }
        }
        totalSalary = salary + bonus + tunjangan + tunjanganIstri + tunjanganAnak;
        return totalSalary;
    }

       public int getLamaKerja() {
        lamaKerja = 2016 - hireYear;
        return lamaKerja;
    }

    public String getName() {
        return name;
    }
     public String getIstri() {
        if (istri == true) {
            return "Ada";
        } else {
            return "Tidak Ada";
        }
    }

    public String getAnak() {
        if (anak == true) {
            return "Ada";
        } else {
            return "Tidak Ada";
        }
    }

    public void jumAnak() {
        System.out.println("Jumlah Anak\t\t: " + jumlahAnak);
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
