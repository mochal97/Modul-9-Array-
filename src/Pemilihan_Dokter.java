/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mochammad Alauddin
 */
public class Pemilihan_Dokter extends javax.swing.JFrame {

    /**
     * Creates new form Pemilihan_Dokter
     */
    public Pemilihan_Dokter() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtnama = new javax.swing.JTextField();
        jtxtalamat = new javax.swing.JTextField();
        jtxtusia = new javax.swing.JTextField();
        jtxtjenis = new javax.swing.JTextField();
        jtxtgol = new javax.swing.JTextField();
        jtxtstatus = new javax.swing.JTextField();
        jtxtkewar = new javax.swing.JTextField();
        jtxtwaktu = new javax.swing.JTextField();
        jtxtspesial = new javax.swing.JTextField();
        jconadokt = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Pemilihan Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(79, 11, 182, 28);

        jLabel2.setText("Pilih Dokter :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 48, 80, 14);

        jLabel4.setText("Nama ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 109, 110, 14);

        jLabel5.setText("Alamat ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 135, 110, 14);

        jLabel6.setText("Usia");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 161, 110, 14);

        jLabel7.setText("Jenis Kelamin");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 187, 110, 14);

        jLabel8.setText("Golongan Darah");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 213, 120, 14);

        jLabel9.setText("Status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 239, 110, 14);

        jLabel10.setText("Kewarganegaraan");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 265, 120, 14);

        jLabel11.setText("Waktu Praktek");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 291, 110, 14);

        jLabel12.setText("Dokter Spesialis");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 317, 110, 14);

        jtxtnama.setEditable(false);
        jtxtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtnama);
        jtxtnama.setBounds(148, 106, 213, 20);

        jtxtalamat.setEditable(false);
        jtxtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtalamatActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtalamat);
        jtxtalamat.setBounds(148, 132, 213, 20);

        jtxtusia.setEditable(false);
        jtxtusia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusiaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtusia);
        jtxtusia.setBounds(148, 158, 213, 20);

        jtxtjenis.setEditable(false);
        jtxtjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtjenisActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtjenis);
        jtxtjenis.setBounds(148, 184, 213, 20);

        jtxtgol.setEditable(false);
        jtxtgol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtgolActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtgol);
        jtxtgol.setBounds(148, 210, 213, 20);

        jtxtstatus.setEditable(false);
        jtxtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtstatusActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtstatus);
        jtxtstatus.setBounds(148, 236, 213, 20);

        jtxtkewar.setEditable(false);
        jtxtkewar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtkewarActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtkewar);
        jtxtkewar.setBounds(148, 262, 213, 20);

        jtxtwaktu.setEditable(false);
        jtxtwaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtwaktuActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtwaktu);
        jtxtwaktu.setBounds(148, 288, 213, 20);

        jtxtspesial.setEditable(false);
        jtxtspesial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtspesialActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtspesial);
        jtxtspesial.setBounds(148, 314, 213, 20);

        jconadokt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu--", "DR. Farras Yassar", "DR. Anisa Putri", "DR. Harun Fajar", " " }));
        jconadokt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconadoktActionPerformed(evt);
            }
        });
        getContentPane().add(jconadokt);
        jconadokt.setBounds(100, 50, 113, 20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas"));
        jPanel1.setToolTipText("Identitas");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 80, 370, 260);

        setBounds(0, 0, 416, 384);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnamaActionPerformed

    private void jtxtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtalamatActionPerformed

    private void jtxtusiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusiaActionPerformed

    private void jtxtjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtjenisActionPerformed

    private void jtxtgolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtgolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtgolActionPerformed

    private void jtxtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtstatusActionPerformed

    private void jtxtkewarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtkewarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtkewarActionPerformed

    private void jtxtwaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtwaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtwaktuActionPerformed

    private void jtxtspesialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtspesialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtspesialActionPerformed

    private void jconadoktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconadoktActionPerformed
        // TODO add your handling code here:
        if(jconadokt.getSelectedItem().equals("DR. Farras Yassar")){
                jtxtnama.setText("DR. Farras Yassar ");
                jtxtalamat.setText("Jl. Surabaya 16, Malang");
                jtxtusia.setText("20 Tahun");
                jtxtjenis.setText("Laki-Laki");
                jtxtgol.setText("A");
                jtxtstatus.setText("Belum Menikah ");
                jtxtkewar.setText("Indonesia");
                jtxtspesial.setText("Dokter Umum");
                jtxtwaktu.setText(" Pagi (07.00-15.00)");
        }
        else
            if(jconadokt.getSelectedItem().equals("DR. Anisa Putri")){
                jtxtnama.setText("DR. Anisa Putri");
                jtxtalamat.setText("Jl. Veteran 3, Malang");
                jtxtusia.setText("20 Tahun");
                jtxtjenis.setText("Perempuan");
                jtxtgol.setText("O");
                jtxtstatus.setText("Belum Menikah");
                jtxtkewar.setText("Indonesia"); 
                jtxtspesial.setText("Dokter Gigi");
                jtxtwaktu.setText(" Sore (16.00-22.00)");
            }
                else
                    if(jconadokt.getSelectedItem().equals("DR. Harun Fajar")){
                        jtxtnama.setText("DR. Harun Fajar ");
                        jtxtalamat.setText("Jl. Bandung 9, Malang");
                        jtxtusia.setText("20 Tahun");
                        jtxtjenis.setText("Laki-Laki");
                        jtxtgol.setText("B");
                        jtxtstatus.setText("Belum Menikah");
                        jtxtkewar.setText("Indonesia");
                        jtxtspesial.setText("Dokter Gizi");
                        jtxtwaktu.setText(" Malam (22.00-06.00)");

                }
    }//GEN-LAST:event_jconadoktActionPerformed

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
            java.util.logging.Logger.getLogger(Pemilihan_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemilihan_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemilihan_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemilihan_Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemilihan_Dokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jconadokt;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    // End of variables declaration//GEN-END:variables
}
