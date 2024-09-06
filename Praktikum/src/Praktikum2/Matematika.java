/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author lenovo
 */
public class Matematika {
    int jumlah, kurang, kali, bagi;
    
    void pertambahan (int a, int b){
        jumlah = a+b;
        System.out.println ("Pertambahan: " + a + " " + "+" + " " + b + " = " + jumlah);
    }
    
    void pengurangan (int a, int b){
        kurang = a-b;
        System.out.println ("Pengurangan: " + a + " " + "-" + " " + b + " = " + kurang);
    }
    
    void perkalian (int a, int b){
        kali = a*b;
        System.out.println ("Perkalian: " + a + "*" + b + " = " + kali);
    }
    
    void pembagian (int a, int b){
        bagi = a/b;
        System.out.println ("Pembagian: " + a + "/" + b + " = " + bagi);
    }
}
