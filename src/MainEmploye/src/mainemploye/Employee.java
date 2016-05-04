package mainemploye;

public class Employee {

    String nama;
    String id;
    String jabatan;
    boolean istri;
    boolean anak;
    int masuk;
    double bonus;
    double tunjangan;
    double gaji;

//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setJabatan(String jabatan) {
//        this.jabatan = jabatan;
//    }
//
//    public void setIstri(boolean istri) {
//        this.istri = istri;
//    }
//
//    public void setAnak(boolean anak) {
//        this.anak = anak;
//    }
//
//    public void setMasuk(int Masuk) {
//        this.masuk = masuk;
//    }
//    
    public double setBonus(){
        if  (masuk < 2011 && masuk >2005){
            bonus = 0.05*gaji;
            gaji = gaji + bonus;
        }
        else if (masuk < 2005){
            bonus = 0.1*gaji;
            gaji = gaji + bonus;
        }
        return gaji;
    }
    
    public double setTunjangan(){
        if (istri == true){
            tunjangan = gaji*0.1;
            gaji = gaji + tunjangan;
        }
        if (anak == true){
            tunjangan = gaji*0.15;
            gaji = gaji + tunjangan;
        }
        return gaji;
    }
    
    
    
}
