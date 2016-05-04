import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String idkerja, nama, tahun, jam, anak, jabatan;
        int anakk, tahunn, tahunnn, jamm, piljabatan;
        for (int i = 0; i < 16; i++) {
            System.out.println("\nData Karyawan ke -" + (i + 1));
            System.out.print("No ID : ");
            idkerja = input.nextLine();
            System.out.print("Nama : ");
            nama = input.nextLine();
            System.out.print("Status Pernikahan (Kawin/Single) : ");
            String status = input.nextLine();
            System.out.print("Mempunyai anak (Y/N) : ");
            String anakwa = input.nextLine();
            if (anakwa.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Anak : ");
                anak = input.nextLine();
                anakk = Integer.parseInt(anak);
            } else {
                anakk = 0;
            }
            System.out.print("Jabatan "
                    + "\n 1. Manager"
                    + "\n 2. Pegawai Tetap"
                    + "\n 3. Magang"
                    + "\n Pilihan jabatan : ");
            jabatan = input.nextLine();
            piljabatan = Integer.parseInt(jabatan);
            System.out.print("Tahun Masuk : ");
            tahun = input.nextLine();
            tahunn = Integer.parseInt(tahun);
            tahunnn = 2016 - tahunn;
            System.out.print("Lama Jam Kerja : ");
            jam = input.nextLine();
            jamm = Integer.parseInt(jam);
            if (piljabatan == 1) {
                Manager mager = new Manager(idkerja, nama, "Manager", status, tahunnn, jamm, anakk);
                mager.setBonus(tahunnn, status, anakk);
                mager.totGaj();
            } else if (piljabatan == 2) {
                PegawaiTetap tetap = new PegawaiTetap(idkerja, nama, "Pegawai Tetap", status, tahunnn, jamm, anakk);
                tetap.setBonus(tahunnn, status, anakk);
                tetap.totGaj();
            } else if (piljabatan == 3) {
                Magang mag = new Magang(idkerja, nama, "Magang", status, tahunnn, jamm, anakk);
                mag.setBonus(jamm);
                mag.totGaj();
            }
        }
    }
}
