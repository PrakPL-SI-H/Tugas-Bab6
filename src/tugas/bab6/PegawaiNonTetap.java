package PrakPemlan;

import java.util.Scanner;

public class PegawaiNonTetap extends Employee1 {

    public int lembur;
    Scanner in = new Scanner(System.in);

    public void getLembur() {
        System.out.print("Masukkan tambahan jam kerja normal : ");
        lembur = in.nextInt();
    }

    public void setLembur() {
        if (lembur > 10) {
            int c = lembur - 10;
            int d = 10000 * c;
            System.out.println("Jumlah penghasilan dan lembur : " + d);
        } else {
            System.out.println("Tidak akan mendapatkan gaji lembur");
        }
    }
}