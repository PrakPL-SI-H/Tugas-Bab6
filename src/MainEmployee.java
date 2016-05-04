
import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, idKerja, istri;
        int pjab, anak, tahun;

        for (int i = 1; i <= 16; i++) {
            System.out.printf("Data Employee %d : \n", i);
            System.out.print("Nama: ");
            nama = in.next();
            System.out.print("ID: ");
            idKerja = in.next();
            System.out.print("Jabatan " + "\n 1. Manager" + "\n 2. Pegawai Tetap" + "\n 3. Magang\n");
            System.out.print("Jabatan : ");
            pjab = in.nextInt();
            System.out.print("Mempunyai istri (y/t): ");
            istri = in.next();
            System.out.print("Jumlah anak: ");
            anak = in.nextInt();
            System.out.print("Tahun masuk kerja: ");
            tahun = in.nextInt();
            switch (pjab) {
                case 1:
                    Manager m = new Manager(nama, idKerja, "Manager", istri, anak, tahun);
                    m.setGaji();
                    m.setTunjJab();
                    m.showData();
                    break;
                case 2:
                    PegawaiTetap t = new PegawaiTetap(nama, idKerja, "Pegawai Tetap", istri, anak, tahun);
                    t.setGaji();
                    t.showData();
                    break;
                case 3:
                    Magang g = new Magang(nama, idKerja, "Magang", istri, anak, tahun);
                    System.out.print("Lama jam kerja: ");
                    g.jam = in.nextInt();
                    g.setGaji();
                    g.showData();
                    break;
            }
        }
    }
}
