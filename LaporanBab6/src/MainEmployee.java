
import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, idKerja, jabatan = "";
        int piljab = 0, pilih = 0, pilistri = 0, pilanak = 0, jamKerja = 0, hariKerja = 0, jumAnak = 0, hireYear = 0;
        int countManager = 0, countPNS = 0, countNonPNS = 0;
        boolean ist = true, ank = true;
        Manager[] man = new Manager[100];
        PegawaiTetap[] PNS = new PegawaiTetap[100];
        PegawaiTidakTetap[] nonPNS = new PegawaiTidakTetap[100];

        do {
        System.out.println("=====================================================");
        System.out.printf("%35s \n", "PENDATAAN KARYAWAN");
        System.out.println("=====================================================\n");
        System.out.print("Masukkan Nama\t\t: ");
        name = in.nextLine();
        System.out.print("Masukkan ID Kerja\t: ");
        idKerja = in.nextLine();

        do {
        System.out.println("Jabatan\t: ");
        System.out.println("1. Manager ");
        System.out.println("2. Pegawai Tetap");
        System.out.println("3. Pegawai Tidak Tetap");
        System.out.print("Masukkan Jabatan\t: ");
        piljab = in.nextInt();
        if (piljab == 1) {
            jabatan = "Manager";
        } else if (piljab == 2) {
            jabatan = "Pegawai Tetap";
        } else if (piljab == 3) {
            jabatan = "Pegawai Tidak Tetap";
        } else {
            System.out.println("Inputan Tidak Tersedia, Silahkan Masukkan Lagi");
        }
        } while (piljab != 1 && piljab != 2 && piljab != 3);
        
        if (piljab == 3) {
            System.out.print("Jumlah Hari Kerja\t: ");
            hariKerja = in.nextInt();
            System.out.print("Jumlah Jam Kerja\t: ");
            jamKerja = in.nextInt();
        }

        do {
        System.out.println("Memiliki istri? ");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Pilihan anda\t\t: ");
        pilistri = in.nextInt();

        if (pilistri == 1) {
            ist = true;
        } else if (pilistri == 2) {
            ist = false;
        } else {
            System.out.println("Inputan Tidak Tersedia, Silahkan Masukkan Lagi");
        }
        } while (pilistri != 1 && pilistri != 2);
        
        do {
        System.out.println("Memiliki Anak? ");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Pilihan anda\t\t: ");
        pilanak = in.nextInt();
        if (pilanak == 1) {
            ank = true;
            System.out.print("Jumlah Anak\t\t: ");
            jumAnak = in.nextInt();
        } else if (pilanak == 2) {
            ank = false;
        } else {
            System.out.println("Inputan Tidak Tersedia, Silahkan Masukkan Lagi");
        }
        } while (pilanak != 1 && pilanak != 2);

        System.out.print("Tahun Masuk\t\t: ");
        hireYear = in.nextInt();

        switch (piljab) {
            case 1:
                man[countManager] = new Manager(name, idKerja, jabatan, ist, ank, hireYear, jumAnak);
                countManager++;
                break;
            case 2:
                PNS[countPNS] = new PegawaiTetap(name, idKerja, jabatan, ist, ank, hireYear, jumAnak);
                countPNS++;
                break;
            case 3:
                nonPNS[countNonPNS] = new PegawaiTidakTetap(name, idKerja, jabatan, ist, ank, hireYear, jumAnak);
                nonPNS[countNonPNS].setJamKerja(jamKerja);
                nonPNS[countNonPNS].setHariKerja(hariKerja);
                countNonPNS++;
                break;
        }
        System.out.println("Ingin memasukkan data lagi?\n"
                    + "1. Ya\n"
                    + "2. Tidak");
            System.out.print("Pilihan anda\t\t: ");
            pilih = in.nextInt();
            System.out.println("");
            in.nextLine();
        } while (pilih != 2);
        
        System.out.println("=====================================================");
        System.out.printf("%-12s \n", "\t\tDATA PEKERJA PT FORZA");
        System.out.println("=====================================================\n");
        for (int i = 0; i < countManager; i++) {
            System.out.println("Nama\t\t\t: " + man[i].getName());
            System.out.println("ID Kerja\t\t: " + man[i].getIDKerja());
            System.out.println("Jabatan\t\t\t: " + man[i].getJabatan());
            System.out.println("Istri\t\t\t: " + man[i].getIstri());
            System.out.println("Anak\t\t\t: " + man[i].getAnak());
            if (man[i].getAnak().equals("Ada")) {
                man[i].jumAnak();
            }
            System.out.println("Masuk Kerja Tahun\t: " + man[i].getHireYear());
            System.out.println("Gaji Yang Diterima\t: Rp. " + man[i].getSalary());
            System.out.println("=====================================================");
        }
        for (int i = 0; i < countPNS; i++) {
            System.out.println("Nama\t\t\t: " + PNS[i].getName());
            System.out.println("ID Kerja\t\t: " + PNS[i].getIDKerja());
            System.out.println("Jabatan\t\t\t: " + PNS[i].getJabatan());
            System.out.println("Istri\t\t\t: " + PNS[i].getIstri());
            System.out.println("Anak\t\t\t: " + PNS[i].getAnak());
            if (PNS[i].getAnak().equals("Ada")) {
                PNS[i].jumAnak();
            }
            System.out.println("Masuk Kerja Tahun\t: " + PNS[i].getHireYear());
            System.out.println("Gaji Yang Diterima\t: Rp. " + PNS[i].getSalary());
            System.out.println("=====================================================");
        }
        for (int i = 0; i < countNonPNS; i++) {
            System.out.println("Nama\t\t\t: " + nonPNS[i].getName());
            System.out.println("ID Kerja\t\t: " + nonPNS[i].getIDKerja());
            System.out.println("Jabatan\t\t\t: " + nonPNS[i].getJabatan());
            System.out.println("Istri\t\t\t: " + nonPNS[i].getIstri());
            System.out.println("Anak\t\t\t: " + nonPNS[i].getAnak());
            if (nonPNS[i].getAnak().equals("Ada")) {
                nonPNS[i].jumAnak();
            }
            System.out.println("Masuk Kerja Tahun\t: " + nonPNS[i].getHireYear());
            System.out.println("Banyak Hari Kerja\t: " + nonPNS[i].getHariKerja());
            System.out.println("Banyak Jam Kerja\t: " + nonPNS[i].getJamKerja());
            System.out.println("Gaji Yang Diterima\t: Rp. " + nonPNS[i].getSalary());
            System.out.println("=====================================================");
        }
    }
}
