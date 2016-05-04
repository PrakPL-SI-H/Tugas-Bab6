package Bab6;

public class Employee {
    String Nama;
    String Jabatan;
    String Id;
    String Istri;
    int Anak;
    int Tahun;
    final int GajiPokokManajer = 8000000;
    final int GajiPokokPegTetap = 5000000;
    final int GajiPokokPegTakTetap = 3000000;
    
    public Employee(String Nama, String Jabatan, String Id, String Istri, int Anak, int Tahun) {
        this.Nama = Nama;
        this.Jabatan = Jabatan;
        this.Id = Id;
        this.Istri = Istri;
        this.Anak = Anak;
        this.Tahun = Tahun;
    }
}
