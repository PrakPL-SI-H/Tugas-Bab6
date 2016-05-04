package mainemployee;

public class pegawaiTidakTetap extends Employee {

    public pegawaiTidakTetap(String nama, String idKerja, String jabatan, String punyaIstri, int punyaAnak, int tahunMasuk, int jam) { //konstruktor subclass PegawaiTidakTetap
        super(nama, idKerja, jabatan, punyaIstri, punyaAnak, tahunMasuk);//pemanggilan konstruktor yang berada di superclass
        gaji = 1000000;
    }

    public void setBonus(int jam) {  //method setter
        if (jam > 10) {
            gaji += ((10000 * (jam - 10)) * 30);
        } else {
            gaji += 0;
        }
    }

    public void displayMessage() {
        System.out.println("Total gajinya adalah " + gaji);
        System.out.println("");
    }
}
