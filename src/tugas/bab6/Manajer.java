package prakproglan.bab6;
public class Manajer extends Employee{
    private double bonusJabatan;
    
    public Manajer(String nama, int id, String jabatan, String istri, int anak, int tahun){
        super(nama, id, jabatan, istri, anak, tahun);
    }
    
    public double getBonusJabatan(){
        return this.bonusJabatan = 0.1*super.getGaji();
    }
    
    @Override
    public double getGaji(){
         double gajiManajer = super.getGaji();
         return gajiManajer + getBonusJabatan();
    }
}