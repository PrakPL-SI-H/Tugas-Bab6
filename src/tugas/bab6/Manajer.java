
package laporan;

public class Manajer extends Employee {
    public int gajiM;
    public int lamaKerjaM;
 


    public Manajer(String nama, String jabatan, String idKerja, String istri, int anak, int thn) {
        super(nama, jabatan, idKerja, istri, anak, thn);
        
    }
    public void HitungGaji(){
        lamaKerjaM = 2016 - thn;
        if (lamaKerjaM <= 5){
            this.gajiM = gajiDasar;
        }
        else {
            this.gajiM = gajiDasar + (gajiDasar / 20);
        }
}
}
