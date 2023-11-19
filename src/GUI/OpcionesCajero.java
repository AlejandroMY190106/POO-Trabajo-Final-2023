/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import tottus.Empleados;

/**
 *
 * @author Mendoza
 */

public class OpcionesCajero extends javax.swing.JFrame {
    
    /**
     * Creates new form Prueba
     */
    public OpcionesCajero() {
        initComponents();
        
    }
    private String nombre;
    public void SetNombre(String nombre){
        this.nombre = nombre;
        NOMBRE.setText(nombre);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoVerdeOC = new javax.swing.JPanel();
        NOMBRE = new javax.swing.JLabel();
        FondoBlancoOC = new javax.swing.JPanel();
        LogoOC = new javax.swing.JLabel();
        BTNSalir = new javax.swing.JButton();
        SALUDO = new javax.swing.JLabel();
        SALUDO1 = new javax.swing.JLabel();
        BTNAñadir = new javax.swing.JButton();
        SALUDO2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoVerdeOC.setBackground(new java.awt.Color(100, 176, 48));
        FondoVerdeOC.setPreferredSize(new java.awt.Dimension(600, 450));

        NOMBRE.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        NOMBRE.setForeground(new java.awt.Color(255, 255, 255));

        FondoBlancoOC.setBackground(new java.awt.Color(255, 255, 255));

        LogoOC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Tottus.png"))); // NOI18N

        BTNSalir.setBackground(new java.awt.Color(255, 0, 0));
        BTNSalir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BTNSalir.setText("SALIR");
        BTNSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoBlancoOCLayout = new javax.swing.GroupLayout(FondoBlancoOC);
        FondoBlancoOC.setLayout(FondoBlancoOCLayout);
        FondoBlancoOCLayout.setHorizontalGroup(
            FondoBlancoOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoOCLayout.createSequentialGroup()
                .addGroup(FondoBlancoOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoBlancoOCLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(LogoOC))
                    .addGroup(FondoBlancoOCLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(BTNSalir)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        FondoBlancoOCLayout.setVerticalGroup(
            FondoBlancoOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoOCLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(LogoOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(BTNSalir)
                .addGap(64, 64, 64))
        );

        SALUDO.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SALUDO.setForeground(new java.awt.Color(255, 255, 255));
        SALUDO.setText("Bienvenido:");

        SALUDO1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SALUDO1.setForeground(new java.awt.Color(255, 255, 255));
        SALUDO1.setText("Puesto:");

        BTNAñadir.setBackground(new java.awt.Color(68, 132, 0));
        BTNAñadir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BTNAñadir.setForeground(new java.awt.Color(255, 255, 255));
        BTNAñadir.setText("GESTIONAR COMPRA");
        BTNAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAñadirActionPerformed(evt);
            }
        });

        SALUDO2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SALUDO2.setForeground(new java.awt.Color(255, 255, 255));
        SALUDO2.setText("Cajero");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bolsacompras.png"))); // NOI18N

        javax.swing.GroupLayout FondoVerdeOCLayout = new javax.swing.GroupLayout(FondoVerdeOC);
        FondoVerdeOC.setLayout(FondoVerdeOCLayout);
        FondoVerdeOCLayout.setHorizontalGroup(
            FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                .addComponent(FondoBlancoOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                                .addComponent(SALUDO)
                                .addGap(31, 31, 31)
                                .addComponent(SALUDO1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SALUDO2))
                            .addComponent(BTNAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        FondoVerdeOCLayout.setVerticalGroup(
            FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBlancoOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SALUDO1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SALUDO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SALUDO2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(BTNAñadir)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FondoVerdeOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FondoVerdeOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalirActionPerformed
        PantallaPrincipalLogin PPL = new PantallaPrincipalLogin();
        PPL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNSalirActionPerformed

    private void BTNAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAñadirActionPerformed
        GestiónCompra GC = new GestiónCompra();
        GC.SetPuesto(SALUDO2.getText());
        GC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNAñadirActionPerformed

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OpcionesCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAñadir;
    private javax.swing.JButton BTNSalir;
    private javax.swing.JPanel FondoBlancoOC;
    private javax.swing.JPanel FondoVerdeOC;
    private javax.swing.JLabel LogoOC;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JLabel SALUDO;
    private javax.swing.JLabel SALUDO1;
    private javax.swing.JLabel SALUDO2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
