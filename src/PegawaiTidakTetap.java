
package laporaninherit;

/**
 *
 * @author Istighfarin Bahtiar Amry
 * @NIM 155150401111129
 * @KElas SI-H
 */
public class PegawaiTidakTetap extends Employee {

    public PegawaiTidakTetap(String nama, String jab, String id, String status, int anak, int thn) {
        super(nama, jab, id, status, anak, thn);
        gaji = 2000000;//gaji default pegawai tidak tetap=2000000
    }

    }

