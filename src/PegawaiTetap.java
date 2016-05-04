public class PegawaiTetap extends EmployeeUtama {

    public PegawaiTetap(String nama, String id, String jabatan, int tahun, boolean anak, boolean istri) {
        super(nama, id, jabatan, tahun, anak, istri);
    }

    public void gajipegawaitetap() {
        super.setGaji(super.bonus1() + super.getGaji() + super.getTunjangananak() + super.getTunjanganistri() + super.getTunjangan());
    }
}