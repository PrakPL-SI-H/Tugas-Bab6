package bab6;

import static bab6.Employee1.anak;
import static bab6.Employee1.istri;
import java.util.Scanner;

public class EmployeeM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee1 data = new Employee1();
        PNS pegawai = new PNS();
        Manager1 A = new Manager1();
        PegawaiNonTetap B = new PegawaiNonTetap();
        int pilih;
        do {
            System.out.println("           ===== MENU PILIHAN =====          ");
            System.out.println("");
            System.out.println("1.   Data Kepegawaian Manager ");
            System.out.println("2.   Data Kepegawaian Pegawai Tetap (PNS) ");
            System.out.println("3.   Data Kepegawaian Pegawai Non Tetap ");
            System.out.println("");
            System.out.print("Masukkan Pilihan Anda    : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("");
                    int Manager[] = new int[1];
                    for (int i = 1; i <= Manager.length; i++) {
                        System.out.println("Data Kepegawaian Manager [" + i + "] :");
                        pegawai.getData();
                        System.out.println("");
                        System.out.println("============================================");
                        data.setTahunSekarang(2015);
                        data.setHasil();
                        data.getGaji();
                        pegawai.setLamakerja();
                        data.setAnak(anak);
                        pegawai.setSumAnak();
                        data.setIstri(istri);
                        pegawai.setSumIstri();
                        A.setTunJabatan();
                        System.out.println("============================================");
                    }
                    break;
                case 2:
                    System.out.println("");
                    int PNS[] = new int[10];
                    for (int i = 1; i <= PNS.length; i++) {
                        System.out.println("Data Kepegawaian PNS [" + i + "] :");
                        pegawai.getData();
                        System.out.println("");
                        System.out.println("============================================");
                        data.setTahunSekarang(2015);
                        data.setHasil();
                        data.getGaji();
                        pegawai.setLamakerja();
                        data.setAnak(anak);
                        pegawai.setSumAnak();
                        data.setIstri(istri);
                        pegawai.setSumIstri();
                        System.out.println("============================================");
                    }
                    break;
                case 3:
                    System.out.println("");
                    int NonTetap[] = new int[5];
                    for (int i = 1; i <= NonTetap.length; i++) {
                        System.out.println("Data Kepegawaian Pegawai Non Tetap [" + i + "] :");

                        pegawai.getData();
                        System.out.println("");
                        System.out.println("============================================");
                        data.setTahunSekarang(2015);
                        data.setHasil();
                        data.getGaji();
                        pegawai.setLamakerja();
                        data.setAnak(anak);
                        pegawai.setSumAnak();
                        data.setIstri(istri);
                        pegawai.setSumIstri();
                        System.out.println("");
                        B.getLembur();
                        B.setLembur();
                        System.out.println("============================================");
                    }
                    break;
            }
        } while (pilih >= 1 && pilih < 3);
    }
}
