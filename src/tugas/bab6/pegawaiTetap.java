package mainemployee;

import java.util.Calendar;

public class pegawaiTetap extends Employee {

    public pegawaiTetap(String nama, String idKerja, String jabatan, String punyaIstri, int punyaAnak, int tahunMasuk) {//konstruktor subclass PegawaiTetap
        super(nama, idKerja, jabatan, punyaIstri, punyaAnak, tahunMasuk);// pemanggilan konstruktor yang berada pada superclass
        gaji = 2000000;
    }

    public void setBonus(int tahunMasuk, String istri, int anak) {//method setter atau encapsulasi
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int tahun = currentYear - super.getTahunMasuk();
        if (tahun < 5) {
            gaji += 0;
        } else if (tahun > 5 && tahun < 11) {
            gaji += (gaji * (0.05) * tahun);
        } else {
            gaji += (gaji * (0.1 * tahun)) + (gaji * (0.1 * tahun));
        }
        if (istri.equalsIgnoreCase("ya") && anak == 0) {
            gaji += (gaji * (0.1 * tahun));
        } else if (istri.equalsIgnoreCase("ya") && anak < 4) {
            gaji += (gaji * (0.1 * tahun)) + (gaji * (0.15 * tahun) * anak);
        } else if (istri.equalsIgnoreCase("ya") && anak > 3) {
            gaji += ((gaji * (0.1 * tahun)) + (gaji * (0.15 * tahun) * 3));
        } else {
            gaji += 0;
        }
    }

    public void displayMessage() {
        System.out.println("Total gajinya adalah " + gaji);
    }
}
