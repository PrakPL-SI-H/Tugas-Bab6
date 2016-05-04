
public class Magang extends Employee {

    protected int lembur, jam;

    public Magang(String nm, String id, String jb, String is, int an, int th) {
        super(nm, id, jb, is, an, th);
        gajiPokok = 3000000;
    }

    @Override
    public void setGaji() {
        if (jam > 10) {
            lembur = jam - 10;
            totalGaji = gajiPokok + (10000 * lembur);
        } else {
            totalGaji = gajiPokok;
        }
    }

    public void showData() {
        System.out.println("=======================================");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("ID\t\t: " + idKerja);
        System.out.println("Jabatan\t\t: " + jab);
        System.out.println("Gaji pokok\t: " + gajiPokok);
        System.out.println("Bonus lembur\t: " + (10000 * lembur));
        System.out.println("Total gaji\t: IDR " + totalGaji + " /bulan");
        System.out.println("=======================================");
    }
}
