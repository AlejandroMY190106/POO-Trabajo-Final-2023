package GUI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.AbstractBarcodeStrategy;
import net.sourceforge.jbarcodebean.model.Codabar;
import net.sourceforge.jbarcodebean.model.Code11;
import net.sourceforge.jbarcodebean.model.Code128;
import net.sourceforge.jbarcodebean.model.Code39;
import net.sourceforge.jbarcodebean.model.Code93;
import net.sourceforge.jbarcodebean.model.Ean13;
import net.sourceforge.jbarcodebean.model.Ean8;
import net.sourceforge.jbarcodebean.model.Interleaved25;
import net.sourceforge.jbarcodebean.model.MSI;
import tottus.Productos;

/**
 *
 *
 * @author L-Code
 */
public class BuscarCodigoBarras extends javax.swing.JFrame {

    private BufferedImage mImageCB = null;

    public BuscarCodigoBarras() {
        initComponents();
        Productos.InicioListaProductos();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        pnlCodigoBarrasGenerated = new javax.swing.JPanel();
        lblCB = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbTipoCodigo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 255, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Buscar por código de barras");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        pnlCodigoBarrasGenerated.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlCodigoBarrasGeneratedLayout = new javax.swing.GroupLayout(pnlCodigoBarrasGenerated);
        pnlCodigoBarrasGenerated.setLayout(pnlCodigoBarrasGeneratedLayout);
        pnlCodigoBarrasGeneratedLayout.setHorizontalGroup(
            pnlCodigoBarrasGeneratedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCodigoBarrasGeneratedLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lblCB, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCodigoBarrasGeneratedLayout.setVerticalGroup(
            pnlCodigoBarrasGeneratedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCodigoBarrasGeneratedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbTipoCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code11", "Code39", "Code93", "Code128", "Codabar", "Ean8", "Ean13", "Interleaved25", "MSI" }));

        jLabel2.setText("Código de barras:");

        jLabel3.setText("Tipo:");

        txtResultados.setColumns(20);
        txtResultados.setRows(5);
        txtResultados.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtResultados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel3))
                            .addComponent(pnlCodigoBarrasGenerated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodigo)
                                    .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTipoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar)
                    .addComponent(jButton1))
                .addGap(13, 13, 13)
                .addComponent(pnlCodigoBarrasGenerated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private AbstractBarcodeStrategy getCodeType(String codeType) {
        AbstractBarcodeStrategy mCodeType = null;
        switch (codeType) {
            case "Code11":
                mCodeType = new Code11();
                break;
            case "Code39":
                mCodeType = new Code39();
                break;
            case "Code93":
                mCodeType = new Code93();
                break;
            case "Code128":
                mCodeType = new Code128();
                break;
            case "Codabar":
                mCodeType = new Codabar();
                break;
            case "Ean8":
                mCodeType = new Ean8();
                break;
            case "Ean13":
                mCodeType = new Ean13();
                break;
            case "Interleaved25":
                mCodeType = new Interleaved25();
                break;
            case "MSI":
                mCodeType = new MSI();
                break;
            default:
                mCodeType = null;
        }
        return mCodeType;
    }

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String codigoBarras = txtCodigo.getText().trim();

        if (codigoBarras.equals("")) {
            return;
        }

        JBarcodeBean mBarcodeBean = new JBarcodeBean();
        mBarcodeBean.setCodeType(getCodeType(cbTipoCodigo.getSelectedItem().toString()));
        mBarcodeBean.setCode(codigoBarras);

        mImageCB = mBarcodeBean.draw(new BufferedImage(lblCB.getWidth(), lblCB.getHeight(), BufferedImage.TYPE_INT_RGB));

        ImageIcon mIcon = new ImageIcon(new ImageIcon(mImageCB).getImage().getScaledInstance(lblCB.getWidth(), lblCB.getHeight(), 0));

        lblCB.setIcon(mIcon);

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Obtener el código ingresado en el txtCodigo
        String codigoBuscado = txtCodigo.getText();

        // Buscar el producto por código
        Productos productoEncontrado = Productos.buscarProductoPorCodigo(codigoBuscado);

        if (productoEncontrado != null) {
            // Si se encontró el producto, mostrar sus datos en el txtResultados
            txtResultados.setText(productoEncontrado.toString());
        } else {
            // Si no se encontró el producto, mostrar un diálogo
            JOptionPane.showMessageDialog(this, "Producto no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void estiloWindows() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {

        }
    }

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
            java.util.logging.Logger.getLogger(BuscarCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCodigoBarras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbTipoCodigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCB;
    private javax.swing.JPanel pnlCodigoBarrasGenerated;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables

}
