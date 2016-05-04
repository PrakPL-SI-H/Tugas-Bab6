package mainemployee;

import java.io.*;

public class mainEmployee {

    static String data = "     \t\tDATA PEGAWAI 2016    \n" + "\n| ID Kerja\t| Nama Pegawai\t\t| Jabatan\t\t| Gaji\t\t|\n" + "|=================================================================================|\n";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 16; i++) {
            boolean punya = true;
            System.out.println("\nData Pegawai ke " + (i + 1));
            System.out.print("Nama              : ");
            String nama = in.readLine();
            System.out.print("ID Kerja          : ");
            String id = in.readLine();
            System.out.print("Jabatan (Manager/Pegawai Tetap/Pegawai Tidak Tetap): ");
            String jabatan = in.readLine();
            System.out.print("Tahun Masuk Kerja : ");
            int thn = Integer.parseInt(in.readLine());
            System.out.print("Lama Jam Kerja    : ");
            int jam = Integer.parseInt(in.readLine());
            System.out.print("Apakah anda mempunyai istri?{ya/tidak} : ");
            String status = in.readLine();
            if (status.equals("tidak")) {
                punya = false;
            }
            System.out.print("Jumlah Anak       : ");
            int anak = Integer.parseInt(in.readLine());
            if (jabatan.equalsIgnoreCase("Manager")) {
                Manager m = new Manager(nama, id, jabatan, status, anak, thn);
                m.setBonus(thn, status, anak);
                m.displayMessage();
                data += "| " + m.getIdKerja() + "\t\t| " + m.getNama() + "\t\t| " + m.getJabatan() + "\t\t| Rp. " + m.getGaji() + "\t|\n";
            } else if (jabatan.equalsIgnoreCase("Pegawai Tetap")) {
                pegawaiTetap pt = new pegawaiTetap(nama, id, jabatan, status, anak, thn);
                pt.setBonus(thn, status, anak);
                pt.displayMessage();
                data += "| " + pt.getIdKerja() + "\t\t| " + pt.getNama() + "\t\t| " + pt.getJabatan() + "\t\t| Rp. " + pt.getGaji() + "\t|\n";
            } else if (jabatan.equalsIgnoreCase("Pegawai Tidak Tetap")) {
                pegawaiTidakTetap tidak = new pegawaiTidakTetap(nama, id, jabatan, status, anak, thn, jam);
                tidak.setBonus(jam);
                tidak.displayMessage();
                data += "| " + tidak.getIdKerja() + "\t\t| " + tidak.getNama() + "\t\t| " + tidak.getJabatan() + "\t| Rp. " + tidak.getGaji() + "\t|\n";
            }
        }
        System.out.println(data);
    }
}
