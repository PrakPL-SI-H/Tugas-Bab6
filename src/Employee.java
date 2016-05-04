
public class Employee {

    protected String nama, idKerja, jab, istri;
    protected int anak, tahun;
    protected int gajiPokok;
    protected double totalGaji, bonus, tunj, tunjIstri, tunjAnak;

    public Employee(String nm, String id, String jb, String is, int an, int th) {
        this.nama = nm;
        this.idKerja = id;
        this.jab = jb;
        this.istri = is;
        this.anak = an;
        this.tahun = th;
    }

    public void setGaji() {
        int masker = 2016 - tahun; //masker=masakerja
        if (masker <= 5) {
            bonus = 0;
            tunj = 0;
        } else if (masker >= 6 && masker <= 10) {
            bonus = 0.05 * gajiPokok;
            tunj = 0;
        } else if (masker > 10) {
            bonus = 0.1 * gajiPokok;
            tunj = 0.1 * gajiPokok;
        }

        totalGaji = gajiPokok + bonus + tunj;

        if ("y".equalsIgnoreCase(istri)) {
            tunjIstri = 0.1 * totalGaji;
            totalGaji += tunjIstri;
        }
        if (anak != 0) {
            if (anak >= 3) {
                tunjAnak = 3 * 0.15 * totalGaji;
                totalGaji += tunjAnak;
            } else {
                tunjAnak = anak * 0.15 * totalGaji;
                totalGaji += tunjAnak;
            }
        }
    }
}
