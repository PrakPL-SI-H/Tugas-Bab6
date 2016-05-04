
import java.util.Calendar;

public class Manager extends Employee {

    public Manager(String nama, String idKerja, String jabatan, String punyaIstri, int punyaAnak, int tahunMasuk) {//konstruktor subclass Manager
        super(nama, idKerja, jabatan, punyaIstri, punyaAnak, tahunMasuk);// pemanggilan konstruktor yang berada pada superclass
        gaji = 5000000;
    }

    public void setBonus(int tahunMasuk, String istri, int anak) { // encapsulasi atau method setter
        int currentYear = Calendar.getInstance().get(Calendar.YEAR); //untuk menentukan tahun sekarang secara otomatis
        int tahun = currentYear - super.getTahunMasuk();
        if (tahun < 5) {
            gaji += 0;
        } else if (tahun > 5 && tahun < 11) {
            gaji += (gaji * (0.05) * tahun);
        } else {
            gaji += (gaji * (0.1) * tahun) + (gaji * (0.1) * tahun);
        }
        if (istri.equalsIgnoreCase("ya") && anak == 0) {
            gaji += (gaji * (0.1) * tahun) + (gaji * (0.1) * tahun);
        } else if (istri.equalsIgnoreCase("ya") && anak < 4) {
            gaji += (gaji * (0.1) * tahun) + (gaji * (0.15) * anak * tahun) + (gaji * (0.1) * tahun);
        } else if (istri.equalsIgnoreCase("ya") && anak > 3) {
            gaji += ((gaji * (0.1) * tahun) + (gaji * (0.15) * 3 * tahun) + (gaji * (0.1) * tahun));
        } else {
            gaji += (gaji * (0.1) * tahun);
        }
    }

  }