package Vistax;
import Controller.ControlUniversal;
import Modelos.Cooperativa;
import Utilerias.interfacex;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author root4142
 */
public class frmCooperativa extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private boolean ins=true;
    private ControlUniversal control;
    private Cooperativa cooperativa;
    
    public frmCooperativa(ControlUniversal cont) {
        initComponents();
        control=cont;
        txtCampos.add(txtCooperativaID);
        txtCampos.add(txtNombre);
        txtCampos.add(txtPlazosAnticipos);
        txtCampos.add(txtPlazosPrestamos);
        txtCampos.add(txtInteresFactura);
        txtCampos.add(txtInteresPrestamo);
        cooperativa=new Cooperativa();
        int auto = control.autoUniversal2("Cooperativa","CooperativaID");
        txtCooperativaID.setText(String.valueOf(auto));
        txtNombre.grabFocus();
    }
    private void Limpiar_Campos(){
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        ins=true;
        int auto = control.autoUniversal2("Cooperativa","CooperativaID");
        txtCooperativaID.setText(String.valueOf(auto));
        txtNombre.grabFocus();
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
        txtNombre = new javax.swing.JTextField();
        txtCooperativaID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtInteresPrestamo = new javax.swing.JTextField();
        txtPlazosAnticipos = new javax.swing.JTextField();
        txtPlazosPrestamos = new javax.swing.JTextField();
        txtInteresFactura = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setTitle("Mantenimiento de la Tabla Cooperativa.");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistax/Iconos/icon.jpeg"))); // NOI18N
        setName("frmCooperativa"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Interes de Prestamo :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel2.setText("Codigo de la Cooperativa :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtNombre.setName("Nombre"); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 270, -1));

        txtCooperativaID.setBackground(java.awt.Color.white);
        txtCooperativaID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCooperativaID.setEnabled(false);
        txtCooperativaID.setName("Codigo"); // NOI18N
        txtCooperativaID.setOpaque(false);
        getContentPane().add(txtCooperativaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, -1));

        jLabel3.setText("Nombre de la Cooperativa :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setText("No. de Plazos de Anticipo :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setText("No. de Plazos de Prestamos :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setText("Interes de Factura :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtInteresPrestamo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtInteresPrestamo.setName("Interes_de_Prestamo"); // NOI18N
        getContentPane().add(txtInteresPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 140, -1));

        txtPlazosAnticipos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPlazosAnticipos.setName("Plazos_de_Anticipos"); // NOI18N
        getContentPane().add(txtPlazosAnticipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 140, -1));

        txtPlazosPrestamos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPlazosPrestamos.setName("Plazos_de_Prestamos"); // NOI18N
        getContentPane().add(txtPlazosPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, -1));

        txtInteresFactura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtInteresFactura.setName("Interes_de_Factura"); // NOI18N
        getContentPane().add(txtInteresFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 140, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 80, -1));

        jButton2.setText("Recuperar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 110, -1));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 100, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 100, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-541)/2, (screenSize.height-363)/2, 541, 363);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x=-1;
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Ingrese Codigo de la Cooperativa : ", "Ingrese", JOptionPane.INFORMATION_MESSAGE));
            cooperativa=new Cooperativa();
            Object o[][]=control.seekUniversal(cooperativa.getVectorData(), "Cooperativa",x+"");
            if(o!=null){
                cooperativa = new Cooperativa(o);
                txtCooperativaID.setText(cooperativa.getCooperativaID()+"");
                txtNombre.setText(cooperativa.getNombre());
                txtPlazosAnticipos.setText(cooperativa.getPlazoAnticipos()+"");
                txtPlazosPrestamos.setText(cooperativa.getPlazoPrestamos()+"");
                txtInteresFactura.setText(cooperativa.getInteresFactura()+"");
                txtInteresPrestamo.setText(cooperativa.getInteresPrestamo()+"");
                txtNombre.grabFocus();
                ins = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico, pulse de nuevo el boton Recuperar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean a=false;
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
        if(a){
            cooperativa=new Cooperativa(inter.String_Int(txtCooperativaID.getText()), txtNombre.getText().toUpperCase(),inter.String_Int(txtPlazosAnticipos.getText()),inter.String_Int(txtPlazosPrestamos.getText()),inter.String_Float(txtInteresFactura.getText()),inter.String_Float(txtInteresPrestamo.getText()));
            if(ins){
                control.insUniversal(cooperativa.getVectorData(), "Cooperativa");
            }
            else{
                control.updUniversal(cooperativa.getVectorData(),"Cooperativa",txtCooperativaID.getText().trim());
            }
            Limpiar_Campos();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!ins){
            int res = -1;
            res = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar este Registro?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                control.delUniversal(cooperativa.getVectorData(), "Cooperativa", txtCooperativaID.getText().trim());
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCooperativaID;
    private javax.swing.JTextField txtInteresFactura;
    private javax.swing.JTextField txtInteresPrestamo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlazosAnticipos;
    private javax.swing.JTextField txtPlazosPrestamos;
    // End of variables declaration//GEN-END:variables
}
