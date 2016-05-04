package prakproglan.bab6;
public class Employee {
    private String nama;
    private int id;
    private String jabatan;
    private String istri;
    private int anak;
    private int tahun;    
    private double IstriAnak;
    private double gaji = 500000;
    private double bonus;
    private double tunjangan;
    private double totalgaji;
    
    public Employee (String nama, int id, String jabatan, String istri, int anak, int tahun){
        this.nama = nama;
        this.id = id;
        this.jabatan = jabatan;
        this.istri = istri;
        this.anak = anak;
        this.tahun = tahun;
        setBonusDanTunjangan(tahun, istri, anak);
    }
        
    public double getGaji(){
        return totalgaji = gaji+getBonus()+getTunjangan()+getIstriAnak();
    }
    
    public void setBonusDanTunjangan(int tahun, String istri, int anak){
        int lamakerja = 2016-tahun;
        this.istri = istri;
        this.anak = anak;
        if (lamakerja < 5){
            bonus = 0;
            tunjangan = 0;       
        }
        else if (lamakerja > 5 && lamakerja < 11){
            bonus = 0.05*gaji;
            tunjangan = 0;
        }
        else if (lamakerja > 10){
            bonus = 0.1*gaji;
            tunjangan = 0.1*gaji;
        }
        if (istri.equalsIgnoreCase("ya") && anak == 0) {
            IstriAnak = (0.1 * gaji);
        } else if (istri.equalsIgnoreCase("ya") && anak <= 3) {
            IstriAnak = (0.1 * gaji) + (0.15 * gaji) * anak;
        } else if (istri.equalsIgnoreCase("ya") && anak > 3) {
            IstriAnak = (0.1 * gaji) + (0.15 * gaji) * 3;
        } else {
            IstriAnak = 0;
        }       
    }
    
    public double getIstriAnak(){
        return IstriAnak;
    }
    
    public double getBonus(){
        return bonus;
    }
    
    public double getTunjangan(){
        return tunjangan;
    }
        
    public void show(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama : "+nama);
        System.out.println("No. ID : "+id);
        System.out.println("Jabatan : "+jabatan);
        System.out.println("Tanggungan Istri : "+istri);
        System.out.println("Tanggungan Anak : "+anak);
        System.out.println("Tahun Masuk Kerja : "+tahun);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Gaji Pokok\t\t : Rp "+gaji);
        System.out.println("Bonus\t\t\t : Rp "+getBonus());
        System.out.println("Tunjangan\t\t : Rp "+getTunjangan());
        System.out.println("Tunjangan Istri dan Anak : Rp "+getIstriAnak());
        System.out.println("Gaji Bulan Ini\t\t : Rp "+getGaji());     
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}