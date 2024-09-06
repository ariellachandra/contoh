/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author lenovo
 */
public class BingoBeraksi {
    public static void main (String[] args){
        Bingo bingoku = new Bingo();
        
        bingoku.word = "There was a farmer who had a dog,\n" +
                       "And Bingo was his name-o.\n" +
                       "B-I-N-G-O\n" +
                       "B-I-N-G-O\n" +
                       "B-I-N-G-O\n" +
                       "And Bingo was his name-o.";
        bingoku.tampil();
        bingoku.tampil();
        bingoku.tampil();
        bingoku.tampil();
        bingoku.tampil();
        bingoku.tampil();
    }
}
