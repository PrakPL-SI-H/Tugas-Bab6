package mainemployee;

import java.util.Calendar;

public class pegawaiTetap extends Employee {

    public pegawaiTetap(String nama, String idKerja, String jabatan, String punyaIstri, int punyaAnak, int tahunMasuk) {//konstruktor subclass PegawaiTetap
        super(nama, idKerja, jabatan, punyaIstri, punyaAnak, tahunMasuk);// pemanggilan konstruktor yang berada pada superclass
        gaji = 2000000;
    }

}
