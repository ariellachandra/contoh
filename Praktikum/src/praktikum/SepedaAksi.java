/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author lenovo
 */
public class SepedaAksi {
    public static void main (String[] args){
        Sepeda sepedaku = new Sepeda();
        
        sepedaku.warna = "Hitam";
        sepedaku.tahunProduksi = 2006;
        System.out.println ("Kring-kring sepedaku...");
        System.out.println ("Sepedaku berwarna: " + sepedaku.warna);
        System.out.println ("Diprodukdi tahun: " + sepedaku.tahunProduksi);
    }
}
