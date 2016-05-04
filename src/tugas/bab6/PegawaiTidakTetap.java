package prakproglan.bab6;
public class PegawaiTidakTetap extends Employee{
    private double lembur;
    private int jam;
    
    public PegawaiTidakTetap(String nama, int id, String jabatan, String istri, int anak, int tahun, int jam){
        super(nama, id, jabatan, istri, anak, tahun);
        this.jam = jam;
    }
    
    public void setJam(int jam){
        this.jam = jam;
    }
    
    public double lembur(){
        if (jam > 10)
            lembur = 10000*(jam-10);
        else
            lembur = 0;
        return lembur;
    }
    
    public double getGaji(){
        System.out.println("Jam Kerja\t\t : "+jam);
        double gajiPegawaiTidakTetap = super.getGaji();
        return gajiPegawaiTidakTetap + lembur();
    }
}