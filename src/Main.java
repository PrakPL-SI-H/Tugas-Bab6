package PrakBab6;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> nm = new ArrayList<String>();
        ArrayList<String> jab = new ArrayList<String>();
        ArrayList<Integer> gaji = new ArrayList<Integer>();
        Scanner puta = new Scanner(System.in);

        System.out.println("        GAJI PEGAWAI TAHUN 2016\n"
                + "-----------------------------------------------");

        ArrayList datagaji = new ArrayList();

        int in = 1;
        int p = 0;
        while (in != 0) {

            System.out.print("Nama      = ");
            String n = puta.next();
            nm.add(n);
            System.out.print("ID Kerja  = ");
            String i = puta.next();
            System.out.print("Jabatan   = ");
            String j = puta.next();
            jab.add(j);
            System.out.print("Tahun masuk kerja = ");
            int t = puta.nextInt();

            if (j.equalsIgnoreCase("manager") || j.equalsIgnoreCase("pns")) {
                System.out.print("Apakah anda punya istri? (ya/tidak) = ");
                String is = puta.next();

                if (j.equalsIgnoreCase("manager")) {
                    Manager man = new Manager(n, i, j, is, t);
                    gaji.add(man.salaryManager());nm.add(n);
                    System.out.println("Gaji anda = Rp." + man.salaryManager());
                } else {
                    PegawaiTetap pns = new PegawaiTetap(n, i, j, is, t);
                    gaji.add(pns.salaryPNS());
                    System.out.println("Gaji anda = Rp." + pns.salaryPNS());
                }
            } else {
                PegawaiTidakTetap non = new PegawaiTidakTetap(n, i, j, "tidak", t);

                System.out.print("Jam kerja = ");
                int w = puta.nextInt();
                gaji.add(non.salaryNonPNS(w));
                System.out.println("Gaji anda = Rp." + non.salaryNonPNS(w));
            }
            p++;

            System.out.print("Tekan 0 untuk berhenti, dan 1 untuk kembali mengisi data ");
            in = puta.nextInt();
            System.out.println("-----------------------------------------------");
        }
        System.out.println("\n      Data Gaji Tahun 2016\n"
                + "===============================================");
        System.out.printf("%s %15s %15s\n", "NAMA", "JABATAN", "GAJI");
        System.out.println("-----------------------------------------------");
        for (int a = 0; a < nm.size(); a++) {
            System.out.printf("%s %15s %17s, %d\n", nm.get(a), jab.get(a),"Rp.", gaji.get(a));
        }
        System.out.println("===============================================");
    }
}
