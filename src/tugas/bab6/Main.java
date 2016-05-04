package Bab6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Nama    : ");
        String nama = in.next();
        System.out.print("Masukan ID      : ");
        String id = in.next();

        System.out.println("===============================");
        System.out.println("    1.Pegawai Tetap ");
        System.out.println("    2.Manager   ");
        System.out.println("    3.Pegawai Tidak Tetap");
        System.out.println("===============================");

        System.out.print("Masukan Jabatan : ");
        int jabatan = in.nextInt();

        String marriedStatus = "";
        int countKid = 0;
        int tahunMasuk;

        int jamKerja = 0;

        if (jabatan == 1 || jabatan == 2) {
            System.out.print("Sudah Menikah? (y/t) : ");
            marriedStatus = in.next();
            if (marriedStatus.equalsIgnoreCase("y")) {
                System.out.print("Masukan Jumlah Anak : ");
                countKid = in.nextInt();
            }
        } else {
            System.out.print("Masukan Jam Kerja : ");
            jamKerja = in.nextInt();
        }

        System.out.print("Masukan Tahun Masuk : ");
        tahunMasuk = in.nextInt();

        ArrayList<Employee> employee = new ArrayList();

        if (jabatan == 1) {
            employee.add(new PegawaiTetap(nama, id, "Pegawai Tetap", marriedStatus, countKid, tahunMasuk));
            employee.get(0).setSalary(1000000);
        } else if (jabatan == 2) {
            employee.add(new Manager(nama, id, "Manager", marriedStatus, countKid, tahunMasuk));
            employee.get(0).setSalary(1000000);
        } else if (jabatan == 3) {
            employee.add(new PegawaiTidakTetap(nama, id, "Pegawai tidak tetap", jamKerja, tahunMasuk));
            employee.get(0).setSalary(1000000);
        }

        for (Employee x : employee) {
            System.out.println("Gaji  : " + x.getSalary());
        }
    }
}
