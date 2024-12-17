/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author Admin
 */
public class persegipanjang_parameter {
         public void luas (int p, int l){
        int L = p*l;
        System.out.println( "luas = "+L);
        
    }
    public int keliling(int p, int l){
        int K = 2*(p + l);
        return K;
        
    } 
    public static void main(String[] args) {
        //method prosedur
        persegipanjang_parameter ppp = new persegipanjang_parameter();
       ppp.luas(10,3);  
        ppp.luas(10,5);
        //method fungsi
        System.out.println("keliling = "+ppp.keliling(10,5));
        
        
    }
}
