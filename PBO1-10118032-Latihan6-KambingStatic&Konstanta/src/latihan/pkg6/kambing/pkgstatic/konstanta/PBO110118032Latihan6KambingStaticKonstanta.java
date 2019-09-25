/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg6.kambing.pkgstatic.konstanta;

/**
 *
 * @author
 * NAMA  : Guntur Maulana Ibrahim
 * Kelas : PBO1
 * NIM   : 10118032
 * Deskripsi Program : Program ini berisi untuk menampilkan data konstanta
 */
public class PBO110118032Latihan6KambingStaticKonstanta {
   //Var jumlahKambing di deklarasikan sebagai statik
    public static int jumlahKambing;
}

public class KambingStatic {
   //Nama_kambing sebagai kontanta
    public static final String NAMA_KAMBING = "MIDUN";
  
    public static void main(String[] args) {
       PBO110118032Latihan6KambingStaticKonstanta.jumlahKambing = 485000;
       System.out.println(NAMA_KAMBING + "memilik kambing sebanyak " + PBO110118032Latihan6KambingStaticKonstanta.jumlahKambing);
    }
    
}
