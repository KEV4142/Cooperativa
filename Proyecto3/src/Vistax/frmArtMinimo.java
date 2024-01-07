package Vistax;
import Controller.ControlUniversal;
import Modelos.Articulo;
import Modelos.Existencia;
import Modelos.Tienda;
import Utilerias.interfacex;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author root4142
 */
public class frmArtMinimo extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private boolean aa=false,bb=false;
    private ControlUniversal control;
    private Articulo articulo;
    private Tienda tienda;
    private Existencia existencia;
    
    public frmArtMinimo(ControlUniversal cont) {
        initComponents();
        control=cont;
        txtCampos.add(txtTiendaID);
        txtCampos.add(txtArticuloID);
        txtCampos.add(txtMinimo);
        articulo=new Articulo();
        txtTiendaID.grabFocus();
    }
    private void Limpiar_Campos(){
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        lblNombreArticulo.setText("");
        lblNombreTienda.setText("");
        aa=false;bb=false;
        txtTiendaID.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtTiendaID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtArticuloID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMinimo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblNombreArticulo = new javax.swing.JLabel();
        lblNombreTienda = new javax.swing.JLabel();

        setTitle("Formulario de Mantenimiento de la tabla Existencia.");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistax/Iconos/icon.jpeg"))); // NOI18N
        setName("frmArtMinimo"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Codigo de la Tienda :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtTiendaID.setBackground(java.awt.Color.white);
        txtTiendaID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTiendaID.setName("Codigo_Tienda"); // NOI18N
        txtTiendaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiendaIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtTiendaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 90, -1));

        jLabel3.setText("Minimo :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        txtArticuloID.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        txtArticuloID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArticuloID.setName("Codigo_Articulo"); // NOI18N
        txtArticuloID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtArticuloID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 90, -1));

        jLabel4.setText("ID Articulo :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        txtMinimo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMinimo.setName("MInimo"); // NOI18N
        getContentPane().add(txtMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, -1));

        jButton1.setText("Procesar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 120, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 80, -1));

        lblNombreArticulo.setBackground(java.awt.Color.white);
        lblNombreArticulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombreArticulo.setName(""); // NOI18N
        lblNombreArticulo.setOpaque(true);
        getContentPane().add(lblNombreArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 250, 30));

        lblNombreTienda.setBackground(java.awt.Color.white);
        lblNombreTienda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombreTienda.setOpaque(true);
        getContentPane().add(lblNombreTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 250, 30));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-572)/2, (screenSize.height-306)/2, 572, 306);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTiendaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiendaIDActionPerformed
        tienda = new Tienda();
        Object o[][] = control.seekUniversal(tienda.getVectorData(), "Tienda",txtTiendaID.getText());
        if (o != null) {
            tienda = new Tienda(o);
            lblNombreTienda.setText(tienda.getNombre());
            aa=true;
            txtArticuloID.grabFocus();
        }
    }//GEN-LAST:event_txtTiendaIDActionPerformed

    private void txtArticuloIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloIDActionPerformed
        articulo = new Articulo();
        Object o[][] = control.seekUniversal(articulo.getVectorData(), "Articulo",txtArticuloID.getText());
        if (o != null) {
            articulo = new Articulo(o);
            lblNombreArticulo.setText(articulo.getNombre());
            bb=true;
            txtMinimo.grabFocus();
        }
    }//GEN-LAST:event_txtArticuloIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean a=false,b=false;
        for(JTextField o:txtCampos){
            if(o.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane,"Campo "+o.getName()+" se encuentra Vacio","Error",JOptionPane.ERROR_MESSAGE);
                o.grabFocus();
                a=false;
                break;
            }
            else{
                a=true;
            }
        }
        if (a) {
            if(!aa){
                JOptionPane.showMessageDialog(rootPane,"Campo Tienda no esta validado","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                txtTiendaID.grabFocus();
            }
            else if(!bb){
                JOptionPane.showMessageDialog(rootPane,"Campo Articulo no esta validado","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                txtArticuloID.grabFocus();
            } else {
                b = control.seekUniversal("SELECT * FROM Existencia WHERE TiendaID=" + txtTiendaID.getText() + " and ArticuloID=" + txtArticuloID.getText() + ";");
                if (b) {
                    int x = -1;
                    x = JOptionPane.showConfirmDialog(rootPane, "Ya existe un registro con estos campos ¿Desea Actualizarlo?", "Mensaje", JOptionPane.YES_NO_OPTION);
                    if (x == JOptionPane.YES_OPTION) {
                        existencia = new Existencia();
                        Object o[][] = control.seekUniversal(existencia.getVectorData(), "Existencia", txtArticuloID.getText() + " and TiendaID=" + txtTiendaID.getText() + ";");
                        if (o != null) {
                            existencia = new Existencia(o);
                            existencia.setMinimo(inter.String_Int(txtMinimo.getText()));
                            control.updUniversal(existencia.getVectorData(), "Existencia", existencia.getArticuloID() + " and TiendaID=" + existencia.getTiendaID() + ";");
                        }
                    }
                } else {
                    existencia = new Existencia(inter.String_Int(txtArticuloID.getText()), inter.String_Int(txtTiendaID.getText()), 0, inter.String_Int(txtMinimo.getText()));
                    control.insUniversal(existencia.getVectorData(), "Existencia");
                }
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNombreArticulo;
    private javax.swing.JLabel lblNombreTienda;
    private javax.swing.JTextField txtArticuloID;
    private javax.swing.JTextField txtMinimo;
    private javax.swing.JTextField txtTiendaID;
    // End of variables declaration//GEN-END:variables
}