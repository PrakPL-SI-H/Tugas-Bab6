package mainemploye;

public class Employee {

    String nama;
    String id;
    String jabatan;
    boolean istri;
    boolean anak;
    String punya;
    int masuk;
    double bonus;
    double tunjangan;
    double gaji;

    public double setBonus() {
        if (masuk < 2011 && masuk > 2005) {
            bonus = 0.05 * gaji;
            gaji = gaji + bonus;
        } else if (masuk < 2005) {
            bonus = 0.1 * gaji;
            gaji = gaji + bonus;
        }
        return gaji;
    }

    public double setTunjangan() {
        if (istri == true) {
            if (anak == true) {
                tunjangan = gaji * 0.25;
                gaji = gaji + tunjangan;
            }
        } else if (anak == true) {
            tunjangan = gaji * 0.15;
            gaji = gaji + tunjangan;
        } else if (istri == true) {
            tunjangan = gaji * 0.1;
            gaji = gaji + tunjangan;
        }
        return gaji;
    }

    public String setBenar() {
        if (istri == true) {
            punya = "ya";
        } else if (anak == true) {
            punya = "ya";
        } else {
            punya = "tidak";
        }
        return punya;
    }

    public void tampilan() {
        System.out.println("====== >> Data Pegawai << ======");
        System.out.println("");
        System.out.println("================================");
        System.out.println("||  Nama Pegawai    : " + nama);
        System.out.println("||  ID Pegawai      : " + id);
        System.out.println("||  Jabatan Pegawai : " + jabatan);
        System.out.println("||  Mempunyai istri : " + setBenar());
        System.out.println("||  Mempunyai anak  : " + setBenar());
        System.out.println("||  Tahun Masuk     : " + masuk);
        System.out.println("||  Gaji Sebesar    : " + gaji+",-");
        System.out.println("||  Besar Tunjangan : " + tunjangan+",-");
        System.out.println("||  Besar Bonus     : " + bonus+",-");
        System.out.println("================================");
    }
}
