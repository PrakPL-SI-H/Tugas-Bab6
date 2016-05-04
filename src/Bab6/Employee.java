package Bab6;

public class Employee {
    String Nama;
    String Jabatan;
    String Id;
    String Istri;
    int Anak;
    int Tahun;
    final int GajiPokok = 5000000;
    
    public Employee(String Nama, String Jabatan, String Id, String Istri, int Anak, int Tahun) {
        this.Nama = Nama;
        this.Jabatan = Jabatan;
        this.Id = Id;
        this.Istri = Istri;
        this.Anak = Anak;
        this.Tahun = Tahun;
    }
}
