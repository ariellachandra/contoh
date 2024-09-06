/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class SepedaBeraksi {
    public static void main(String[] args){
        Sepeda sepedaku = new Sepeda();
        sepedaku.setGir(1); //menset nilai gir = 1(sebelumnya 0)
        System.out.println ("Gir saat ini: " + sepedaku.getGir());
    }
}

//konstruktor: memberi nilai awal pada kelas