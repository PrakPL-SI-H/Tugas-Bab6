
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

}


