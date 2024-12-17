/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Admin
 */
public class NilaiMahasiswa {
// Deklarasi variabel 
double Nilai;
String Nm;

//  untuk mengatur dan mengembalikan nama mahasiswa
public String NAMA(String Nama){
    
    this.Nm = Nama;
    
    return Nama;
}
// untuk mengatur dan mengembalikan nilai mahasiswa
public double NILAI(double Nilai){
    this.Nilai = Nilai;
    return Nilai;
}
  //  untuk menentukan apakah mahasiswa lulus atau tidak
public void KETERANGAN(){
    if (Nilai >= 70){
        System.out.println("LULUS");
    }
    else{
        System.out.println("TIDAK LULUS");
    }
}

//tampilan program
    public static void main(String[] args) {
        NilaiMahasiswa Nm = new NilaiMahasiswa();
    
        System.out.println("NAMA        = " + Nm.NAMA("wan")); 
        System.out.println("NILAI       = " + Nm.NILAI(60)); 
        System.out.print(  "KETERANGAN  = " );
        Nm.KETERANGAN();   
        
        System.out.println("NAMA        = " + Nm.NAMA("alfa")); 
        System.out.println("NILAI       = " + Nm.NILAI(80)); 
        System.out.print(  "KETERANGAN  = " );
        Nm.KETERANGAN();

    
    }
}