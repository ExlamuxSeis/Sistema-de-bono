package mensajes;

public class alerta extends javax.swing.JFrame {

    
    /**
     * Creates new form alerta
     */
    public alerta() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foto = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        mensaje1 = new javax.swing.JLabel();
        mensaje2 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(300, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/error.png"))); // NOI18N
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 160));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("jLabel2");
        titulo.setToolTipText("");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 280, -1));

        mensaje1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje1.setText("jLabel3");
        getContentPane().add(mensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, -1));

        mensaje2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mensaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje2.setText("jLabel4");
        getContentPane().add(mensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 280, -1));

        aceptar.setBackground(new java.awt.Color(0, 102, 102));
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        cancelar.setBackground(new java.awt.Color(153, 0, 0));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(alerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alerta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton aceptar;
    public javax.swing.JButton cancelar;
    public javax.swing.JLabel foto;
    public javax.swing.JLabel mensaje1;
    public javax.swing.JLabel mensaje2;
    public javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
