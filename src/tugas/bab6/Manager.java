//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package tugasemployee;

public class Manager extends Employee {

    public Manager(String a, String b, String c, String d, String e, int f, int g) {
        super(a, b, c, d, e, f, g);
    }

    public double getTunjanganJabatan() {
        return 0.1 * (gaji + tahunkerja + tunjangan);
    }

    public double total() {
        return super.gajiTotal() + getTunjanganJabatan();
    }
}
