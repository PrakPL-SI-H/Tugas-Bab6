package PrakPemlan;

public class Manager1 extends Employee1 {

    public String tunjanganjabatan;

    public void setTunJabatan() {
        double d = 0.1 * (gaji + hsl + tunjangan);
        System.out.println("Tunjangan jabatan : " + d + " rupiah");
    }
}