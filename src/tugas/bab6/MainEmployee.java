package mainemployee;

import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        int a = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Masukkan Data Anda");
        System.out.print("Nama          : ");
        String nama = in.nextLine();
        System.out.print("Nomor ID      : ");
        int id = in.nextInt();
        System.out.print("Jabatan       : ");
        String jabatan = in.nextLine();
        String j = in.nextLine();
        System.out.print("Masa Kerja    : ");
        int t = in.nextInt();
        System.out.print("Status        : ");
        String status = in.nextLine();
        String x = in.nextLine();       
        if (x.equals("Menikah")) {
            System.out.print("Jumlah Anak   : ");
            int b = in.nextInt();
            Employee.setAnak(b);
        } else {
            Employee.setAnak(0);
        }
        if (j.equals("Pegawai Tetap")) {
            pegawaiTetap pt = new pegawaiTetap(nama, id, 3, t, x, a);
            System.out.println("=================================");
            System.out.println("Nama                    : " + nama);
            System.out.println("Nomor ID                : " + id);
            System.out.println("Jabatan                 : " + j);
            System.out.println("Total Gaji Anda /bulan  : " + pt.getSalary() + " Juta");
            System.out.println();
        } else if (j.equals("Pegawai Tidak Tetap")) {
            System.out.print("Lama Lembur dalam jam : ");
            int lembur = in.nextInt();
            pegawaiTidakTetap ptt = new pegawaiTidakTetap(nama, id, 3, t, x, a);
            System.out.println("=================================");
            System.out.println("Nama                    : " + nama);
            System.out.println("Nama                    : " + nama);
            System.out.println("Nomor ID                : " + id);
            System.out.println("Jabatan                 : " + j);
            System.out.println("Total Gaji Anda / bulan : " + ptt.getSalary() + " Juta");
            System.out.println();
        } else if (j.equals("Manager")) {
            Manager m = new Manager(nama, id, 7, t, x, a);
            System.out.println("=================================");
            System.out.println("Nama                    : " + nama);
            System.out.println("Nomor ID                : " + id);
            System.out.println("Jabatan                 : " + j);
            System.out.println("Total Gaji Anda / bulan : " + m.getSalary() + " Juta");
            System.out.println();
        }
    }

}
