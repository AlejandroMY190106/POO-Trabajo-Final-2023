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
        BTNEliminar = new javax.swing.JButton();
        BTNAñadir = new javax.swing.JButton();
        BTNCobrar = new javax.swing.JButton();
        SALUDO = new javax.swing.JLabel();
        BTNLista = new javax.swing.JButton();
        SALUDO1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        BTNEliminar.setBackground(new java.awt.Color(68, 132, 0));
        BTNEliminar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        BTNEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BTNEliminar.setText("ELIMINAR COMPRA");

        BTNAñadir.setBackground(new java.awt.Color(68, 132, 0));
        BTNAñadir.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        BTNAñadir.setForeground(new java.awt.Color(255, 255, 255));
        BTNAñadir.setText("AÑADIR COMPRA");

        BTNCobrar.setBackground(new java.awt.Color(68, 132, 0));
        BTNCobrar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        BTNCobrar.setForeground(new java.awt.Color(255, 255, 255));
        BTNCobrar.setText("COBRAR");
        BTNCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCobrarActionPerformed(evt);
            }
        });

        SALUDO.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SALUDO.setForeground(new java.awt.Color(255, 255, 255));
        SALUDO.setText("Bienvenido:");

        BTNLista.setBackground(new java.awt.Color(68, 132, 0));
        BTNLista.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        BTNLista.setForeground(new java.awt.Color(255, 255, 255));
        BTNLista.setText("LISTA COMPRAS");

        SALUDO1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SALUDO1.setForeground(new java.awt.Color(255, 255, 255));
        SALUDO1.setText("Puesto: Cajero");

        javax.swing.GroupLayout FondoVerdeOCLayout = new javax.swing.GroupLayout(FondoVerdeOC);
        FondoVerdeOC.setLayout(FondoVerdeOCLayout);
        FondoVerdeOCLayout.setHorizontalGroup(
            FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                .addComponent(FondoBlancoOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                        .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BTNAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BTNCobrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                        .addComponent(NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                        .addComponent(SALUDO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SALUDO1)
                        .addGap(21, 21, 21))))
        );
        FondoVerdeOCLayout.setVerticalGroup(
            FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBlancoOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SALUDO1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SALUDO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(BTNAñadir)
                .addGap(18, 18, 18)
                .addComponent(BTNEliminar)
                .addGap(26, 26, 26)
                .addComponent(BTNLista)
                .addGap(32, 32, 32)
                .addComponent(BTNCobrar)
                .addGap(87, 87, 87))
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

    private void BTNCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCobrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNCobrarActionPerformed

    private void BTNSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTNSalirActionPerformed

    
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
    private javax.swing.JButton BTNCobrar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNLista;
    private javax.swing.JButton BTNSalir;
    private javax.swing.JPanel FondoBlancoOC;
    private javax.swing.JPanel FondoVerdeOC;
    private javax.swing.JLabel LogoOC;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JLabel SALUDO;
    private javax.swing.JLabel SALUDO1;
    // End of variables declaration//GEN-END:variables
}
