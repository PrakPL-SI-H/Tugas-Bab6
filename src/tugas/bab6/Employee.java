package tugas.bab6;

public class Employee {

    protected String nama, id, jab, istri, y, n;
    protected int anak, th, mk; //mk : masa kerja
    protected double jumlah, sementara, tunjangan, ta, ti, bonus, gajipokok = 10000000;

    public void getJab(int a) {
        if (a == 1) {
            jab = "Manager";
        } else if (a == 2) {
            jab = "Pegawai Tetap";
        } else if (a == 3) {
            jab = "Pegawai Tidak Tetap";
        }
    }
    
    public void gajiSementara(){
        sementara = bonus + tunjangan + gajipokok;
    }
    
    public void gajiTotal() {
        jumlah = sementara + ta + ti;
    }

    public void Cetak(){
        System.out.println("Nama Karyawan\t: "+nama);
        System.out.println("ID Kerja\t: "+id);
        System.out.println("Jabatan\t\t: "+jab);
        System.out.println("Tahun Masuk\t: "+th);
        System.out.printf("%s%15.2f\n","Gaji\t\t: ",jumlah);
    }
}
