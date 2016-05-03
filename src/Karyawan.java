package Laporan6Bab6;

import java.util.Scanner;

public class Karyawan {

    Scanner input = new Scanner(System.in);
    private String nama, jabatan, istri, anak;
    int idKerja, tahunKerja, jmlAnak, masaKerja;
    double gajipokok, bonus, gajiTotal, tunjangan, tunjanganJabatan;

    public Karyawan(String nama, double gajipokok) {
        this.nama = nama;
        this.gajipokok = gajipokok;
    }

    public String getNama() {
        return nama;
    }

    public int getIdKerja() {
        return idKerja;
    }

    public void setIdKerja(int idKerja) {
        this.idKerja = idKerja;
    }

    public String getIstri() {
        return istri;
    }

    public void setIstri(String istri) {
        this.istri = istri;
    }

    public String getAnak() {
        return anak;
    }

    public void setAnak(String anak) {
        this.anak = anak;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void masukan() {
        System.out.print("Masukkan tahun kerja anda : ");
        tahunKerja = input.nextInt();
        masaKerja = 2015 - tahunKerja;
        if (masaKerja <= 5) {
            System.out.print("Apakah anda mempunyai istri? (y/t) ");
            istri = input.next();
            if (istri.equalsIgnoreCase("y")) {
                System.out.print("Apakah anda mempunyai anak? (y/t) ");
                anak = input.next();
                if (anak.equalsIgnoreCase("y")) {
                    System.out.print("Jumlah anak : ");
                    jmlAnak = input.nextInt();
                    if (jmlAnak > 0 && jmlAnak <= 3) {
                        tunjangan = ((0.15 * jmlAnak) * gajipokok) + (0.1 * gajipokok);
                        bonus = 0;
                    } else {
                        jmlAnak = 3;
                        tunjangan = ((0.15 * jmlAnak) * gajipokok) + (0.1 * gajipokok);
                        bonus = 0;
                    }
                } else {
                    tunjangan = (0.1 * gajiTotal);
                    bonus = 0;
                }
            } else {
                tunjangan = 0;
                bonus = 0;
            }

        } else if (masaKerja >= 6 && masaKerja <= 10) {
            System.out.print("Apakah anda mempunyai istri? (y/t) ");
            istri = input.next();
            if (istri.equalsIgnoreCase("y")) {
                System.out.print("Apakah anda mempunyai anak? (y/t) ");
                anak = input.next();
                if (anak.equalsIgnoreCase("y")) {
                    System.out.print("Jumlah anak : ");
                    jmlAnak = input.nextInt();
                    if (jmlAnak > 0 && jmlAnak < 4) {
                        tunjangan = ((0.15 * jmlAnak) * gajipokok) + (0.1 * gajipokok);
                        bonus = 0.05 * gajipokok;
                    } else if (jmlAnak > 3) {
                        jmlAnak = 3;
                        tunjangan = ((0.15 * jmlAnak) * gajipokok) + (0.1 * gajipokok);
                        bonus = 0.05 * gajipokok;
                    } else {
                    }
                } else {
                    tunjangan = (0.1 * gajipokok);
                    bonus = 0.05 * gajipokok;
                }
            } else {
                tunjangan = 0;
                bonus = 0;
            }

        } else if (masaKerja >= 10) {
            System.out.print("Apakah anda mempunyai istri? (y/t) ");
            istri = input.next();
            if (istri.equalsIgnoreCase("y")) {
                System.out.print("Apakah anda mempunyai anak? (y/t) ");
                anak = input.next();
                if (anak.equalsIgnoreCase("y")) {
                    System.out.print("Jumlah anak : ");
                    jmlAnak = input.nextInt();
                    if (jmlAnak > 0 && jmlAnak < 4) {
                        tunjangan = ((0.15 * jmlAnak) * gajipokok) + (0.1 * gajipokok);
                        bonus = 0.1 * gajipokok;
                    } else if (jmlAnak > 3) {
                        jmlAnak = 3;
                        tunjangan = ((0.15 * jmlAnak) * gajipokok) + (0.1 * gajipokok);
                        bonus = 0.1 * gajipokok;
                    } else {
                    }
                } else {
                    tunjangan = (0.1 * gajipokok);
                    tunjanganJabatan = 0.1 * gajipokok;
                    bonus = 0.1 * gajipokok;
                }
            } else {
                tunjangan = 0;
                bonus = 0;
            }

        } else {
        }
    }

    public double gajiTotal() {
        gajiTotal = gajipokok + tunjangan + bonus;
        return gajiTotal;
    }
}