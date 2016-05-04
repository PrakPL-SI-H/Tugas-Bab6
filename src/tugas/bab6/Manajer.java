
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
        else if (lamaKerjaM >= 6 && lamaKerjaM <=10){
            this.gajiM = gajiDasar + (gajiDasar / 20);
        }
        else {
            if (istri.equalsIgnoreCase("y")&& anak == 0){
                this.gajiM = gajiDasar + (gajiDasar / 10) + (gajiDasar / 10);
                this.gajiM = gajiM + (gajiM / 10) + (gajiM / 10) ;
            }
            else if(istri.equalsIgnoreCase("n") && anak > 0 && anak <=3){
                this.gajiM = gajiDasar + (gajiDasar / 10) + (gajiDasar / 10);
                this.gajiM = gajiM + (gajiM / 10) +(anak * (gajiM * 3 / 20));
            }
            else if(istri.equalsIgnoreCase("y") && anak > 0 && anak <=3){
                this.gajiM = gajiDasar + (gajiDasar / 10) + (gajiDasar /10);
                this.gajiM = gajiM + (gajiM / 10)+ (gajiM / 10)+(anak * (gajiM * 3 / 20));
            }
            else if(istri.equalsIgnoreCase("y") && anak > 3) {
                this.gajiM = gajiDasar + (gajiDasar / 10) + (gajiDasar /10);
               this.gajiM = gajiM + (gajiM / 10) + (gajiM / 10)+ (3 * (gajiM * 3 / 20));
            }
            else {
                this.gajiM = gajiDasar + (gajiDasar / 10) + (gajiDasar /10);
                this.gajiM = gajiM + (3 * (gajiM * 3 / 20))+ (gajiM / 10);
            }
        }
    }

    public void Tampikan(){
        System.out.println("TERIMAKASIH TELAH MENGISI DATA");
        System.out.println("Inilah rincian tentang anda");
        System.out.println("_____=====^^^^^=====^^^^^=====_____");
        System.out.println("Nama anda        : "+nama);
       System.out.println("Jabatan anda      : "+jabatan);
        System.out.println("ID anda          : "+ID);
        System.out.println("Tahun Masuk anda : "+thn);
        System.out.println("Gaji anda        : Rp."+gajiM+"/Bulan");
        System.out.println("_____=====^^^^^=====^^^^^=====_____");
    }
     
 }

