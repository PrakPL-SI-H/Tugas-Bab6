package Inheritance;
public class Employee {
    public double bonus;
    public double tunjangan;
    public String name;
    public int Idkerja;
    public String Jabatan;
    public String Status;
    public int anak;
    public int Tahun;
    public int gaji = 3000000;
    int hasil;
    public Employee(String name,int Idkerja,String Jabatan,String Status,int anak,int Tahun){
        this.name = name;
        this.Idkerja = Idkerja;
        this.Status = Status;
        this.anak = anak;
        this.Jabatan=Jabatan;
        this.Tahun = Tahun;
    }
    public void tunjangan (){
    hasil = 2016-Tahun;
    if(hasil <= 5){
        System.out.println("Tidak mendapat bonus");
    }else if(hasil>=6 && hasil<=10){
        System.out.println("Mendapat bonus 0.05 dari lama kerja ");
        bonus = 0.05;
        System.out.println("Tidak mendapatkan tunjangan");
    }else{
        System.out.println("mendapatkan bonus 0.1 dari lama kerja");
        bonus = 0.1;
        System.out.println("mendapatkan tunjangan 0.1 dari lama kerja");
        tunjangan = 0.1;
        }
    }
    public String Getnama(){
    return name;
    }
    public String GetJabatan(){
    return Jabatan;
    }
    public int GetIdKerja(){
    return Idkerja;
    }
    public void Status(){
    if (Status == "ya" ){
        System.out.println("mendapatkan tunjangan 0.1 dari total gaji yang didapat");
    }else{
        System.out.println("Jika belum kawin tunjangan istri 0 rupiah ");
        }
    }
    public void anak(){
        if (anak == 1){
        System.out.println("tunjangan anak sebesar 0.15 dari jumlah gaji yang di dapatkan ");
        } else if (anak == 2){
        System.out.println("tunjangan anak sebesar 0.15 dari jumlah gaji yang di dapatkan ");
        } else if (anak == 3){
        System.out.println("tunjangan anak sebesar 0.15 dari jumlah gaji yang di dapatkan ");
        }else 
        System.out.println("tidak mendapatkan tunjangan untuk anak");
    }
    public void Tampilan(){
        System.out.println("Nama        : "+ name );
        System.out.println("Jabatan     : "+ Jabatan );
        System.out.println("Id Kerja    : "+ Idkerja );
        System.out.println("Status Kawin: "+ Status);
        System.out.println("Jumlah Anak : "+ anak );
        System.out.println("Awal Masuk  : Th "+ Tahun );
    }
}