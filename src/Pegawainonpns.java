package inheritance;
public class Pegawainonpns extends Employee {
    public double jamkerja, tambah;
    public void gaji(){
        if (jamkerja>10){
            tambah=10000*(jamkerja-10);
            total=gajipokok+tambah;
        }else 
            tambah=10000*0;
            total=gajipokok+tambah;
    }   
    public void masukan(){
        System.out.print("Masukkan Nama = ");
        nama = input.next();
        System.out.print("Masukkan ID = ");
        idkerja = input.next();
        System.out.print("Masukkan Jabatan = ");
        jabatan = input.next();
        System.out.print("Masukkan Jumlah Istri (Jika Belum punya masukkan 0) = ");
        jumistri = input.nextInt();
        System.out.print("Masukkan Jumlah Anak (Jika Belum punya masukkan 0 ) = ");
        jumanak = input.nextInt();
        System.out.print("Masukkan Tahun Kerja = ");
        taunkerja = input.nextInt();    
        System.out.print("Masukkan Lama Kerja per Hari = ");
        jamkerja=input.nextInt();
        System.out.println();
    }
}