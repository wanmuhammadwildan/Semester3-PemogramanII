
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilda
 */
public class koneksi {
   
       public static void main(String[] args) {
     koneksi tesKoneksi = new koneksi ();
     tesKoneksi.Koneksi();
    }
   String StatusKoneksi ;
   Connection con = null;
    public void Koneksi(){
     try
        {
            String connectionURL = "jdbc:mysql://localhost:/apotek";
            String username = "root";
            String password = "";
            
           con = DriverManager.getConnection(connectionURL, username, password);
          //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
          StatusKoneksi = "Koneksi Tersambung";
} catch (SQLException ex) {
              StatusKoneksi = "Tidak Berhasil";
}
}
}
