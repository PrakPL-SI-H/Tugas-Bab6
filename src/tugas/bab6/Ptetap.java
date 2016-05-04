package tugas.bab6;

public class Ptetap extends Employee {  
   public int Sallary;
   public int Periode;

    public Ptetap(String nama, String jabatan, String IdKerja, String status, int Jmlanak, int tahunkerja) {
        super(nama, jabatan, IdKerja, status, Jmlanak, tahunkerja);
    }
    public void HitungGaji(){
        Periode = 2016 - tahunkerja;
        if (Periode <= 5){
            this.Sallary = Gaji;
        }
        else if (Periode >= 6 && Periode <=10){
            this.Sallary = Gaji + (Gaji / 20);
        }
        else {
            if (status.equalsIgnoreCase("Menikah")&& Jmlanak == 0){
                this.Sallary = Gaji + (Gaji / 10) + (Gaji / 10);
                this.Sallary = Sallary + (Sallary / 10);
            }
            else
                if(status.equalsIgnoreCase("Belum") && Jmlanak > 0 && Jmlanak <=3){
                this.Sallary = Gaji + (Gaji / 10) + (Gaji / 10);
                this.Sallary = Sallary  +(Jmlanak * (Sallary * 3 / 20));
            }
            else
                if(status.equalsIgnoreCase("Menikah") && Jmlanak > 0 && Jmlanak <=3){
                this.Sallary = Gaji + (Gaji / 10) + (Gaji /10);
                this.Sallary = Sallary + (Sallary / 10)+(Jmlanak * (Sallary * 3 / 20));
            }
            else                    
                if(status.equalsIgnoreCase("Menikah") && Jmlanak > 3) {
                this.Sallary = Gaji + (Gaji / 10) + (Gaji /10);
                this.Sallary = Sallary + (Sallary / 10) + (3 * (Sallary * 3 / 20));
            }
            else {
                this.Sallary = Gaji + (Gaji / 10) + (Gaji /10);
                this.Sallary = Sallary + (3 * (Sallary * 3 / 20));
            }
        }
 }
  public void Show(){
        System.out.println("Gaji Bulanan: "+Sallary);
       
    }   
}




        