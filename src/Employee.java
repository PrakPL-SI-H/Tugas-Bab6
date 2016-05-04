package inheritance;
import java.util.Scanner;
public class Employee {
    Scanner input=new Scanner(System.in);
    public String nama, idkerja, jabatan;
    public double bonus, tunjangan, tunjangan2, tunjangan3, total;
    public int jumistri, jumanak, taunkerja, lamakerja;
    public final double gajipokok = 5000000;
    public void gaji() {
        lamakerja = 2016 - taunkerja;
        if (lamakerja < 5) {
            this.bonus = 0;
            this.tunjangan = 0;
        } else if (lamakerja > 5 && lamakerja < 11) {
            bonus = 0.05 * gajipokok;
            this.tunjangan = 0;
        } else if (lamakerja > 10) {
            bonus = 0.1 * gajipokok;
            tunjangan = 0.1 * gajipokok;
        }
        total = gajipokok + tunjangan + bonus;        
        if (jumistri >= 1) {
            tunjangan2 = 0.1 * total;
            total = total + tunjangan2;
        } else if (jumistri == 0) {
            tunjangan2 = 0;
        }
        if (jumanak != 0) {
            if (jumanak >= 3) {
                tunjangan3 = total * 0.15 * 3;
                total = total + tunjangan3;
            } else {
                tunjangan3 = jumanak * 0.15 * total;
                total = total + tunjangan3;
            }
        }
    }
    public void masukan(){
    System.out.print("Masukkan Nama = ");
        nama = input.next();
        System.out.print("Masukkan ID = ");
        idkerja = input.next();
        System.out.print("Masukkan Jabatan = ");
        jabatan = input.next();
        System.out.print("Masukkan Jumlah Istri (Jika Belum punya masukkan 0) = ");
        jumistri = input.nextInt();
        System.out.print("Masukkan Jumlah Anak (Jika Belum punya masukkan 0 ) = ");
        jumanak = input.nextInt();
        System.out.print("Masukkan Tahun Kerja = ");
        taunkerja = input.nextInt();    
        System.out.println();
    }
    public void keluaran (){
        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
        System.out.println("Nama = " + nama);
        System.out.println("ID = " + idkerja);
        System.out.println("Jabatan = " + jabatan);
        System.out.println("Jumlah Istri = " + jumistri);
        System.out.println("Jumlah Anak = " + jumanak);
        System.out.println("Tahun Kerja = " + taunkerja);
        System.out.println("Gaji Anda adalah = " + total);
        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
        System.out.println();
    }
}