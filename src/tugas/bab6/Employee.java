package tugas.bab6;

class Employee {

    private String Nama, ID, Jabatan, Istri, Anak;
    int Bnyk_Anak, Thn_Masuk, Thn_Kerja;
    double Tunjangan, Bonus, Gaji = 20000;

    public Employee(String nama, String id, String jabatan, String istri, String anak, int bnykAnak, int tahunMasuk) {
        this.Nama = nama;
        this.ID = id;
        this.Jabatan = jabatan;
        this.Istri = istri;
        this.Anak = anak;
        if (bnykAnak > 3) {
            this.Bnyk_Anak = 3;
        } else {
            this.Bnyk_Anak = bnykAnak;
        }
        this.Thn_Masuk = tahunMasuk;
        this.Thn_Kerja = 2015 - tahunMasuk;
    }

    public void tunjanganDanBonus(int TahunMasuk) {
        if (Thn_Kerja < 5) {
            Bonus = 0;
            Tunjangan = 0;
        } else if (Thn_Kerja <= 6 && Thn_Kerja <= 10) {
            Bonus = 0.05 * Gaji * Thn_Kerja;
            Tunjangan = 0;
        } else if (Thn_Kerja > 10) {
            Bonus = 0.1 * Gaji * Thn_Kerja;
            Tunjangan = 0.1 * Gaji * Thn_Kerja;
        }

        if (Istri.equalsIgnoreCase("Y") && Anak.equalsIgnoreCase("Y")) {
            Tunjangan += (0.1 * (Gaji + Tunjangan)) + ((0.15 * Bnyk_Anak) * (Tunjangan + Gaji));
        } else if (Istri.equalsIgnoreCase("Y") && Anak.equalsIgnoreCase("N")) {
            Tunjangan += (0.1 * (Gaji + Tunjangan));
        } else if (Istri.equalsIgnoreCase("N") && Anak.equalsIgnoreCase("Y")) {
            Tunjangan += ((0.15 * Bnyk_Anak) * (Tunjangan + Gaji));
        } else if (Istri.equalsIgnoreCase("N") && Anak.equalsIgnoreCase("N")) {
            Tunjangan = Tunjangan;
        }
    }

    public String getNama() {
        return Nama;
    }

    public double getTunjangan() {
        return Tunjangan;
    }

    public double getBonus() {
        return Bonus;
    }

    public double getGaji() {
        return Gaji + Bonus + Tunjangan;
    }
}
