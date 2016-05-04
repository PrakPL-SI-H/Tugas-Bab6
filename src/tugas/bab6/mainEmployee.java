//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package tugasemployee;

import java.util.Scanner;

public class mainEmployee {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tahun_masuk = 0, jumlah_anak = 0, pilih;
        String nama = "", id = "", jabatan = "", istri = "", anak = "";

        do {
            System.out.println("");
            System.out.println("===EMPLOYEE FELIX===");
            System.out.println("===MENU===");
            System.out.println("1. Masukkan data pekerja");
            System.out.println("2. Mencetak data gaji pekerja");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilih = in.nextInt();
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama : ");
                    nama = in.next();
                    System.out.print("Masukkan ID kerja : ");
                    id = in.next();
                    System.out.println("Jenis jabatan : Manager, "
                            + "PegawaiTetap, PegawaiTidakTetap / nonPNS");
                    System.out.print("Masukkan jabatan : ");
                    jabatan = in.next();
                    System.out.print("Masukkan tahun masuk : ");
                    tahun_masuk = in.nextInt();
                    System.out.print("Punya istri?(y/n) : ");
                    istri = in.next();
                    System.out.print("Punya anak?(y/n) : ");
                    anak = in.next();
                    if (anak.equalsIgnoreCase("Y")) {
                        System.out.print("Masukkan jumlah anak : ");
                        jumlah_anak = in.nextInt();
                    }
                    break;
                case 2:
                    if (jabatan.equalsIgnoreCase("nonpns") || jabatan.equalsIgnoreCase("PegawaiTidakTetap")) {
                        System.out.println("====DATA GAJI PEGAWAI====");
                        PegawaiTidakTetap pegawai = new PegawaiTidakTetap(nama, id, jabatan, istri, anak, tahun_masuk, jumlah_anak);
                        System.out.println("Nama \t\t\t: " + nama);
                        System.out.println("ID Kerja \t\t: " + id);
                        System.out.println("Jabatan \t\t: " + jabatan);
                        pegawai.hitung(tahun_masuk);
                        System.out.println("Gaji \t\t\t: " + pegawai.gaji);
                        System.out.println("Gaji Lembur \t\t: " + pegawai.lembur());
                        System.out.println("Total \t\t: " + pegawai.total());
                    } else if (jabatan.equalsIgnoreCase("manager")) {
                        System.out.println("====DATA GAJI PEGAWAI====");
                        Manager pegawai = new Manager(nama, id, jabatan, istri, anak, tahun_masuk, jumlah_anak);
                        System.out.println("Nama \t\t\t: " + nama);
                        System.out.println("ID Kerja \t\t: " + id);
                        System.out.println("Jabatan \t\t: " + jabatan);
                        pegawai.hitung(tahun_masuk);
                        System.out.println("Gaji \t\t\t: " + pegawai.gaji);
                        System.out.println("Bonus \t\t\t: " + pegawai.bonus);
                        System.out.println("Tunjangan \t\t: " + pegawai.getTunjangan());
                        System.out.println("Tunjangan Jabatan \t: " + pegawai.getTunjanganJabatan());
                        System.out.println("Total Gaji \t\t: " + pegawai.total());
                    } else if (jabatan.equalsIgnoreCase("Pegawaitetap")) {
                        System.out.println("====DATA GAJI PEGAWAI====");
                        PegawaiTetap pegawai = new PegawaiTetap(nama, id, jabatan, istri, anak, tahun_masuk, jumlah_anak);
                        System.out.println("Nama \t\t\t: " + nama);
                        System.out.println("ID Kerja \t\t: " + id);
                        System.out.println("Jabatan \t\t: " + jabatan);
                        pegawai.hitung(tahun_masuk);
                        System.out.println("Gaji \t\t\t: " + pegawai.gaji);
                        System.out.println("Bonus \t\t\t: " + pegawai.bonus);
                        System.out.println("Tunjangan \t\t: " + pegawai.getTunjangan());
                        System.out.println("Total Gaji \t\t: " + pegawai.total());
                    }
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Maaf pilihan anda tidak tersedia");
                    break;
            }
        } while (pilih != 0);
    }
}
