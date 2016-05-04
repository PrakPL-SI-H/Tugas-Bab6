import java.util.Scanner;
public class MainEmployee {
    private static int jmlanak;
    public static void main(String[] args) {
        boolean cekjab = false;
        int menu;
        MainEmployee employee = new MainEmployee();
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        String nama, jabatan, idkerja, anak, istri;
        int tahun, anak2 = 0;
        boolean anak1, istri1;
        do { System.out.println("===============================");
            System.out.println(" Program Employee ");
System.out.println("===============================");
            System.out.println("1. Cek Gaji");
            System.out.println("2. Keluar "); System.out.println("===============================");
            System.out.print("Masukkan Pilihan Anda : ");
            menu = input.nextInt();
            if (menu == 1) {
                System.out.print("Masukkan Nama : ");
                nama = input.next();
                do {
                    System.out.print("Masukkan Jabatan : ");
                    jabatan = input1.nextLine();
                    String[] jabatan1 = {"Manager", "Pegawai tetap", "Pegawai Tidak Tetap"};
                    for (int i = 0; i < jabatan1.length; i++) {
                    if(jabatan.equalsIgnoreCase(jabatan1[i])) {
                            cekjab = true;
                            break;
                        }
                    }
                    if (cekjab == false) {
                        System.out.println("Jabatan yang Anda masukkan tidak sesuai");
                        System.out.println("Jabatan yang ada : Manager, Pegawai Tetap, Pegawai Tidak Tetap");
                    }
                } while (cekjab == false);
                System.out.print("Masukkan Id :  ");
                idkerja = input.next();
                System.out.print("Masukkan Tahun Masuk : ");
                tahun = input.nextInt();
                System.out.print("Apakah anda memiliki istri ? (Ya/Tidak) :  ");
                istri = input.next();

                if ("Ya".equalsIgnoreCase(istri)) {
                    istri1 = true;
                } else {
                    istri1 = false;
                }
                System.out.print("Apakah anda memiliki anak ? (Ya/Tidak) : ");
                anak = input.next();
                if ("Ya".equalsIgnoreCase(anak)) {
                    System.out.print("Berapa jumlah anak anda? :  ");
                    anak2 = input.nextInt();
                    jmlanak = anak2;
                    anak1 = true;
                } else {
                    anak1 = false;
                }
                if ("Manager".equalsIgnoreCase(jabatan)) {
                    Manager ob = new Manager(nama, idkerja, jabatan, tahun, anak1, istri1);
                    ob.bonus1();
                    ob.tunjangananak(anak1, anak2);
                    ob.tunjanganistri(istri1);               System.out.println("===============================");
                    employee.biodata(ob);
                    ob.gajimanager();
                    System.out.printf("Total :  %.1f\n", ob.getGaji());
                } else if ("Pegawai Tetap".equalsIgnoreCase(jabatan)) {
                    PegawaiTetap ob = new PegawaiTetap(nama, idkerja, jabatan, tahun, anak1, istri1);
                    ob.bonus1();
                    ob.tunjangananak(anak1, anak2);
                    ob.tunjanganistri(istri1);                    
                    employee.biodata(ob);                    
                    ob.gajipegawaitetap();
                    System.out.printf("Total :  %.1f\n", ob.getGaji());
                } else if ("Pegawai Tidak tetap".equalsIgnoreCase(jabatan)) {
                    int jam;
                    System.out.print("Masukkan jam kerja anda : ");
                    jam = input.nextInt();
                    PegawaiTidakTetap ob = new PegawaiTidakTetap(nama, idkerja, jabatan, tahun, anak1, istri1);
                    ob.setJamkerja(jam);
                    employee.biodata(ob);
                    ob.gajipegawailepas();
                    System.out.printf("Total : %.1f\n", ob.getGaji());
                }
            } else {
                System.out.println("Terima kasih");
                System.exit(0);
            }
        } while (menu != 2);
    }
    public void biodata(EmployeeUtama ob) {
        System.out.println("Nama \t\t: " + ob.getNama());
        System.out.println("Id Kerja \t: " + ob.getIdKerja());
        System.out.println("Jabatan \t: " + ob.getJabatan());
        System.out.println("Jumlah anak \t: " + jmlanak);
    }
}
