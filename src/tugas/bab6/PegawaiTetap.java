
package maingaji;


public class PegawaiTetap extends Employee{
    public PegawaiTetap(String name, String id, String jabatan, String istri, String anak, int thnkerja, int gaji, int jmlanak) {
        super(name, id, jabatan, istri, anak, thnkerja, gaji, jmlanak);
    }

    @Override
    public double getGaji() {
        return super.getGaji();
    }
}
