package bab6;

import java.util.Scanner;

public class PegawaiNonTetap extends Employee1 {

    public int lembur;
    Scanner input = new Scanner(System.in);

    public void getLembur() {
        System.out.print("Masukkan Tambahan Jam Kerja Normal :");
        lembur = input.nextInt();
    }

    public void setLembur() {
        if (lembur > 10) {
            int c = lembur - 10;
            int d = 10000 * c;
            System.out.println("Jumlah Penghasilan + Lembur     : " + (int) d);

        } else {
            System.out.println("Tidak akan mendapatkan gaji lembur");
        }
    }
}
