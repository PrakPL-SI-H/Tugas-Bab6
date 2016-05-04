package tugas.bab6;
import java.util.Scanner;
public class TugasBab6 {
    private static Object YesNo;

    
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in); 
        String YesNo;
        int Pilihan;
        do{
        System.out.println("SISTEM INFORMASI PEGAWAI PT.EQUINOX");
        System.out.println("=========MENU INPUT DATA===========");
        System.out.println("1. List Jabatan                    ");
        System.out.println("2. Inputan Data Diri & Output      ");
        System.out.println("3. Exit                            ");
        System.out.print("Maskkan Pilihan Menu:"                );
        Pilihan = in.nextInt();
        switch(Pilihan){
            case 1: 
                System.out.println("List Jabatan Dalam Perusahaan           ");
                System.out.println("- Manager                              ");
                System.out.println("- Regular tetap  (RegularT)            ");
                System.out.println("- Regular Tidak Tetap (RegularTT)      ");
                break;
            case 2: 
                System.out.println("Input Output Data Pegawai");
                System.out.print("Masukkan Nama        : ");
                String nama = in.next();
                System.out.print("Masukkan ID          : ");
                String IdKerja = in.next();
                System.out.print("Tahun Masuk          : ");
                int Tahun = in.nextInt();
                System.out.print("Masukkan Jabatan     : ");
                String Jabatan = in.next();
                
                if(Jabatan.equalsIgnoreCase("Manager")){
                System.out.print("Status Hubungan (Menikah/Belum ) : ");
                String status = in.next();
                System.out.print("Jumlah Anak                             : ");
                int Jmlanak = in.nextInt();
                Manager Manager1 = new Manager(nama,"Manager",IdKerja,status,Jmlanak,Tahun);
                Manager1.HitungGaji();
                Manager1.Show();
                   }
            else   if(Jabatan.equalsIgnoreCase("RegularT")){
                System.out.print("Status Hubungan (Menikah/Belum Menikah) : ");
                String status = in.next();
                System.out.print("Jumlah Anak           : ");
                int Jmlanak = in.nextInt();
                Ptetap RegularT = new Ptetap(nama,"Reguler Tetap",IdKerja,status,Jmlanak,Tahun);
                RegularT.HitungGaji();
                RegularT.Show();
        }   
            else if(Jabatan.equalsIgnoreCase("RegularTT")){
                System.out.print("Jumlah Jam Bekerja    : ");
                int jam = in.nextInt();
                Ptidaktetap RegularTT = new Ptidaktetap(nama,"Reguler Tidak Tetap",IdKerja,"Belum Menikah",0,Tahun, jam);
                RegularTT.HitungGaji();
                RegularTT.Show();
            } 
             break;
            default: System.out.println("Program Error!");
        }
        }while( Pilihan < 2);
        System.out.println("Trasaksi Telah Berakhir");
        }
}
    



