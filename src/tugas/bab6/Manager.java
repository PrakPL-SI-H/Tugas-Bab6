package tugas.bab6;

public class Manager extends Employee {
    private double tunjanganJabatan;

    public Manager(String nama, String id, String jabatan, 
    String istri, String anak, int bnykAnak, int tahunMasuk) {
        super(nama, id, jabatan, istri, anak, bnykAnak, 
        tahunMasuk);
    }
    
    public double gettunjanganJabatan() {
        return this.tunjanganJabatan = 0.1 * (Gaji + Thn_Kerja    
        + Tunjangan);
    }

    @Override
    public double getGaji() {
        double gajiManager = super.getGaji();
        return gajiManager + gettunjanganJabatan();
    }
}

