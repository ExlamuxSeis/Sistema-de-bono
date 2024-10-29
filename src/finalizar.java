
import java.awt.Color;
import mensajes.alerta;
import mensajes.pago;
import mensajes.autor;


public class finalizar extends javax.swing.JFrame {

    /**
     * Creates new form finalizar
     */
    public finalizar() {
        initComponents();
        Color fondo = new Color(51,102,102);
        getContentPane().setBackground(fondo);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JTextField();
        Apaterno = new javax.swing.JTextField();
        Amaterno = new javax.swing.JTextField();
        servicios = new javax.swing.JTextField();
        departamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        departamento.setForeground(new java.awt.Color(255, 255, 255));
        departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Administrativo", "Directivo"}));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Departamento");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jLabel9.setText("2022 Universidad Tecnológica de la Tierra Caliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido Admin");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Datos del trabajador para calcular su sueldo");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido paterno");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Años de servicios");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Apellido materno");

        jMenu1.setText("Opciones");

        jMenu4.setText("Color de fondo");

        jMenuItem5.setText("Verde musgo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Morado");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Negro");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenu1.add(jMenu4);

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Calcular");

        jMenuItem3.setText("Sueldo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acerca de");

        jMenuItem4.setText("Creador");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(Apaterno)
                                .addComponent(Amaterno)
                                .addComponent(nombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(317, 317, 317)))
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(156, 156, 156))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Amaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
                    autor tex = new autor();
                    tex.titulo.setText("¡Hola, yo soy el creador!");
                    tex.mensaje1.setText("Mi nombre nombre es:");
                    tex.mensaje2.setText("Exlamux6");
                    tex.cancelar.setVisible(true);
                    tex.cancelar.setBackground(new Color(51,102,102));
                    tex.cancelar.setText("Ok");
                    tex.cancelar.setForeground(Color.white);
                    tex.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        alerta tex = new alerta();
        tex.titulo.setText("¿Estás seguro?");
        tex.mensaje1.setText("Se cerrará la aplicación");
        tex.mensaje2.setText("");
        tex.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        nombre.setText("");
        Apaterno.setText("");
        Amaterno.setText("");
        servicios.setText("");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        getContentPane().setBackground(new Color(0,0,0));
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        getContentPane().setBackground(new Color(51,0,102));
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        getContentPane().setBackground(new Color(51,102,102));
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        String clave = departamento.getSelectedItem().toString();
        String Nombre = nombre.getText().trim();
        String paterno = Apaterno.getText().trim();
        String materno = Amaterno.getText().trim();
        String Servicios = servicios.getText();
        if(Nombre.equals("") || paterno.equals("") || materno.equals("") ||
                Servicios.equals("")){
            alerta tex = new alerta();
            tex.titulo.setText("¡Campos vacíos!");
            tex.mensaje1.setText("Debes de rellenar todos los campos");
            tex.mensaje2.setText("");
            tex.aceptar.setVisible(false);
            tex.cancelar.setText("Ok");
            tex.cancelar.setVisible(true);
            tex.cancelar.setBackground(Color.orange);
            tex.setVisible(true);
        } else {
            int tiempo = Integer.parseInt(Servicios);
            if(clave.equals("Docente")){                
                if(tiempo == 0){
                        alerta tex = new alerta();
                        tex.titulo.setText("¡Falta de años de servicio!");
                        tex.mensaje1.setText("Necesita tener minimo un año de servicio");
                        tex.mensaje2.setText("para ser beneficiario del bono.");
                        tex.aceptar.setVisible(false);
                        tex.cancelar.setText("Ok");
                        tex.cancelar.setVisible(true);
                        tex.cancelar.setBackground(Color.orange);
                        tex.setVisible(true);
                    } else{
                        if (tiempo>=41){
                            float sueldo = tiempo * 100;
                            float incremento = (float) (sueldo * 0.10);
                            float sueldo_incre = sueldo + incremento;
                            float isr = (float) ((float)sueldo_incre * 0.03);
                            float iva = (float) ((float)sueldo_incre * 0.16);
                            float total = sueldo_incre - isr - iva;
                            
                            pago ven = new pago();
                            ven.mensaje0.setText(Nombre + " " + paterno + " " + materno);
                            ven.mensaje1.setText("Subtotal: $ " + sueldo_incre);
                            ven.mensaje2.setText("ISR: $ " + isr);
                            ven.mensaje3.setText("IVA: $ " + iva);
                            ven.mensaje4.setText("Total a pagar");
                            ven.mensaje5.setText("$ "+ total);
                            ven.cancelar.setText("Ok");
                            ven.setVisible(true);
                        }else{
                            int sueldo = tiempo * 100;
                            float isr = (float) ((float)sueldo * 0.03);
                            float iva = (float) ((float)sueldo * 0.16);
                            float total = sueldo - isr - iva;
                            pago ven = new pago();
                            ven.mensaje0.setText(Nombre + " " + paterno + " " + materno);
                            ven.mensaje1.setText("Subtotal: $ " + sueldo);
                            ven.mensaje2.setText("ISR: $ " + isr);
                            ven.mensaje3.setText("IVA: $ " + iva);
                            ven.mensaje4.setText("Total a pagar");
                            ven.mensaje5.setText("$ "+ total);
                            ven.cancelar.setText("Ok");
                            ven.setVisible(true);
                        }
                    }
            } else if(clave.equals("Administrativo")){
                if(tiempo == 0){
                        alerta tex = new alerta();
                        tex.titulo.setText("¡Falta de años de servicio!");
                        tex.mensaje1.setText("Necesita tener minimo un año de servicio");
                        tex.mensaje2.setText("para ser beneficiario del bono.");
                        tex.aceptar.setVisible(false);
                        tex.cancelar.setText("Ok");
                        tex.cancelar.setVisible(true);
                        tex.cancelar.setBackground(Color.orange);
                        tex.setVisible(true);
                    } else{
                        if (tiempo>=41){
                            float sueldo = tiempo * 80;
                            float incremento = (float) (sueldo * 0.10);
                            float sueldo_incre = sueldo + incremento;
                            float isr = (float) ((float)sueldo_incre * 0.03);
                            float iva = (float) ((float)sueldo_incre * 0.16);
                            float total = sueldo_incre - isr - iva;
                            
                            pago ven = new pago();
                            ven.mensaje0.setText(Nombre + " " + paterno + " " + materno);
                            ven.mensaje1.setText("Subtotal: $ " + sueldo_incre);
                            ven.mensaje2.setText("ISR: $ " + isr);
                            ven.mensaje3.setText("IVA: $ " + iva);
                            ven.mensaje4.setText("Total a pagar");
                            ven.mensaje5.setText("$ "+ total);
                            ven.cancelar.setText("Ok");
                            ven.setVisible(true);
                        }else{
                            int sueldo = tiempo * 80;
                            float isr = (float) ((float)sueldo * 0.03);
                            float iva = (float) ((float)sueldo * 0.16);
                            float total = sueldo - isr - iva;
                            
                            pago ven = new pago();
                            ven.mensaje0.setText(Nombre + " " + paterno + " " + materno);
                            ven.mensaje1.setText("Subtotal: $ " + sueldo);
                            ven.mensaje2.setText("ISR: $ " + isr);
                            ven.mensaje3.setText("IVA: $ " + iva);
                            ven.mensaje4.setText("Total a pagar");
                            ven.mensaje5.setText("$ "+ total);
                            ven.cancelar.setText("Ok");
                            ven.setVisible(true);
                        }
                }
            } else if(clave.equals("Directivo")){
                if(tiempo == 0){
                        alerta tex = new alerta();
                        tex.titulo.setText("¡Falta de años de servicio!");
                        tex.mensaje1.setText("Necesita tener minimo un año de servicio");
                        tex.mensaje2.setText("para ser beneficiario del bono.");
                        tex.aceptar.setVisible(false);
                        tex.cancelar.setText("Ok");
                        tex.cancelar.setVisible(true);
                        tex.cancelar.setBackground(Color.orange);
                        tex.setVisible(true);
                    } else{
                        if (tiempo>=41){
                            float sueldo = tiempo * 150;
                            float incremento = (float) (sueldo * 0.10);
                            float sueldo_incre = sueldo + incremento;
                            float isr = (float) ((float)sueldo_incre * 0.03);
                            float iva = (float) ((float)sueldo_incre * 0.16);
                            float total = sueldo_incre - isr - iva;
                            
                            pago ven = new pago();
                            ven.mensaje0.setText(Nombre + " " + paterno + " " + materno);
                            ven.mensaje1.setText("Subtotal: $ " + sueldo_incre);
                            ven.mensaje2.setText("ISR: $ " + isr);
                            ven.mensaje3.setText("IVA: $ " + iva);
                            ven.mensaje4.setText("Total a pagar");
                            ven.mensaje5.setText("$ "+ total);
                            ven.cancelar.setText("Ok");
                            ven.setVisible(true);
                        }else{
                            int sueldo = tiempo * 150;
                            float isr = (float) ((float)sueldo * 0.03);
                            float iva = (float) ((float)sueldo * 0.16);
                            float total = sueldo - isr - iva;
                            pago ven = new pago();
                            ven.mensaje0.setText(Nombre + " " + paterno + " " + materno);
                            ven.mensaje1.setText("Subtotal: $ " + sueldo);
                            ven.mensaje2.setText("ISR: $ " + isr);
                            ven.mensaje3.setText("IVA: $ " + iva);
                            ven.mensaje4.setText("Total a pagar");
                            ven.mensaje5.setText("$ "+ total);
                            ven.cancelar.setText("Ok");
                            ven.setVisible(true);
                        }
                }
            }
        }  
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(finalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(finalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(finalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(finalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new finalizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amaterno;
    private javax.swing.JTextField Apaterno;
    private javax.swing.JComboBox<String> departamento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField servicios;
    // End of variables declaration//GEN-END:variables
}