/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author Admin
 */
public class persegipanjang {
       int p= 10;
    int l= 5;
    
    public void luas (){
        int L = p*l;
        System.out.println( "luas = "+L);
        
    }
    public int keliling(){
        int K = 2*(p+l);
        return K;
        
    } 
    public static void main(String[] args) {
        //method prosedur
        persegipanjang Pp = new persegipanjang();
        Pp.luas();
        //method fungsi
        System.out.println("keliling = "+Pp.keliling());
        
        
    }
}
