package Bab6;

public class Employee {
    public String Nama, Jabatan, Id, Istri;
    int Anak, Tahun;
    final int GajiPokokManajer = 8000000, 
              GajiPokokPegTetap = 5000000, 
              GajiPokokPegTakTetap = 3000000;
    
    public Employee(String Nama, String Jabatan, String Id, String Istri, int Anak, int Tahun) {
        this.Nama = Nama;
        this.Jabatan = Jabatan;
        this.Id = Id;
        this.Istri = Istri;
        this.Anak = Anak;
        this.Tahun = Tahun;
    }
    
    public void GetData() {
        System.out.println("Nama                    : " + Nama);
        System.out.println("Id                      : " + Id);
        System.out.println("Jabatan                 : " + Jabatan);
        System.out.println("Tahun bergabung         : " + Tahun);
    }
}
