/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Admin
 */
public class FremeUTS extends javax.swing.JFrame {
   

    /**
     * Creates new form FremeUTS
     */
    public FremeUTS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lalapanikan = new javax.swing.JCheckBox();
        lalapanayam = new javax.swing.JCheckBox();
        ayamkrispy = new javax.swing.JCheckBox();
        ayambakar = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        hargaikan = new javax.swing.JTextField();
        hargaayam = new javax.swing.JTextField();
        hargaayamkrispy = new javax.swing.JTextField();
        hargaayambakar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jumlahikan = new javax.swing.JTextField();
        jumlahayam = new javax.swing.JTextField();
        jumlahayamkrispy = new javax.swing.JTextField();
        jumlahayambakar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalikan = new javax.swing.JTextField();
        totalayam = new javax.swing.JTextField();
        totalayamkrispy = new javax.swing.JTextField();
        totalayambakar = new javax.swing.JTextField();
        totalful = new javax.swing.JTextField();
        diskon = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aplikasi Restoran"));

        jLabel1.setText("Menu Makanan");

        lalapanikan.setText("Lalapan Ikan");
        lalapanikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lalapanikanActionPerformed(evt);
            }
        });

        lalapanayam.setText("Lalapan Ayam");
        lalapanayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lalapanayamActionPerformed(evt);
            }
        });

        ayamkrispy.setText("Ayam Krispy");
        ayamkrispy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayamkrispyActionPerformed(evt);
            }
        });

        ayambakar.setText("Ayam Bakar");
        ayambakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayambakarActionPerformed(evt);
            }
        });

        jLabel2.setText("Harga");

        hargaikan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hargaikan.setText("0");

        hargaayam.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hargaayam.setText("0");

        hargaayamkrispy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hargaayamkrispy.setText("0");

        hargaayambakar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hargaayambakar.setText("0");

        jLabel3.setText("Jumlah");

        jumlahikan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jumlahikan.setText("0");

        jumlahayam.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jumlahayam.setText("0");

        jumlahayamkrispy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jumlahayamkrispy.setText("0");

        jumlahayambakar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jumlahayambakar.setText("0");

        jLabel4.setText("Sub Total");

        totalikan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalikan.setText("0");

        totalayam.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalayam.setText("0");

        totalayamkrispy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalayamkrispy.setText("0");
        totalayamkrispy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalayamkrispyActionPerformed(evt);
            }
        });

        totalayambakar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalayambakar.setText("0");

        totalful.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalful.setText("0");

        diskon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        diskon.setText("0");

        bayar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bayar.setText("0");

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        jLabel5.setText("Total");

        jLabel6.setText("Diskon");

        jLabel7.setText("Total Bayar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lalapanikan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(hargaikan, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jumlahikan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(totalikan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lalapanayam, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(hargaayam, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jumlahayam, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(totalayam, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ayamkrispy, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(hargaayamkrispy, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jumlahayamkrispy, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(totalayamkrispy, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ayambakar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(hargaayambakar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jumlahayambakar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(totalayambakar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(hitung)
                .addGap(55, 55, 55)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(totalful, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lalapanikan))
                    .addComponent(hargaikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lalapanayam))
                    .addComponent(hargaayam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahayam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalayam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ayamkrispy))
                    .addComponent(hargaayamkrispy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahayamkrispy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalayamkrispy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ayambakar)
                    .addComponent(hargaayambakar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahayambakar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalayambakar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hitung)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(totalful, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addComponent(diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ayamkrispyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayamkrispyActionPerformed
        // TODO add your handling code here:
        if (ayamkrispy.isSelected()){
            hargaayamkrispy.setEnabled(true);
            jumlahayamkrispy.setEnabled(true);           
            totalayamkrispy.setEnabled(true);
        }else{
            hargaayamkrispy.setEnabled(false);
            jumlahayamkrispy.setEnabled(false);
            totalayamkrispy.setEnabled(false);
        }

    }//GEN-LAST:event_ayamkrispyActionPerformed

    private void lalapanikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lalapanikanActionPerformed
        // TODO add your handling code here:
           if (lalapanikan.isSelected()){
            hargaikan.setEnabled(true);
            jumlahikan.setEnabled(true);           
            totalikan.setEnabled(true);
        }else{
            hargaikan.setEnabled(false);
            jumlahikan.setEnabled(false);
            totalikan.setEnabled(false);
        }

    }//GEN-LAST:event_lalapanikanActionPerformed

    private void lalapanayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lalapanayamActionPerformed
        // TODO add your handling code here:
          if (lalapanayam.isSelected()){
            hargaayam.setEnabled(true);
            jumlahayam.setEnabled(true);           
            totalayam.setEnabled(true);
        }else{
            hargaayam.setEnabled(false);
            jumlahayam.setEnabled(false);
            totalayam.setEnabled(false);
        }

    }//GEN-LAST:event_lalapanayamActionPerformed

    private void ayambakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayambakarActionPerformed
        // TODO add your handling code here:
        if (ayambakar.isSelected()){
            hargaayambakar.setEnabled(true);
            jumlahayambakar.setEnabled(true);           
            totalayambakar.setEnabled(true);
        }else{
            hargaayambakar.setEnabled(false);
            jumlahayambakar.setEnabled(false);
            totalayambakar.setEnabled(false);
        }

    }//GEN-LAST:event_ayambakarActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
     // Kodingan untuk tombol button
        int harga = Integer.parseInt(hargaikan.getText());
        int jumlah = Integer.parseInt(jumlahikan.getText());
        totalikan.setText(Integer.toString(jumlah * harga)); //Menghitung subTotal harga ikan
        
        int harga1 = Integer.parseInt(hargaayam.getText());
        int jumlah1= Integer.parseInt(jumlahayam.getText());
        totalayam.setText(Integer.toString(harga1 * jumlah1));//menghitung subTotal harga ayam
        
        int harga2 = Integer.parseInt(hargaayamkrispy.getText());
        int jumlah2 = Integer.parseInt(jumlahayamkrispy.getText());
        totalayamkrispy.setText(Integer.toString(harga2 * jumlah2)); //Menghitung subTotal harga ayam krispi
        
        int harga3 = Integer.parseInt(hargaayambakar.getText());
        int jumlah3 = Integer.parseInt(jumlahayambakar.getText());
        totalayambakar.setText(Integer.toString(harga3 * jumlah3)); //Menghitung subTotal harga ayam bakar
        
        // Menghitung harga total, diskon dan total bayar
        int Total1 = Integer.parseInt(totalikan.getText());
        int Total2 = Integer.parseInt(totalayam.getText());
        int Total3 = Integer.parseInt(totalayamkrispy.getText());
        int Total4 = Integer.parseInt(totalayambakar.getText());
        int Full = Total1 + Total2 + Total3 + Total4;
        totalful.setText("Rp." + Full + ",00");
        if (Full > 250000){
            diskon.setText("20%");
            Full = Full-(Full * 20/100);
            bayar.setText("Rp." + Full + ",00");
        }else if (Full > 150000){
            diskon.setText("10%");
            Full = Full-(Full*10/100);
            bayar.setText("Rp." + Full + ",00");
        }else{
            bayar.setText("Rp."+Full+",00");
        }

    }//GEN-LAST:event_hitungActionPerformed

    private void totalayamkrispyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalayamkrispyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalayamkrispyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FremeUTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FremeUTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FremeUTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FremeUTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FremeUTS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ayambakar;
    private javax.swing.JCheckBox ayamkrispy;
    private javax.swing.JTextField bayar;
    private javax.swing.JTextField diskon;
    private javax.swing.JTextField hargaayam;
    private javax.swing.JTextField hargaayambakar;
    private javax.swing.JTextField hargaayamkrispy;
    private javax.swing.JTextField hargaikan;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jumlahayam;
    private javax.swing.JTextField jumlahayambakar;
    private javax.swing.JTextField jumlahayamkrispy;
    private javax.swing.JTextField jumlahikan;
    private javax.swing.JCheckBox lalapanayam;
    private javax.swing.JCheckBox lalapanikan;
    private javax.swing.JTextField totalayam;
    private javax.swing.JTextField totalayambakar;
    private javax.swing.JTextField totalayamkrispy;
    private javax.swing.JTextField totalful;
    private javax.swing.JTextField totalikan;
    // End of variables declaration//GEN-END:variables
}
