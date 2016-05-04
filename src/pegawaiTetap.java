package employee;
public class pegawaiTetap extends Employee {
    public pegawaiTetap(String name, String id, String jabatan, String istri, String anak, int thnkerja, int gaji, int jmlanak) {
        super(name, id, jabatan, istri, anak, thnkerja, gaji, jmlanak);
    }
    public double getGaji() {
        return super.getGaji();
    }
}