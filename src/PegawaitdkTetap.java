public class PegawaitdkTetap extends Employee {
    public int lembur;
    public int jam;
    public int gaji;

    public PegawaitdkTetap(String nama, String jabatan, String idKerja, String istri, int anak, int thn, int jam) {
        super(nama, jabatan, idKerja, istri, anak, thn);
        this.jam = jam;
    }
    
    public void HitungGaji(){
        if (jam > 10){
            lembur = jam - 10;
            this.gaji = gajiPokok + (10000 * lembur);
        }
        else{
            this.gaji = gajiPokok;
        }
    }
    
    public void Tampilkan(){
        System.out.println("===============================");
        System.out.println("Nama Pegawai : "+nama);
        System.out.println("Jabatan      : "+jabatan);
        System.out.println("ID           : "+idKerja);
        System.out.println("Tahun Masuk  : "+thn);
        System.out.println("Gaji         : Rp."+gaji+"/Bulan");
        System.out.println("===============================");
    }
}
