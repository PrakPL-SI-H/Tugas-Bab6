package tugas.bab6;


public class Employee {

    public String nama;
    public String jabatan;
    public String IdKerja;
    public String status;
    public int Jmlanak;
    public int tahunkerja;
    public final int Gaji = 10000000;
    
    
public Employee(String nama, String jabatan,String IdKerja, String status, int Jmlanak, int tahunkerja) {
    this.nama = nama;
    this.jabatan = jabatan;
    this.IdKerja = IdKerja;
    this.status = status;
    this.Jmlanak = Jmlanak;
    this.tahunkerja = tahunkerja;
}    
}
