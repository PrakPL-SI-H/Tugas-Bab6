/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan;

/**
 *
 * @author TEGAR
 */
public class PegawaiTetap extends Employee{
    public int gajiPT;
    public int lamaKerja;
 
    public PegawaiTetap(String nama, String jabatan, String idKerja, String istri, int anak, int thn) {
        super(nama, jabatan, idKerja, istri, anak, thn);
    }
      public void HitungGaji(){
        lamaKerja = 2016 - thn;
        if (lamaKerja <= 5){
            this.gajiPT = gajiDasar;
        }
        else if (lamaKerja >= 6 && lamaKerja <=10){
            this.gajiPT = gajiDasar + (gajiDasar / 20);
        }
        else {
            if (istri.equalsIgnoreCase("y")&& anak == 0){
                this.gajiPT = gajiDasar + (gajiDasar / 10) + (gajiDasar / 10);
                this.gajiPT = gajiPT + (gajiPT / 10);
            }
            else if(istri.equalsIgnoreCase("n") && anak > 0 && anak <=3){
                this.gajiPT = gajiDasar + (gajiDasar / 10) + (gajiDasar / 10);
                this.gajiPT = gajiPT + (anak * (gajiPT * 3 / 20));
            }
            else if(istri.equalsIgnoreCase("y") && anak > 0 && anak <=3){
                this.gajiPT = gajiDasar + (gajiDasar / 10) + (gajiDasar /10);
                this.gajiPT = gajiPT + (gajiPT / 10) + (anak * (gajiPT * 3 / 20));
            }
            else if(istri.equalsIgnoreCase("y") && anak > 3) {
                this.gajiPT = gajiDasar + (gajiDasar / 10) + (gajiDasar /10);
                this.gajiPT = gajiPT + (gajiPT / 10) + (3 * (gajiPT * 3 / 20));
            }
            else {
                this.gajiPT = gajiDasar + (gajiDasar / 10) + (gajiDasar/10);
                this.gajiPT = gajiPT + (3 * (gajiPT * 3 / 20));
            }
        }
    }
}