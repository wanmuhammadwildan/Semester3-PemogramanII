/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author Admin
 */
public class persegipanjang_static {
     public static void luas (int p, int l){
        int L = p*l;
        System.out.println( "luas = "+L);
        
    }
    public static int keliling(int p, int l){
        int K = 2*(p + l);
        return K;
        
    } 
    public static void main(String[] args) {
        luas(10,5);
        System.out.println(keliling(10,5));
    }
}
