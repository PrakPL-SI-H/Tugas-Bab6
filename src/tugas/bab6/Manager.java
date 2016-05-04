package mainemployee;

import java.util.Calendar;

public class Manager extends Employee {

    public Manager(String nama, String idKerja, String jabatan, String punyaIstri, int punyaAnak, int tahunMasuk) {//konstruktor subclass Manager
        super(nama, idKerja, jabatan, punyaIstri, punyaAnak, tahunMasuk);// pemanggilan konstruktor yang berada pada superclass
        gaji = 5000000;
    }

  }