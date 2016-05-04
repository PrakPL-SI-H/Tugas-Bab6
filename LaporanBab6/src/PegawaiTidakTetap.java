
public class PegawaiTidakTetap extends Employee {
     private int jamKerja;
    private int hariKerja;
    public PegawaiTidakTetap(String name, String idKerja, String jabatan, boolean istri, boolean anak, int hireYear,int jumlahAnak) {
        super(name, idKerja, jabatan, istri, anak, hireYear, jumlahAnak);
    }
    public void setJamKerja(int jam){
        jamKerja = jam;
    }
    public void setHariKerja(int hari){
        hariKerja = hari;        
    }
      public int getJamKerja(){
        return jamKerja;
    }
    public int getHariKerja(){
        return hariKerja;
    }
    
}
