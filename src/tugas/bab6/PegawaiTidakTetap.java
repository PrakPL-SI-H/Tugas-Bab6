package tugas.bab6;

public class PegawaiTidakTetap extends Employee {

   private double gl; //Gaji Lembur
   
   public void GajiLembur(int jam){
       if(jam > 10){
           gl = jam * 10000;
           jumlah += gl;
       }
   }
    
}
