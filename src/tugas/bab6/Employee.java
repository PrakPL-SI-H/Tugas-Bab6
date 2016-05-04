
package maingaji;

import java.util.Calendar;


class Employee {
      private String name, idKerja, jabatan, istri, anak;

    Calendar cal = Calendar.getInstance();
    int jmlanak, thnkerja;
    double tunjangan, tunjangananak, tunjanganistri, tunjanganmasa, bonus, gaji;

    public Employee(String name, String id, String jabatan, String istri, String anak, int thnkerja, double gaji, int jmlanak) {
        this.name = name;
        this.idKerja = id;
        this.jabatan = jabatan;
        this.istri = istri;
        this.anak = anak;
        this.thnkerja = thnkerja;
        this.gaji = gaji;
        this.jmlanak = jmlanak;

    }

    public int lamaKerja() {
        int year = cal.get(Calendar.YEAR);
        return year - thnkerja;
    }

    public String getID() {
        return idKerja;
    }

    public void tunjanganDanBonus(int thnkerja) {
        if (lamaKerja() <= 5) {
            bonus = 0;
            tunjanganmasa = 0;
            if (istri.equalsIgnoreCase("Ya")) {
                tunjanganistri = 0.1 * gaji;

            }
            if (anak.equalsIgnoreCase("Ya")) {
                if (jmlanak > 3) {
                    tunjangananak = ((0.15 * 3) * gaji);
                } else {
                    tunjangananak = ((0.15 * jmlanak) * gaji);
                }
            }
        }

        if (lamaKerja() >= 6 && lamaKerja() <= 10) {
            bonus = (lamaKerja() * 0.05 * gaji);
            tunjanganmasa = 0;
            if (istri.equalsIgnoreCase("Ya")) {
                tunjanganistri = 0.1 * gaji;
            }
            if (anak.equalsIgnoreCase("Ya")) {
                if (jmlanak > 3) {
                    tunjangananak = ((0.15 * 3) * gaji);
                } else {
                    tunjangananak = ((0.15 * jmlanak) * gaji);
                }
            }
        }

        if (lamaKerja() > 10) {
            bonus = ((lamaKerja() * 0.01) * gaji);
            tunjanganmasa = ((lamaKerja() * 0.01) * gaji);
            if (istri.equalsIgnoreCase("Ya")) {
                tunjanganistri = 0.1 * gaji;
            }
            if (anak.equalsIgnoreCase("Ya")) {
                if (jmlanak > 3) {
                    tunjangananak = ((0.15 * 3) * gaji);
                } else {
                    tunjangananak = ((0.15 * jmlanak) * gaji);
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public double getTunjangan() {
        return tunjangan = tunjangananak + tunjanganistri + tunjanganmasa;
    }

    public double getBonus() {
        return bonus;
    }

    public double getGaji() {
        return gaji + bonus + tunjangan;
    }

}
