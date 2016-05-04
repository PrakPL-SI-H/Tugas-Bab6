package inheritance;
import inharitance.PegawaiTetap;
import java.util.Scanner;
public class MainEmployee {
    public static void main(String[] args) {
        int a = 0;
        Scanner in = new Scanner(System.in);
        System.out.println(" =====================DATABASE KARYAWAN===================== ");
        System.out.println();
        System.out.println("Masukan Data Anda");
        System.out.print("Nama Anda                 : ");
        String n = in.nextLine();
        System.out.print("Nomor ID Anda             : ");
        int i = in.nextInt();
        System.out.print("Jabatan Anda              : ");
        String jabatan = in.nextLine();
        String j = in.nextLine();
        System.out.print("Masa Kerja (dalam tahun)  : ");
        int t = in.nextInt();
        System.out.print("Status Anda               : ");
        String status = in.nextLine();
        String x = in.nextLine();
        if (x.equals("Menikah")) {
            System.out.print("Jumlah Anak Anda      : ");
            int b = in.nextInt();
            Employee.setAnak(b);
        } else {
            Employee.setAnak(0);
        }
        if (j.equals("Pegawai Tetap")) {
            PegawaiTetap ab = new PegawaiTetap(n, i, 3, t, x, a);
            System.out.println();
            System.out.println("============================================");
            System.out.println("                Data Karyawan               ");
            System.out.println("============================================");
            System.out.println("Nama                      : " + n);
            System.out.println("Nomor ID                  : " + i);
            System.out.println("Jabatan                   : " + j);
            System.out.println("Total gaji anda bulan ini : " + ab.getSalary() + " juta");
            System.out.println();
        } else if (j.equals("Pegawai Tidak Tetap")) {
            System.out.println();
            System.out.println("============================================");
            System.out.println("                Data Karyawan               ");
            System.out.println("============================================");
            System.out.print("Lama Lembur dalam jam : ");
            int lembur = in.nextInt();
            PegawaiTakTetap ac = new PegawaiTakTetap(n, i, 3, t, x, a);
            System.out.println("Nama                      : " + n);
            System.out.println("Nomor ID                  : " + i);
            System.out.println("Jabatan                   : " + j);
            System.out.println("Total gaji anda bulan ini : " + ac.getSalary() + " juta");
            System.out.println();
        } else if (j.equals("Manager")) {
            System.out.println();
            System.out.println("============================================");
            System.out.println("                Data Karyawan               ");
            System.out.println("============================================");
            Manager ad = new Manager(n, i, 7, t, x, a);
            System.out.println("Nama                      : " + n);
            System.out.println("Nomor ID                  : " + i);
            System.out.println("Jabatan                   : " + j);
            System.out.println("Total gaji anda bulan ini : " + ad.getSalary() + " juta");
            System.out.println();
        }
    }
}
