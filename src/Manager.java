
package laporaninherit;
/**
 *
 * @author Istighfarin Bahtiar Amry
 * @NIM    155150401111129
 * @KElas  SI-H
 */
public class Manager extends Employee {

    public Manager(String nama, String jabatan, String id,String status, int anak, int thn) {
        super(nama, jabatan, id, status, anak, thn);
        gaji = 5000000; //gaji default manager =5000000
    }
//penentu jumlah bonus merupakan tahun,status,dan anak
//logika if else untuk menggolongkan jumlah gaji
    public void setBonus(int thn, String status, int anak) {
        if(thn<5){
            gaji=5000000;
        }
        else if (thn >=6 && thn<= 10) {
            gaji += (gaji * (0.05 / 100));
        } else {
            gaji += (gaji * (0.1 / 100)) + (gaji * (0.1 / 100));
        }
        if ("kawin".equals(status) && anak == 0) {
            gaji += (gaji * (0.1 / 100)) + (gaji * (0.1 / 100));
        } else if ("kawin".equals(status) && anak < 4) {
            gaji += (gaji * (0.1 / 100)) + ((gaji * (0.15 / 100)) * anak) + (gaji * (0.1
                    / 100));
        } else if ("kawin".equals(status) && anak > 3) {
            gaji += (gaji * (0.1 / 100)) + ((gaji * (0.15 / 100)) * 3) + (gaji * (0.1 / 100));
        } else if ("cerai".equals(status) && anak < 4) {
            gaji += ((gaji * (0.15 / 100)) * anak) + (gaji * (0.1 / 100));
        } else if ("cerai".equals(status) && anak > 3) {
            gaji += ((gaji * (0.15 / 100)) * 3) + (gaji * (0.1 / 100));
        } else {
            gaji += (gaji * (0.1 / 100));
        }
    }
}


