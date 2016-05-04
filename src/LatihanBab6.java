public class Employee {

    
public String idkerja, nama, jabatan, status;
public int thnmasuk, lamajam, anak;
public static double gj;
public Employee(String idker, String nama, String jabatan, String status, int tahunmasuk, int lamajam, int anak) {
this.idkerja = idker;
this.nama = nama;
this.jabatan = jabatan;
this.status = status;
this.thnmasuk = tahunmasuk;
this.lamajam = lamajam;
this.anak = anak;
}

    }

//========================================================================================================================
class PegawaiTetap extends Employee {

    public PegawaiTetap(String idker, String nama, String jabatan, String status, int tahunmasuk, int lamajam, int anak) {
        super(idker, nama, jabatan, status, tahunmasuk, lamajam, anak);
        gj = 300000;
    }

    public void setBonus(int tahun, String status, int anak) {
        if (tahun > 10) {
            gj += (thnmasuk * 0.1) + (thnmasuk * 0.1);
        } else if (tahun < 11 && tahun > 5) {
            gj += (thnmasuk * 0.05);
        } else {
            gj += 0;
        }
        if (status.equalsIgnoreCase("kawin") && anak == 0) {
            gj += (0.1 * ((gj + thnmasuk) + (thnmasuk * 0.1)));
        } else if (status.equalsIgnoreCase("kawin") && anak < 4) {
            gj += ((0.15 * (gj + thnmasuk + (thnmasuk * 0.1))) * anak) + (0.1 * ((gj + thnmasuk) + (thnmasuk * 0.1)));
        } else if (status.equalsIgnoreCase("kawin") && anak > 3) {
            gj += ((0.15 * (gj + thnmasuk + (thnmasuk * 0.1))) * 3) + (0.1 * ((gj + thnmasuk) + (thnmasuk * 0.1)));
        } else if (status.equalsIgnoreCase("single") && anak < 4) {
            gj += ((0.15 * (gj + thnmasuk + (thnmasuk * 0.1))) * anak);
        } else if (status.equalsIgnoreCase("single") && anak > 3) {
            gj += ((0.15 * (gj + thnmasuk + (thnmasuk * 0.1))) * 3);
        } else {
            gj += 0;
        }
    }

    public void totGaj() {
        System.out.println("Total gaji : " + gj);
    }

}
//=====================================================================================================================================================
 