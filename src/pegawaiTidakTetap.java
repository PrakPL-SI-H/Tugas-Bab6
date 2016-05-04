package employee;
public class pegawaiTidakTetap extends Employee {
        private int GajiLembur, JamKerja;
        public pegawaiTidakTetap(String name, String id, String Jabatan, String istri, String anak, int ThnKerja, double gaji, int jmlhAnak) {
            super(name, id, Jabatan, istri, anak, ThnKerja, gaji, jmlhAnak);
        }
        public void setJamKerja(int a) {
            JamKerja = a;
        }
        public double getGajiLembur() {
            if (JamKerja > 10) {
                GajiLembur = (JamKerja - 10) * 10000;
            } else {
                GajiLembur = 0;
            }
            return GajiLembur;             
        }
        public double getGaji() {
            return gaji + getGajiLembur();
        }
    }