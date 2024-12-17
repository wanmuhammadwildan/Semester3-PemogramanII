/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author Admin
 */
public class method {
     int p = 5;
    int l = 2;
    int L;
        
       
   void luas (){
       L = p*l;
       System.out.println(L);
       
   }
    int Luas(){
        L = p*l;
        
        return (L);
    }
    
    public static void main(String[] args) {
        method Pp = new method();
        Pp.luas();
        System.out.println(Pp.Luas());
    }
}
