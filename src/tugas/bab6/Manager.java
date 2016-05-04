package tugas.bab6;

public class Manager extends Employee {

    private double tj; //tj : tunjangan jabatan

    public void setIstri(String a) {
        if (a.equalsIgnoreCase(y)) {
            ti = 0.1 * jumlah;
        } else if (a.equalsIgnoreCase(n)) {
            ti = 0;
        }
    }

    public void setAnak(int a) {
        if (a >= 1 && a <= 3) {
            ta = 0.15 * jumlah;
        }
    }

    public void masaKerja(int a) {
        if (a < 2016) {
            a = 2016 - a;
            if (a <= 5) {
                bonus = 0;
                tunjangan = 0;
            } else if (a >= 6 && a <= 10) {
                bonus = 0.05 * gajipokok;
                tunjangan = 0;
            } else if (a > 10) {
                bonus = 0.1 * gajipokok;
                tunjangan = 0.1 * gajipokok;
            }
        }
    }

    public void TunjanganJabatan() {
        tj = jumlah * 0.1;
        jumlah += tj;
    }

}
