/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan54.koordinat;

/**
 *
 * @author User
 */
public class WarnaKoordinat extends Koordinat
{
    private String nama;
    
    public WarnaKoordinat(int x, int y, String namaWarna)
    {
        super(x, y);
        setNama(namaWarna);
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }
}
