public class Manajer extends Employee {
    public int gaji;
    public int lamaKerja;

    public Manajer(String nama, String jabatan, String idKerja, String istri, int anak, int thn) {
        super(nama, jabatan, idKerja, istri, anak, thn);
    }
    
    public void HitungGaji(){
        lamaKerja = 2016 - thn;
        if (lamaKerja <= 5){
            this.gaji = gajiPokok;
        }
        else if (lamaKerja >= 6 && lamaKerja <=10){
            this.gaji = gajiPokok + (gajiPokok / 20);
        }
        else {
            if (istri.equalsIgnoreCase("y")&& anak == 0){
                this.gaji = gajiPokok + (gajiPokok / 10) + (gajiPokok / 10);
                this.gaji = gaji + (gaji / 10) + (gaji / 10) ;
            }
            else if(istri.equalsIgnoreCase("n") && anak > 0 && anak <=3){
                this.gaji = gajiPokok + (gajiPokok / 10) + (gajiPokok / 10);
                this.gaji = gaji + (gaji / 10) +(anak * (gaji * 3 / 20));
            }
            else if(istri.equalsIgnoreCase("y") && anak > 0 && anak <=3){
                this.gaji = gajiPokok + (gajiPokok / 10) + (gajiPokok /10);
                this.gaji = gaji + (gaji / 10)+ (gaji / 10)+(anak * (gaji * 3 / 20));
            }
            else if(istri.equalsIgnoreCase("y") && anak > 3) {
                this.gaji = gajiPokok + (gajiPokok / 10) + (gajiPokok /10);
                this.gaji = gaji + (gaji / 10) + (gaji / 10)+ (3 * (gaji * 3 / 20));
            }
            else {
                this.gaji = gajiPokok + (gajiPokok / 10) + (gajiPokok /10);
                this.gaji = gaji + (3 * (gaji * 3 / 20))+ (gaji / 10);
            }
        }
    }
    
    public void Tampikan(){
        System.out.println("===============================");
        System.out.println("Nama Pegawai : "+nama);
        System.out.println("Jabatan      : "+jabatan);
        System.out.println("ID           : "+idKerja);
        System.out.println("Tahun Masuk  : "+thn);
        System.out.println("Gaji         : Rp."+gaji+"/Bulan");
        System.out.println("===============================");
    }
    
}
