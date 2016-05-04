import java.util.Scanner;
public class MainEmployee {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("1.Manager \n2.Pegawai Tetap \n3.Pegawai Tidak Tetap \n0.Keluar");
        System.out.print("Status Anda : ");
        int p=in.nextInt();
        switch(p){
            case 1:
                Manager a = new Manager();
                System.out.print("Masukkan Nama : ");
                String n=in.next();a.setNama(n);
                System.out.print("Masukkan Id : ");
                int i=in.nextInt();a.setId(i);
                System.out.print("Tahun Masuk : ");
                int m=in.nextInt();a.LmKerja(m);a.Bonus();
                System.out.println("1.Ya\n2.Tidak");
                System.out.print("Apakah mempunyai istri : ");
                int is=in.nextInt();
                if(is==1){a.tunjIstri(true);}
                else{a.tunjIstri(false);}
                System.out.println("1.Ya\n2.Tidak");
                System.out.print("Apakah mempunyai anak : ");
                int an=in.nextInt();
                if(an==1){a.tunjAnak(true);}
                else{a.tunjAnak(false);}
                a.tunjJabatan();a.print();break;
            case 2:
                PegawaiTetap b = new PegawaiTetap();
                System.out.print("Masukkan Nama : ");
                String nm=in.next();b.setNama(nm);
                System.out.print("Masukkan Id : ");
                int id=in.nextInt();b.setId(id);
                System.out.print("Tahun Masuk : ");
                int ms=in.nextInt();b.LmKerja(ms);b.Bonus();
                System.out.println("1.Ya\n2.Tidak");
                System.out.print("Apakah mempunyai istri : ");
                int ist=in.nextInt();
                if(ist==1){b.tunjIstri(true);}
                else{b.tunjIstri(false);}
                System.out.println("1.Ya\n2.Tidak");
                System.out.print("Apakah mempunyai anak : ");
                int ank=in.nextInt();
                if(ank==1){b.tunjAnak(true);}
                else{b.tunjAnak(false);}
                b.print();break;
            case 3:
                PegawaiTdkTetap c = new PegawaiTdkTetap();
                System.out.print("Masukkan Nama : ");
                String na=in.next();c.setNama(na);
                System.out.print("Masukkan Id : ");
                int Id=in.nextInt();c.setId(Id);
                System.out.print("Masukkan Lama Lembur : ");
                int l=in.nextInt();c.setJamLembur(l);
                c.gajiLembur();c.print();break;
            default:
                System.out.println("=== KELUAR ===");
        }}}
