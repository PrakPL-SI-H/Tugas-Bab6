package tugas.bab6;

import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Manager man = new Manager();
        PegawaiTetap pt = new PegawaiTetap();
        PegawaiTidakTetap tt = new PegawaiTidakTetap();
        int jab = 0;
        while (true) {
            System.out.println("========== >> Data Karyawan PT. AFN << ==========\n");
            System.out.println("1. Isi Data\n"+"2. Cetak Data\n"+"3. Keluar\n");
            System.out.print("Masukkan pilihan: ");
            int pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("Jabatan");
                    System.out.println("1. Manager\n"+"2. Pegawai Tetap\n"+"3. Pegawai Tidak Tetap\n");
                    System.out.println("Masukkan jabatan : ");
                    jab = in.nextInt();
                    in.nextLine();
                    switch (jab) {
                        case 1:
                            man.getJab(jab);
                            System.out.print("Masukkan nama\t\t: ");
                            man.nama = in.nextLine();
                            System.out.print("Masukkan ID Kerja\t: ");
                            man.id = in.nextLine();
                            System.out.print("Masukkan tahun kerja\t: ");
                            man.masaKerja(in.nextInt());
                            man.gajiSementara();
                            man.TunjanganJabatan();
                            System.out.print("Status istri? [y/n]\t: ");
                            man.setIstri(in.next());
                            System.out.print("Jumlah anak\t\t: ");
                            man.setAnak(in.nextInt());
                            man.gajiTotal();
                            System.out.println();
                            break;
                        case 2:
                            pt.getJab(jab);
                            System.out.print("Masukkan nama\t\t: ");
                            pt.nama = in.nextLine();
                            System.out.print("Masukkan ID Kerja\t: ");
                            pt.id = in.nextLine();
                            System.out.print("Masukkan tahun kerja\t: ");
                            pt.masaKerja(in.nextInt());
                            pt.gajiSementara();
                            System.out.print("Status istri? [y/n]\t: ");
                            pt.setIstri(in.next());
                            System.out.print("Jumlah anak\t\t: ");
                            pt.setAnak(in.nextInt());
                            pt.gajiTotal();
                            System.out.println();
                            break;
                        case 3:
                            tt.getJab(jab);
                            System.out.print("Masukkan nama\t\t: ");
                            tt.nama = in.nextLine();
                            System.out.print("Masukkan ID Kerja\t: ");
                            tt.id = in.nextLine();
                            tt.gajiSementara();
                            tt.gajiTotal();
                            System.out.print("Masukkan jam lembur\t: ");
                            tt.GajiLembur(in.nextInt());
                            break;
                    }
                    break;
                case 2:
                    if (jab == 1) {
                        man.Cetak();
                    } else if (jab == 2) {
                        pt.Cetak();
                    } else if (jab == 3) {
                        tt.Cetak();
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Masukkan anda salah");
            }
        }
    }
}
