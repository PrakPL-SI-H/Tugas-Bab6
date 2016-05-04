package Inheritance;
public class Manager extends Employee {
    public double bonus;
    public double tunjangan;
    public int jml;
    public int gaji = 1000000;
    public Manager(String name,int Idkerja,String Jabatan,String Status,int anak,int Tahun){
        super (name, Idkerja, Jabatan, Status, anak, Tahun);//harus ada paling atas
    }
    public void tunjanganMJ(){
        jml = (int) (gaji + hasil + tunjangan);
        System.out.println("mendapatkan tunjangan jabatan sebesar 0.1 dari jumlah gaji");
        System.out.println("Jadi tunjangannya : " + jml);
    }
    @Override
    public void tunjangan (){
    hasil = 2016-Tahun;
    if(hasil <= 5){
        System.out.println("Tidak mendapat bonus");
    }else if(hasil>=6 && hasil<=10){
        System.out.println("Mendapat bonus 0.05 dari lama kerja ");
        bonus = gaji/0.05;
        System.out.println("Tidak mendapatkan tunjangan");
    }else{
        System.out.println("mendapatkan bonus 0.1 dari lama kerja");
        bonus = gaji/0.1;
        System.out.println("mendapatkan tunjangan 0.1 dari lama kerja");
        tunjangan = 0.1;
        }
    }
    @Override
    public void Status(){
    if ("ya".equals(Status) ){
        System.out.println("mendapatkan tunjangan 0.1 dari total gaji yang didapat (gaji+lama kerja+tunjangan)");
    }else{
        System.out.println("Jika belum kawin tunjangan istri 0 rupiah ");
        }
    }
    @Override
    public void anak(){
        if (anak == 1){
        System.out.println("tunjangan anak sebesar 0.15 dari jumlah gaji yang di dapatkan");
        jml+= (int) (0.15 * gaji + hasil + tunjangan);
        } else if (anak == 2){
        System.out.println("tunjangan anak sebesar 0.15 dari jumlah gaji yang di dapatkan");
        jml+= (int) (0.15 * gaji + hasil + tunjangan);
        } else if (anak == 3){
        System.out.println("tunjangan anak sebesar 0.15 dari jumlah gaji yang di dapatkan");
        jml+= (int) (0.15 * gaji + hasil + tunjangan);
        }else 
        System.out.println("tidak mendapatkan tunjangan untuk anak");
    }
    public void Tampilanmj(){
        System.out.println("Bonus       : "+ bonus);
        System.out.println("Gaji        : "+ gaji);
    }   
}
