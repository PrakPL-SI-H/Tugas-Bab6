/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan;

/**
 *
 * @author TEGAR
 */
public class Employee {
  
      public String nama;
     public String jabatan;
     public String ID;
     public String istri;
     public int anak, thn;
     public final int gajiDasar = 6000000;
     
   public Employee (String nama, String jabatan, String idKerja, String istri, int anak, int thn){
         this.nama = nama;
         this.jabatan = jabatan;
         this.ID = idKerja;
         this.istri = istri;
         this.anak = anak;
         this.thn = thn;
    }
    
    }   
 
