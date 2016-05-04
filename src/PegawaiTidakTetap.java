public class PegawaiTidakTetap extends EmployeeUtama {
    int jamkerja;
    public PegawaiTidakTetap(String nama, String id, String jabatan, int tahun, boolean anak, boolean istri) {
        super(nama, id, jabatan, tahun, anak, istri);
    }
    public void setJamkerja(int jamkerja) {
        this.jamkerja = jamkerja;
    }
    public int getlembur() {
        int gajilembur = 10000;
        int jamlembur = 0;
        if (jamkerja < 10) {
            jamlembur = 0;
        } else if (jamkerja > 10) {
            jamlembur = jamkerja - 10;
        }
        return jamlembur * gajilembur;
    }

    public double gajipegawailepas() {
        super.setGaji(super.getGaji() + getlembur());
        return super.getGaji();
    }
}


