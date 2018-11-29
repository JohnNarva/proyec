
package Cooperativa;

public class NewJFrame extends javax.swing.JFrame {

  
    public NewJFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtadulto = new javax.swing.JTextField();
        txtniño = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtimporte = new javax.swing.JTextField();
        txtpago = new javax.swing.JTextField();
        txtcambio = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        btngenerar = new javax.swing.JButton();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUTA", "loja", "quito", "guayaquil" }));
        jComboBox1.setToolTipText("");
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HORA", "10:00", "12:00", "13:00", "18:00" }));
        jComboBox2.setToolTipText("");
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel1.setText("ADULTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel2.setText("NIÑO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        txtadulto.setText("10.00");
        txtadulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadultoActionPerformed(evt);
            }
        });
        getContentPane().add(txtadulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 62, -1));

        txtniño.setText("7.50");
        txtniño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtniñoActionPerformed(evt);
            }
        });
        getContentPane().add(txtniño, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 56, -1));

        jLabel3.setText("PRECIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel4.setText("PAGO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel5.setText("CAMBIO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));
        getContentPane().add(txtimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 263, 64, -1));
        getContentPane().add(txtpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 263, 67, -1));
        getContentPane().add(txtcambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 62, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASIENTOS", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        btngenerar.setText("RESERVAR");
        getContentPane().add(btngenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jl1.setBackground(new java.awt.Color(102, 255, 0));
        jl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl1.setText("1");
        jl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jl1.setOpaque(true);
        getContentPane().add(jl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 30));

        jl2.setBackground(new java.awt.Color(102, 255, 0));
        jl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl2.setText("2");
        jl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jl2.setOpaque(true);
        getContentPane().add(jl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jl3.setBackground(new java.awt.Color(102, 255, 0));
        jl3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl3.setText("3");
        jl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jl3.setOpaque(true);
        getContentPane().add(jl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel10.setBackground(new java.awt.Color(102, 255, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("4");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel11.setBackground(new java.awt.Color(102, 255, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("7");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel12.setBackground(new java.awt.Color(102, 255, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("8");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel13.setBackground(new java.awt.Color(102, 255, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("9");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel14.setBackground(new java.awt.Color(102, 255, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("10");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel15.setBackground(new java.awt.Color(102, 255, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("5");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel16.setBackground(new java.awt.Color(102, 255, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("11");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel17.setBackground(new java.awt.Color(102, 255, 0));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("6");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel18.setBackground(new java.awt.Color(102, 255, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("12");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel19.setBackground(new java.awt.Color(102, 255, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("13");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setOpaque(true);
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel20.setBackground(new java.awt.Color(102, 255, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("19");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.setOpaque(true);
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel21.setBackground(new java.awt.Color(102, 255, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("14");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.setOpaque(true);
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel22.setBackground(new java.awt.Color(102, 255, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("10");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel22.setOpaque(true);
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel23.setBackground(new java.awt.Color(102, 255, 0));
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("15");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.setOpaque(true);
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel24.setBackground(new java.awt.Color(102, 255, 0));
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("21");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.setOpaque(true);
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel25.setBackground(new java.awt.Color(102, 255, 0));
        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("16");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.setOpaque(true);
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel26.setBackground(new java.awt.Color(102, 255, 0));
        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("22");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel26.setOpaque(true);
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jLabel27.setBackground(new java.awt.Color(102, 255, 0));
        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("17");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.setOpaque(true);
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jLabel28.setBackground(new java.awt.Color(102, 255, 0));
        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("23");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.setOpaque(true);
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel29.setBackground(new java.awt.Color(102, 255, 0));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("18");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.setOpaque(true);
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        jLabel30.setBackground(new java.awt.Color(102, 255, 0));
        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("24");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.setOpaque(true);
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "adulto", "niño" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 200, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("COOPERATIVA DE TRASPORTE");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel33.setBackground(new java.awt.Color(51, 204, 0));
        jLabel33.setOpaque(true);
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 20, 20));

        jLabel34.setBackground(new java.awt.Color(255, 0, 0));
        jLabel34.setOpaque(true);
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 20, 20));

        jLabel35.setBackground(new java.awt.Color(51, 0, 204));
        jLabel35.setOpaque(true);
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 20, 20));

        jLabel36.setText("libre");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jLabel37.setText("ocupado");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel38.setText("asientos especiales");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtadultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadultoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadultoActionPerformed

    private void txtniñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtniñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtniñoActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);                
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngenerar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JTextField txtadulto;
    private javax.swing.JTextField txtcambio;
    private javax.swing.JTextField txtimporte;
    private javax.swing.JTextField txtniño;
    private javax.swing.JTextField txtpago;
    // End of variables declaration//GEN-END:variables
}
