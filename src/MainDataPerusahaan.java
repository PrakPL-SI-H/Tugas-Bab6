package laporaninherit;

/**
 *
 * @author Istighfarin Bahtiar Amry
 * @NIM 155150401111129
 * @KElas SI-H
 */
import java.util.Scanner;

public class MainDataPerusahaan {

    public String daftar = "\n| ID Kerja\t| Nama Pegawai\t\t"+ "|Jabatan\t\t"+ "| Gaji Pokok\t\t|Gaji Total     |\n"+ "|=======================================================================================================|\n";
    int gman = 5000000, pegt = 4000000, pegtt = 2000000;

    public static void main(String[] args) {
        MainDataPerusahaan go = new MainDataPerusahaan();
        go.showTime();
        /*Default gaji pegawai:
         1.Manager               Rp.5000.000,00
         2.PegawaiTetap          Rp.4000.000,00
         3.PegawaiTidakTetap     Rp.2000.000,00
         */

    }

    public void showTime() {
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\t=================PT.BafarCorp Hi-Tech================");
        System.out.println("\t\t\t    ===========GAJI PEGAWAI PT.BafarCorp===========");
        System.out.println("");
        System.out.print("Jumlah Data Yang Ingin Dimasukan : ");
        int ndata = in.nextInt();
        System.out.println();
        for (int i = 0; i < ndata; i++) {
            System.out.println("\t==============DATA KE-" + (i + 1)+"==============");
            System.out.print("ID Kerja                             : ");
            String id = in.next();
            System.out.print("Nama Pegawai                         : ");
            String name = in.next();
            System.out.print("Jabatan                              : ");
            String jab = in.next();
            System.out.print("Lama Sudah Bekerja(Tahun)            : ");
            int thn = in.nextInt();
            System.out.print("Lama Jam Kerja                       : ");
            int jam = in.nextInt();
            System.out.print("Status Pernikahan(cerai/kawin/belum) : ");
            String status = in.next();
            System.out.print("Jumlah Anak                          : ");
            int anak = in.nextInt();
            //seleksi kondisi sesuai dengan jabatannya:
            if ("Manager".equals(jab)) {
                Manager go = new Manager(name, jab, id, status, anak, thn);
                go.setBonus(thn, status, anak);
                daftar += "| " + go.getId() + "\t\t|" + go.getNama()+ "\t\t| " + go.getJab() + "\t\t| Rp." + gman+ "\t\t| Rp." + go.getGaji() + "\t|\n";
            } else if ("PegawaiTidakTetap".equals(jab)) {
                PegawaiTidakTetap go = new PegawaiTidakTetap(name,
                        jab, id, status, anak, thn);
                go.setBonus(jam);
                daftar += "| " + go.getId() + "\t\t|" + go.getNama()+ "\t\t| " + go.getJab() + "\t| Rp."+ pegtt + "\t\t| Rp." + go.getGaji() + "\t|\n";
            } else if ("PegawaiTetap".equals(jab)) {
                PegawaiTetap go = new PegawaiTetap(name,
                        jab, id, status, anak, thn);
                go.setBonus(thn, status, anak);
                daftar += "| " + go.getId() + "\t\t|" + go.getNama()+ "\t\t| " + go.getJab() + "\t\t| Rp."+ pegt + "\t\t| Rp." + go.getGaji() + "\t|\n";
            }
        }
        System.out.println("");
        System.out.println("\t\t\t===============DAFTAR TAMBAHAN DATA BARU===============");
        System.out.println("\t\t\t    ===========GAJI PEGAWAI PT.BafarCorp===========");
        System.out.println(daftar);
        System.out.println("|=======================================================================================================|");

    }
}
