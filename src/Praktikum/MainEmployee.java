package Praktikum;

import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        int pilihan, a = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("    DATABASE KARYAWAN PT. NANDA     ");
        String balik = "y";
        while (balik.equalsIgnoreCase("y")) {
            System.out.println("************************************");
            System.out.println("             Pilih Jabatan          ");
            System.out.println("1. Manager");
            System.out.println("2. Pegawai Tetap");
            System.out.println("3. Pegawai Tidak Tetap");
            System.out.println("4. Exit");
            System.out.println("************************************");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("  ");
                    System.out.println("************* Manager **************");
                    System.out.print("Masukkan Nama Anda : ");
                    String n = in.nextLine();
                    n = in.nextLine();
                    System.out.print("Masukkan Nomor ID Anda : ");
                    int i = in.nextInt();
                    System.out.print("Masukkan Jabatan Anda (Manager) : ");
                    String jabatan = in.nextLine();
                    String j = in.nextLine();
                    System.out.print("Masukkan Masa Kerja (dalam tahun) : ");
                    int t = in.nextInt();
                    System.out.print("Masukkan Status Anda : ");
                    String status = in.nextLine();
                    String x = in.nextLine();
                    if (x.equals("Menikah")) {
                        System.out.print("Jumlah Anak Anda : ");
                        int b = in.nextInt();
                        Employee.setAnak(b);
                    } else {
                        Employee.setAnak(0);
                    }
                    if (j.equals("Manager")) {
                        Manager ad = new Manager(n, i, 7, t, x, a);
                        System.out.println("************************************");
                        System.out.println("            Data Pegawai            ");
                        System.out.println("************************************");
                        System.out.println("Nama       : " + n);
                        System.out.println("Nomor ID   : " + i);
                        System.out.println("Jabatan    : " + j);
                        System.out.println("Masa Kerja : " + t + " tahun");
                        System.out.println("Status Anda: " + x);
                        System.out.printf("Total gaji anda bulan ini : %.2f%s", ad.getSalary(), " juta");
                        System.out.println("\n************************************");
                    } else {
                        System.out.println("Pemilihan Menu Jabatan Anda Salah");
                    }
                    break;
                case 2:
                    System.out.println("  ");
                    System.out.println("*********** Pegawai Tetap **********");
                    System.out.print("Masukkan Nama Anda : ");
                    String n1 = in.nextLine();
                    n1 = in.nextLine();
                    System.out.print("Masukkan Nomor ID Anda : ");
                    int i1 = in.nextInt();
                    System.out.print("Masukkan Jabatan Anda (Pegawai Tetap) : ");
                    String jabatan1 = in.nextLine();
                    String j1 = in.nextLine();
                    System.out.print("Masukkan Masa Kerja (dalam tahun) : ");
                    int t1 = in.nextInt();
                    System.out.print("Masukkan Status Anda : ");
                    String status1 = in.nextLine();
                    String x1 = in.nextLine();
                    if (x1.equals("Menikah")) {
                        System.out.print("Jumlah Anak Anda : ");
                        int b = in.nextInt();
                        Employee.setAnak(b);
                    } else {
                        Employee.setAnak(0);
                    }
                    if (j1.equals("Pegawai Tetap")) {
                        PegawaiTetap ab = new PegawaiTetap(n1, i1, 3, t1, x1, a);
                        System.out.println("************************************");
                        System.out.println("            Data Pegawai            ");
                        System.out.println("************************************");
                        System.out.println("Nama       : " + n1);
                        System.out.println("Nomor ID   : " + i1);
                        System.out.println("Jabatan    : " + j1);
                        System.out.println("Masa Kerja : " + t1 + " tahun");
                        System.out.println("Status Anda: " + x1);
                        System.out.printf("Total gaji anda bulan ini : %.2f%s", ab.getSalary(), " juta");
                        System.out.println("\n************************************");
                    } else {
                        System.out.println("Pemilihan Menu Jabatan Anda Salah");
                    }
                    break;
                case 3:
                    System.out.println("  ");
                    System.out.println("******** Pegawai Tidak Tetap *******");
                    System.out.print("Masukkan Nama Anda : ");
                    String n2 = in.nextLine();
                    n2 = in.nextLine();
                    System.out.print("Masukkan Nomor ID Anda : ");
                    int i2 = in.nextInt();
                    System.out.print("Masukkan Jabatan Anda (Pegawai Tidak Tetap) : ");
                    String jabatan2 = in.nextLine();
                    String j2 = in.nextLine();
                    System.out.print("Masukkan Masa Kerja (dalam tahun) : ");
                    int t2 = in.nextInt();
                    System.out.print("Masukkan Status Anda : ");
                    String status2 = in.nextLine();
                    String x2 = in.nextLine();
                    if (x2.equals("Menikah")) {
                        System.out.print("Jumlah Anak Anda : ");
                        int b = in.nextInt();
                        Employee.setAnak(b);
                    } else {
                        Employee.setAnak(0);

                    }
                    if (j2.equals("Pegawai Tidak Tetap")) {
                        System.out.print("Lama Lembur dalam jam : ");
                        int lembur = in.nextInt();
                        PegawaiTidakTetap ac = new PegawaiTidakTetap(n2, i2, 3, t2, x2, a);
                        ac.setLembur(lembur);
                        System.out.println("************************************");
                        System.out.println("            Data Pegawai            ");
                        System.out.println("************************************");
                        System.out.println("Nama       : " + n2);
                        System.out.println("Nomor ID   : " + i2);
                        System.out.println("Jabatan    : " + j2);
                        System.out.println("Masa Kerja : " + t2 + " tahun");
                        System.out.println("Status Anda: " + x2);
                        System.out.printf("Total gaji anda bulan ini : %.2f%s", ac.getSalary(), " juta");
                        System.out.println("\n************************************");
                    } else {
                        System.out.println("Pemilihan Menu Jabatan Anda Salah");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Peringatan !! masukkan pilihan dengan benar ");
                    continue;
            }
            if (pilihan == 4) {
                break;
            } else {
                System.out.println("  ");
                System.out.print("Apakah anda ingin memesan lagi (Y/N) : ");
                balik = in.next();
                System.out.println("  ");
            }
        }
    }
}
