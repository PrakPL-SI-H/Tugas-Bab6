package Laporan6Bab6;

public class Manager extends KaryawanTetap {

        private double bonusManager, GajiManager;

        public Manager(String nama, String idKerja, String jabatan, int istri, int anak, int lamaKerja) {
            super(nama, idKerja, jabatan, istri, anak, lamaKerja);
            setBonusManager();
            GajiManager = gajiPenuh + bonusManager;
        }

        public void setBonusManager() {
            bonusManager = (0.1 * gajiPenuh);
        }

        @Override
        public String toString() {
            return super.toString() + String.format("Bonus Manager   : Rp. %16s\nGaji Akhir      : Rp. %16s\n", (long) bonusManager, (long) GajiManager);
        }
    }

