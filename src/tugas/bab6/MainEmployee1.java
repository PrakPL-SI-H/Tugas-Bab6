package PrakPemlan;

import static PrakPemlan.Employee1.anak;
import static PrakPemlan.Employee1.istri;
import java.util.Scanner;

public class MainEmployee1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee1 data = new Employee1();
        PNS pegawai = new PNS();
        Manager1 A = new Manager1();
        PegawaiNonTetap B = new PegawaiNonTetap();
        int pil;
        System.out.println(" ===== DATABASE PT. SEJAHTERA INDONESIA ===== ");
        do {
            System.out.println();
            System.out.println("\t\tMENU PILIHAN");
            System.out.println("1.\tData Kepegawaian Manager");
            System.out.println("2.\tData Kepegawaian Pegawai Tetap (PNS) ");
            System.out.println("3.\tData Kepegawaian Non Tetap");
            System.out.println();
            System.out.print("Masukkan pilihan Anda : ");
            pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.println();
                    int Manager[] = new int[1];
                    for (int i = 1; i <= Manager.length; i++) {
                        System.out.println("Data Kepegawaian Manager [" + i + "]");
                        pegawai.getData();
                        System.out.println();
                        System.out.println("====================================");
                        data.setTahunSekarang(2016);
                        data.setHasil();
                        data.getGaji();
                        pegawai.setLamaKerja();
                        data.setJlhAnak(anak);
                        pegawai.setSumAnak();
                        data.setJlhIstri(istri);
                        pegawai.setSumIstri();
                        A.setTunJabatan();
                        System.out.println("====================================");
                    }
                    break;
                case 2:
                    System.out.println();
                    int PNS[] = new int[3];
                    for (int i = 1; i <= PNS.length; i++) {
                        System.out.println("Data Kepegawaian PNS[" + i + "]");
                        pegawai.getData();
                        System.out.println();
                        System.out.println("====================================");
                        data.setTahunSekarang(2016);
                        data.setHasil();
                        data.getGaji();
                        pegawai.setLamaKerja();
                        data.setJlhAnak(anak);
                        pegawai.setSumAnak();
                        data.setJlhIstri(istri);
                        pegawai.setSumIstri();
                        A.setTunJabatan();
                        System.out.println("====================================");
                    }
                    break;
                case 3:
                    System.out.println();
                    int NonTetap[] = new int[3];
                    for (int i = 1; i <= NonTetap.length; i++) {
                        System.out.println("Data Kepegawaian Pegawai Non Tetap [" + i + "]");
                        pegawai.getData();
                        System.out.println();
                        System.out.println("====================================");
                        data.setTahunSekarang(2016);
                        data.setHasil();
                        data.getGaji();
                        pegawai.setLamaKerja();
                        data.setJlhAnak(anak);
                        pegawai.setSumAnak();
                        data.setJlhIstri(istri);
                        pegawai.setSumIstri();
                        System.out.println();
                        B.getLembur();
                        B.setLembur();
                        System.out.println("====================================");
                    }
                    break;
                default:
                    System.out.println("\tTerima Kasih");
            }
        } while (pil >= 1 && pil < 3);
    }
}