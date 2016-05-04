package PrakSIH;
public class Employee {
    String name, idKerja, jabatan, istri, anak;
    int jmlanak, thnkerja, lamakerja, gaji;
    double tunjangan, tunjangananak, tunjanganistri, tunjanganmasa, bonus;

    public Employee(String name, String id, String jabatan, String istri,
            String anak, int thnkerja, int gaji, int jmlanak) {
        this.name = name;
        this.idKerja = id;
        this.jabatan = jabatan;
        this.istri = istri;
        this.anak = anak;
        this.thnkerja = thnkerja;
        this.gaji = gaji;
        this.jmlanak = jmlanak;
    }
    public Employee() {
    }
    public void setLamaKerja (int lamakerja){
        this.lamakerja = lamakerja;
    }
    public int lamaKerja() {
        lamakerja = 2016 - thnkerja;
        return lamakerja;
    }
    public void setID(String idKerja){
        this.idKerja = idKerja;
    }
    public String getID() {
        return idKerja;
    }
    public double tunjanganDanBonus() {
        if (lamakerja <= 5) {
            bonus = 0;
            tunjanganmasa = 0;
            if (istri.equalsIgnoreCase("Ya")) {
                tunjanganistri = 0.1 * gaji;
            }
            if (anak.equalsIgnoreCase("Ya")) {
                tunjangananak = ((0.15 * jmlanak) * gaji);
            }
            tunjangan = tunjangananak + tunjanganistri + tunjanganmasa + bonus;
        }
        if (lamakerja >= 6 && lamakerja <= 10) {
            bonus = (lamakerja * 0.05 * gaji);
            tunjanganmasa = 0;
            if (istri.equalsIgnoreCase("Ya")) {
                tunjanganistri = 0.1 * gaji;
            }
            if (anak.equalsIgnoreCase("Ya")) {
                tunjangananak = ((0.15 * jmlanak) * gaji);
            }
            tunjangan = tunjangananak + tunjanganistri + tunjanganmasa + bonus;
        }
        if (lamakerja > 10) {
            bonus = (lamakerja * 0.01) * gaji;
            tunjanganmasa = (lamakerja * 0.01) * gaji;
            if (istri.equalsIgnoreCase("Ya")) {
                tunjanganistri = 0.1 * gaji;
            }
            if (anak.equalsIgnoreCase("Ya")) {
                tunjangananak = ((0.15 * jmlanak) * gaji);
            }
            tunjangan = tunjangananak + tunjanganistri + tunjanganmasa + bonus;
        }
        return tunjangan;
    }
    public String getName() {
        return name;
    }
    public double getGaji() {
        return gaji + tunjangan;
    }
    public String getJabatan(){
        return jabatan;
    }
}