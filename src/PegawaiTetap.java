
package laporaninherit;
/**
 *
 * @author Istighfarin Bahtiar Amry
 * @NIM    155150401111129
 * @KElas  SI-H
 */
public class PegawaiTetap extends Employee {

    public PegawaiTetap(String nama, String jab, String id, String status, int anak, int thn) {
        super(nama, jab, id, status, anak, thn);
        gaji = 4000000; //gaji default PegawaiTetap=4000000
    }
//penentu jumlah bonus berupa tahun,status,anak
    public void setBonus(int thn, String status, int anak) {
        if(thn<5){
            gaji=4000000;
        }
        else if (thn >=6 && thn <= 10) {
            gaji += (gaji * (0.05 / 100));
        } else {
            gaji += (gaji * (0.1 / 100)) + (gaji * (0.1 / 100));
        }
        if ("kawin".equals(status) && anak == 0) {
            gaji += (gaji * (0.1 / 100));
        } else if ("kawin".equals(status) && anak < 4) {
            gaji += (gaji * (0.1 / 100)) + ((gaji * (0.15 / 100)) * anak);
        } else if ("kawin".equals(status) && anak > 3) {
            gaji += (gaji * (0.1 / 100)) + ((gaji * (0.15 / 100)) * 3);
        } else if ("cerai".equals(status) && anak < 4) {
            gaji += ((gaji * (0.15 / 100)) * anak);
        } else if ("cerai".equals(status) && anak > 3) {
            gaji += ((gaji * (0.15 / 100)) * 3);
        } else {
            gaji += 0;
        }
    }
}


