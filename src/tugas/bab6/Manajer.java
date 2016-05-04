
package maingaji;


public class Manajer extends Employee{
    private double tunjanganjabatan;

    public Manajer(String name, String id, String jabatan, String istri, String anak, int thnkerja, int gaji, int jmlanak) {
        super(name, id, jabatan, istri, anak, thnkerja, gaji, jmlanak);

    }

    public double gettunjanganJabatan() {
        return this.tunjanganjabatan = 0.1 * (gaji + thnkerja + tunjangan);

    }

    @Override
    public double getGaji() {
        double gajiManajer = super.getGaji();
        return gajiManajer + gettunjanganJabatan();
    }
}
