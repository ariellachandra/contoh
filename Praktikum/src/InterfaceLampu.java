/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */

//interface: kita ngasih intruksi tapi kita gak ngasih tau gimana cara ngelakuin instruksi tsb
interface InterfaceLampu {
    public static final int KEADAAN_HIDUP = 1;
    public static final int KEADAAN_MATI = 0;
    public abstract void hidupkan();
    public abstract void matikan();
}

//public class Lampu implementasi InterfaceLampu{
//    int statusLampu;
//    public void hidupkan(){
//        if(statusLampu == KEADAAN_MATI){
//            statusLampu = KEADAAN_HIDUP;
//            System.out.println ("Hidupkan Lampu! --> Lampu Hidup");
//        } else {
//            System.out.println ("Hidupkan Lampu! --> Lampu Sudah Hidup Kok");
//        }
//    }
//    public void matikan(){
//        if (statusLampu == KEADAAN_HIDUP){
//            statusLampu = KEADAAN_MATI;
//            System.out.println ("Matikan Lampu! --> Lampu Mati");
//        }else{
//            System.out.println ("Matikan Lampu! --> Lampu Sudah Mati Kok");
//        }
//    }
//}
