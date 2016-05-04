
public class Manager extends Employee {

    protected double tunjJab;

    public Manager(String nm, String id, String jb, String is, int an, int th) {
        super(nm, id, jb, is, an, th);
        gajiPokok = 5000000;
    }

    public void setTunjJab() {
        tunjJab = 0.1 * (gajiPokok + bonus + tunj);
        totalGaji += tunjJab;
    }

    public void showData() {
        System.out.println("=======================================");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("ID\t\t: " + idKerja);
        System.out.println("Jabatan\t\t: " + jab);
        System.out.println("Gaji pokok\t: " + gajiPokok);
        System.out.println("Bonus\t\t: " + bonus);
        System.out.println("Tunjangan\t: " + (tunj + tunjIstri + tunjAnak));
        System.out.println("Tunj. jabatan\t: " + tunjJab);
        System.out.println("Total gaji\t: IDR " + totalGaji + " /bulan");
        System.out.println("=======================================");
    }
}
