public class Employee {
    public String nama;
    public String jabatan;
    public String idKerja;
    public String istri;
    public int anak, thn;
    public final int gajiPokok = 4000000;
    
    public Employee (String nama, String jabatan, String idKerja, String istri, int anak, int thn){
        this.nama = nama;
        this.jabatan = jabatan;
        this.idKerja = idKerja;
        this.istri = istri;
        this.anak = anak;
        this.thn = thn;
    }   
}
