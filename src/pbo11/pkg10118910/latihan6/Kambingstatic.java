/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11.pkg10118910.latihan6;

/**
 *
 * @author
 * NAMA : Muhamad Syifa Amrulloh 
 * KELAS : PBO11K 
 * NIM : 10118910
 *
 * Description Program : Program ini Berisi pengunaan method Kambing Static & Konstanta
 */
public class Kambingstatic {
//    Nama Kambing sebagai Konstanta
    public static final String NAMA_KAMBING ="MIDUN";
    
    public static void main(String[] args) {
        PBO1110118910Latihan6 Mamalia = new PBO1110118910Latihan6();
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING +" Memiliki Kambing Sebanyak " + Mamalia.jumlahKambing);
    }
}
