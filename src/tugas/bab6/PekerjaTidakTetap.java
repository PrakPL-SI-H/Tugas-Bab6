package Inheritance;
public class PekerjaTidakTetap extends Employee {
    private int lembur;
    public int nilai;
    private int total;
    private int gaji = 3000000;
    public PekerjaTidakTetap(String name,int Idkerja,String Jabatan,String Status,int anak,int Tahun){
        super (name, Idkerja, Jabatan, Status, anak, Tahun);//harus ada paling atas
    }
    public void lembur(int lembur){
        if (10 <= lembur){
            System.out.println("jika lebih dari 10 jam mendapat lembur");
            nilai = lembur - 10;
            total = 10000 * nilai;
            System.out.println("Lembur      : "+total);
        }else{
            System.out.println("jika kurang dari 10 jam tidak mendapat lembur");
            System.out.println("Lembur       : "+total);
        }
    }
    public void TampilPtt(){
        System.out.println("Gaji        : "+ gaji );     
    }  
}