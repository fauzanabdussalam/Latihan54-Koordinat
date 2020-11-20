/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan54.koordinat;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menampilkan Koordinat
 *
 */
public class PBO10K10119901Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat wk = new WarnaKoordinat(10, 4, "Jingga");
        
        System.out.println("Warna Koordinat \t : " + wk.getNama());
        System.out.println("Koordinat Sumbu x \t : " + wk.getX() + ", y : " + wk.getY());
    }
}
