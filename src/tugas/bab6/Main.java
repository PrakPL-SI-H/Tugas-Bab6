package Bab6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===== PT. BRAWIJAYA =====");
        System.out.println("-------------------------");
        in.nextLine();
        System.out.print("Masukkan Nama     : ");
        String nama = in.nextLine();
        System.out.print("Masukkan ID Kerja : ");
        int id = in.nextInt();
        in.nextLine();
        System.out.print("Masukkan Jabatan  : ");
        String jabatan = in.nextLine();
        System.out.print("Masukkan tahun masuk kerja : ");
        int tahunmasuk = in.nextInt();
        in.nextLine();
        System.out.print("Masukkan status (Menikah/Belum Menikah) : ");
        String status = in.nextLine();
        int anak;
        if (status.equalsIgnoreCase("Menikah")) {
            System.out.print("Jumlah Anak Anda : ");
            anak = in.nextInt();
        } else {
            anak=0;
        }
        if (jabatan.equalsIgnoreCase("Pegawai Tetap")) {
            PegawaiTetap staff1 = new PegawaiTetap(nama, id, jabatan, tahunmasuk, 35000000, status, anak);
            System.out.println("Nama      : " + staff1.getNama() );
            System.out.println("ID Kerja  : " + staff1.getStatus());
            System.out.println("Jabatan   : " + staff1.jabatan);
            System.out.printf("Total gaji : Rp % .2f ", staff1.getSalary()); 
            System.out.println();
        } else if (jabatan.equalsIgnoreCase("Pegawai Tidak Tetap")) {
            System.out.print("Lama Lembur (dalam jam) : ");
            double lembur = in.nextDouble();
            PegawaiTidakTetap staff2 = new PegawaiTidakTetap(nama, id, jabatan, tahunmasuk, 35000000, status, anak, lembur);
            System.out.println("Nama      : " + staff2.getNama() );
            System.out.println("ID Kerja  : " + staff2.getStatus());
            System.out.println("Jabatan   : " + staff2.jabatan);
            System.out.printf("Total gaji : Rp % .2f ", staff2.getSalary());
            System.out.println();
        } else if (jabatan.equalsIgnoreCase("Manager")) {
            Manager staff3 = new Manager(nama, id, jabatan, tahunmasuk, 35000000, status, anak);
            System.out.println("Nama      : " + staff3.getNama() );
            System.out.println("ID Kerja  : " + staff3.getStatus());
            System.out.println("Jabatan   : " + staff3.jabatan);
            System.out.printf("Total gaji : Rp % .2f ", staff3.getSalary()); 
            System.out.println();
        }

    }
}

