
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
}


