/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import tottus.Productos;
/**
 *
 * @author Mendoza
 */
public class AñadirProducto extends javax.swing.JFrame {

    /**
     * Creates new form AñadirProducto
     */
    public AñadirProducto() {
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

        FondoVerdeOC = new javax.swing.JPanel();
        TITULO = new javax.swing.JLabel();
        BTNSalir = new javax.swing.JButton();
        BTNAñadir = new javax.swing.JButton();
        LabelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        LabelPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtPrecioAfiliado = new javax.swing.JTextField();
        LabelPA = new javax.swing.JLabel();
        txtPuntosAfiliado = new javax.swing.JTextField();
        LabelPAf = new javax.swing.JLabel();
        LabelCódigo = new javax.swing.JLabel();
        txtCódigo = new javax.swing.JTextField();
        txtProovedor = new javax.swing.JTextField();
        LabelProovedor = new javax.swing.JLabel();
        LabelDesc = new javax.swing.JLabel();
        txtDescripción = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoVerdeOC.setBackground(new java.awt.Color(100, 176, 48));
        FondoVerdeOC.setPreferredSize(new java.awt.Dimension(600, 450));

        TITULO.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        TITULO.setForeground(new java.awt.Color(255, 255, 255));
        TITULO.setText("Añadir Producto");

        BTNSalir.setBackground(new java.awt.Color(255, 0, 0));
        BTNSalir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        BTNSalir.setText("Salir");
        BTNSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSalirActionPerformed(evt);
            }
        });

        BTNAñadir.setBackground(new java.awt.Color(68, 132, 0));
        BTNAñadir.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        BTNAñadir.setForeground(new java.awt.Color(255, 255, 255));
        BTNAñadir.setText("Añadir");
        BTNAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAñadirActionPerformed(evt);
            }
        });

        LabelNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        LabelPrecio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        LabelPrecio.setText("Precio:");

        txtPrecio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        txtPrecioAfiliado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        LabelPA.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LabelPA.setForeground(new java.awt.Color(255, 255, 255));
        LabelPA.setText("Precio Afiliado:");

        txtPuntosAfiliado.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        LabelPAf.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LabelPAf.setForeground(new java.awt.Color(255, 255, 255));
        LabelPAf.setText("Puntos Afiliado:");

        LabelCódigo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LabelCódigo.setForeground(new java.awt.Color(255, 255, 255));
        LabelCódigo.setText("Código:");

        txtCódigo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        txtProovedor.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        LabelProovedor.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LabelProovedor.setForeground(new java.awt.Color(255, 255, 255));
        LabelProovedor.setText("Proovedor:");

        LabelDesc.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        LabelDesc.setForeground(new java.awt.Color(255, 255, 255));
        LabelDesc.setText("Descripción:");

        txtDescripción.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        javax.swing.GroupLayout FondoVerdeOCLayout = new javax.swing.GroupLayout(FondoVerdeOC);
        FondoVerdeOC.setLayout(FondoVerdeOCLayout);
        FondoVerdeOCLayout.setHorizontalGroup(
            FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeOCLayout.createSequentialGroup()
                .addGap(0, 217, Short.MAX_VALUE)
                .addComponent(TITULO)
                .addGap(206, 206, 206))
            .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(BTNSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(BTNAñadir))
                    .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNombre)
                            .addComponent(LabelPrecio))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeOCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPA)
                    .addComponent(LabelPAf)
                    .addComponent(LabelCódigo)
                    .addComponent(LabelProovedor)
                    .addComponent(LabelDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuntosAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripción, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        FondoVerdeOCLayout.setVerticalGroup(
            FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoVerdeOCLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(TITULO)
                .addGap(26, 26, 26)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPA)
                    .addComponent(txtPrecioAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPAf)
                    .addComponent(txtPuntosAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCódigo)
                    .addComponent(txtCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProovedor)
                    .addComponent(txtProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDesc)
                    .addComponent(txtDescripción, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoVerdeOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTNSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNAñadir))
                .addContainerGap(126, Short.MAX_VALUE))
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
            .addComponent(FondoVerdeOC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAñadirActionPerformed
        String nombre =txtNombre.getText();
        String precio=txtPrecio.getText();
        String precioafiliado=txtPrecioAfiliado.getText();
        String puntosafiliado=txtPuntosAfiliado.getText();
        String codigo=txtCódigo.getText();
        String proveedor=txtProovedor.getText();
        String descripcion=txtDescripción.getText();
        
        if(codigo == ""){
            BTNAñadir.setForeground(new java.awt.Color(255, 0, 0));
        }else{
            Productos.agregarNuevoProducto(nombre,Double.parseDouble(precio), Double.parseDouble(precioafiliado), codigo, proveedor, descripcion, Integer.parseInt(puntosafiliado));
        }
        
        

        
    }//GEN-LAST:event_BTNAñadirActionPerformed

    private void BTNSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalirActionPerformed
        OpcionesJefe OJ = new OpcionesJefe();
        OJ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNSalirActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAñadir;
    private javax.swing.JButton BTNSalir;
    private javax.swing.JPanel FondoVerdeOC;
    private javax.swing.JLabel LabelCódigo;
    private javax.swing.JLabel LabelDesc;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPA;
    private javax.swing.JLabel LabelPAf;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelProovedor;
    private javax.swing.JLabel TITULO;
    private javax.swing.JTextField txtCódigo;
    private javax.swing.JTextField txtDescripción;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioAfiliado;
    private javax.swing.JTextField txtProovedor;
    private javax.swing.JTextField txtPuntosAfiliado;
    // End of variables declaration//GEN-END:variables
}
