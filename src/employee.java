package ww;
public class employee {
    private String nama;
    private String idKerja;
    private String jabatan;
    private String istri;
    private String anak;
    int jumanak, ThnKerja, LamaKerja;
    double tunjangan, tunjanganAnak, tunjanganIstri, bonus, gaji;
    private static int count=0;
    public employee(String name, String id, String Jabatan, String istri, String anak, int ThnKerja, double gaji, int jmlhAnak){
        this.nama = name;
        this.idKerja = id;
        this.jabatan=Jabatan;
        this.istri = istri;
        this.anak = anak;
        this.ThnKerja = ThnKerja;
        this.gaji = gaji;
        this.jumanak = jmlhAnak;
       } public String getNama() {
        return nama;
    } public double getTunjangan() {
        return tunjangan=tunjanganAnak+tunjanganIstri;
    } public double getBonus() {
        return bonus;
    } public double getGaji() {
        return gaji + bonus + tunjangan;
    } public String getID(){
        return idKerja;
    } public static int Counting(){
        count++;
        return count;
    } public int LamaKerja(int ThnKerja){
       LamaKerja=2015-ThnKerja;
        return 2015-ThnKerja;
    } public void tunjanganDanBonus(int ThnKerja) {
        if (LamaKerja(ThnKerja) <= 5) {
            bonus = 0;
tunjangan=0;
            if (istri.equalsIgnoreCase("Ya")) {
                tunjanganIstri = 0.1 * gaji;
            } else {
                tunjanganIstri= 0;
            } if (anak.equalsIgnoreCase("Ya")) {
                if(jumanak>3){
                    tunjanganAnak = ((0.15 * 3) * gaji);
                }else{
                    tunjanganAnak = ((0.15 * jumanak) * gaji);
                }
            }
        }
  if (LamaKerja(ThnKerja) >= 6 && LamaKerja(ThnKerja) <= 10) {
            bonus = (gaji * 0.05);
tunjangan=0;
            if (istri.equalsIgnoreCase("Ya")) {
                tunjanganIstri = ((0.1 * gaji));
            } else {
                tunjanganIstri= 0;
            } if (anak.equalsIgnoreCase("Ya")) {
               if(jumanak>3){
                    tunjanganAnak = ((0.15 * 3) * gaji);
                }else{
                    tunjanganAnak = ((0.15 * jumanak) * gaji);
                }
            }
  }
        if (LamaKerja(ThnKerja) > 10) {
            bonus = (gaji * 0.1);
            tunjangan= (gaji * 0.1);
            if (istri.equalsIgnoreCase("Ya")) {
tunjanganIstri = (0.1 * gaji) + ((0.1 * LamaKerja(ThnKerja)) * gaji);
             } else {
                tunjanganIstri= 0;
            } if (anak.equalsIgnoreCase("Ya")) {
                if(jumanak>3){
                    tunjanganAnak = ((0.15 * 3) * gaji);
                }else{
                    tunjanganAnak = ((0.15 * jumanak) * gaji);
        }
            }
        }
    }
}