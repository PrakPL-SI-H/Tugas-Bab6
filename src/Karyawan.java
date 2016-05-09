package Laporan6Bab6;

import java.util.Scanner;

public class Karyawan {

    protected String nama, idKerja, jabatan, pn;
    protected int tahunKerja, lamaKerja, gaji = 3750000, anak, istri;
    protected double totalGaji, gajiPenuh, tunjangan, bonus;

    public Karyawan(String nama, String idKerja, String jabatan, int istri, int anak) {
        this.nama = nama;
        this.idKerja = idKerja;
        this.jabatan = jabatan;
        this.istri = istri;
        this.anak = anak;
    }

    public void setTunjangan(int tahunKerja) {
        lamaKerja = 2016 - tahunKerja;
        if (lamaKerja > 10) {
            tunjangan = (0.1 * lamaKerja * gaji);
        } else {
            tunjangan = 0;
        }
    }

    public void setBonus(int tahunKerja) {
        lamaKerja = 2016 - tahunKerja;
        if (lamaKerja > 10) {
            bonus = (0.1 * lamaKerja * gaji);
        } else if (lamaKerja > 5) {
            bonus = (0.05 * lamaKerja * gaji);
        } else {
            bonus = 0;
        }
    }

    public void setTotalGaji() {
        totalGaji = gaji + tunjangan + bonus;
    }

    public String toString() {
        return String.format("Nama            : %-20s\nID Kerja        : %-20s\nJabatan         : %-20s\nGaji Pokok      : Rp. %16s\n", nama, idKerja, jabatan, (long) totalGaji);
    }
}