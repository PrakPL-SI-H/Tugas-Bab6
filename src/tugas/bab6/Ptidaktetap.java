package tugas.bab6;
public class Ptidaktetap extends Employee{
   public int Sallary;
   public int Jam;
   public int Bonus;
        public Ptidaktetap(String nama, String jabatan, String IdKerja, String status, int Jmlanak, int tahunkerja, int jam) {
        super(nama, jabatan, IdKerja, status, Jmlanak, tahunkerja);
        this.Jam = Jam;
    }
    public void HitungGaji(){
        if (Jam > 10){
            Bonus = Jam - 10;
            this.Sallary = Gaji + (10000 * Bonus);
        }
        else{
            this.Sallary = Gaji;
        }
    }
  public void Show(){
        System.out.println("Gaji Bulanan: "+Sallary);
       
    }   
}

