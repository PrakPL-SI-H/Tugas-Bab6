package bab6;

public class Manager1 extends Employee1 {

    public String tunjanganjabatan;

    public void setTunJabatan() {
        double d = 0.1 * (gaji + hasil) - 1;
        System.out.println("Tunjangan Jabatan           : " + (int) d + "\t Rupiah");
    }
}
