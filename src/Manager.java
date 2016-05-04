public class Manager extends EmployeeUtama {
    double tunjanganprofesi;
    public Manager(String nama, String idKerja, String jabatan, int tahun, boolean anak, boolean istri) {
        super(nama, idKerja, jabatan, tahun, anak, istri);
    }
    public double getTunjanganprofesi() {
        double gajikotor;
        gajikotor = super.getGaji() + super.getTunjangan() + super.getLamabekerja();
        return tunjanganprofesi = 0.1 * gajikotor;
    }
    public double gajimanager() {
        super.setGaji(super.getGaji() + super.bonus1() + getTunjanganprofesi() + super.getTunjangananak() + super.getTunjanganistri() + super.getTunjangan());
        return super.getGaji();
    }
}

