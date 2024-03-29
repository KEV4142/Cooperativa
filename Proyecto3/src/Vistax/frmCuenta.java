package Vistax;
import Controller.ControlUniversal;
import Modelos.Banco;
import Modelos.Cuenta;
import Modelos.Moneda;
import Utilerias.interfacex;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author root4142
 */
public class frmCuenta extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private Vector<JComboBox> cboCombos=new Vector<>();
    private Vector<JLabel> lblLabels=new Vector<>();
    private boolean ins=true,b=false,m=false;
    private ControlUniversal control;
    private Cuenta cuenta;
    public frmCuenta(ControlUniversal cont) {
        initComponents();
        control=cont;
        txtCampos.add(txtCuentaID);
        txtCampos.add(txtBancoID);
        txtCampos.add(txtMonedaID);
        txtCampos.add(txtNombre);
        lblLabels.add(lblBancoNombre);
        lblLabels.add(lblMonedaNombre);
        cboCombos.add(cboTipo);
        cboCombos.add(cboEstado);
        cuenta=new Cuenta();
        txtCuentaID.grabFocus();
    }

    private void Limpiar_Campos(){
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        for(JComboBox p: cboCombos){
            p.setSelectedIndex(0);
        }
        for(JLabel q:lblLabels){
            q.setText("Nombre del "+q.getName()+".");
        }
        ins=true;
        b=false;
        m=false;
        txtCuentaID.setEnabled(true);
        txtCuentaID.grabFocus();
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
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCuentaID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMonedaID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBancoID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblMonedaNombre = new javax.swing.JLabel();
        lblBancoNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox();
        cboTipo = new javax.swing.JComboBox();

        setTitle("Formulario de Mantenimiento de la tabla Cuenta.");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistax/Iconos/icon.jpeg"))); // NOI18N
        setName("frmCuenta"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Moneda :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtNombre.setColumns(50);
        txtNombre.setName("Nombre"); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 260, -1));

        jLabel2.setText("ID Cuenta :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtCuentaID.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        txtCuentaID.setColumns(20);
        txtCuentaID.setName("CuentaID"); // NOI18N
        txtCuentaID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuentaIDKeyTyped(evt);
            }
        });
        getContentPane().add(txtCuentaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, -1));

        jLabel4.setText("Nombre :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtMonedaID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMonedaID.setName("MonedaID"); // NOI18N
        txtMonedaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonedaIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtMonedaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, -1));

        jLabel7.setText("ID Banco :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtBancoID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBancoID.setName("BancoID"); // NOI18N
        txtBancoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBancoIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtBancoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 70, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 80, -1));

        jButton2.setText("Recuperar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 110, -1));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 100, -1));

        lblMonedaNombre.setBackground(java.awt.Color.white);
        lblMonedaNombre.setText("Nombre de la Moneda.");
        lblMonedaNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblMonedaNombre.setName("Moneda"); // NOI18N
        lblMonedaNombre.setOpaque(true);
        getContentPane().add(lblMonedaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 250, 30));

        lblBancoNombre.setBackground(java.awt.Color.white);
        lblBancoNombre.setText("Nombre del Banco.");
        lblBancoNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblBancoNombre.setName("Banco"); // NOI18N
        lblBancoNombre.setOpaque(true);
        getContentPane().add(lblBancoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 67, 250, 30));

        jLabel3.setText("Estado :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabel5.setText("Tipo :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activa", "Inactiva" }));
        getContentPane().add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 130, -1));

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ahorros", "Cheques" }));
        getContentPane().add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 130, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-539)/2, (screenSize.height-390)/2, 539, 390);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String cod = "";
        try{
        cod = JOptionPane.showInputDialog(rootPane, "Ingrese Codigo de la Cuenta : ", "Ingrese", JOptionPane.INFORMATION_MESSAGE);
        if (!cod.isEmpty()) {
            cuenta = new Cuenta();
            Object o[][] = control.seekUniversal(cuenta.getVectorData(), "Cuenta","'"+cod.trim()+"'");
            if (o != null) {
                cuenta = new Cuenta(o);
                txtCuentaID.setText(cuenta.getCuentaID());
                txtBancoID.setText(cuenta.getBancoID() + "");
                txtBancoIDActionPerformed(evt);
                txtMonedaID.setText(cuenta.getMonedaID() + "");
                txtMonedaIDActionPerformed(evt);
                txtNombre.setText(cuenta.getNombre());
                if (cuenta.getTipo().equals("A")) {
                    cboCombos.get(0).setSelectedIndex(0);
                } else if (cuenta.getTipo().equals("C")) {
                    cboCombos.get(0).setSelectedIndex(1);
                }
                if (cuenta.getEstado().equals("A")) {
                    cboCombos.get(1).setSelectedIndex(0);
                } else if (cuenta.getEstado().equals("I")) {
                    cboCombos.get(1).setSelectedIndex(1);
                }
                txtBancoID.grabFocus();
                txtCuentaID.setEnabled(false);
                ins = false;b=false;m=false;
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Debe de ingresar un ID de Cuenta Valido","Error",JOptionPane.ERROR_MESSAGE);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Debe de ingresar un ID de Cuenta Valido","Error",JOptionPane.ERROR_MESSAGE);
            Limpiar_Campos();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean a=false, bb=false;
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
            if (!b) {
                JOptionPane.showMessageDialog(rootPane, "Campo Banco ID no esta Validado", "Error", JOptionPane.ERROR_MESSAGE);
                bb = false;
                txtBancoID.grabFocus();
            } 
            else if (!m) {
                JOptionPane.showMessageDialog(rootPane, "Campo Moneda ID no esta Validado", "Error", JOptionPane.ERROR_MESSAGE);
                bb = false;
                txtMonedaID.grabFocus();
            }
            else if(ins && control.seekUniversal("Cuenta", "CuentaID","'"+txtCuentaID.getText().toUpperCase().trim()+"'" )){
                JOptionPane.showMessageDialog(rootPane, "Codigo de Cuenta ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                bb = false;
                txtCuentaID.grabFocus();
            }
            else {
                bb = true;
            }
            if (bb) {
                String xx = "", yy = "";
                if (cboTipo.getSelectedIndex() == 0) {
                    xx = "A";
                } else if (cboTipo.getSelectedIndex() == 1) {
                    xx = "C";
                }
                if (cboEstado.getSelectedIndex() == 0) {
                    yy = "A";
                } else if (cboEstado.getSelectedIndex() == 1) {
                    yy = "I";
                }
                cuenta = new Cuenta(txtCuentaID.getText().toUpperCase(), inter.String_Int(txtBancoID.getText()), inter.String_Int(txtMonedaID.getText()), txtNombre.getText().toUpperCase(), xx, yy);
                if (ins) {
                    control.insUniversal(cuenta.getVectorData(), "Cuenta");
                } else {
                    control.updUniversal(cuenta.getVectorData(), "Cuenta", "'"+txtCuentaID.getText().trim()+"'");
                }
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!ins){
            int res = -1;
            res = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar este Registro?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                control.delUniversal(cuenta.getVectorData(), "Cuenta", "'" + txtCuentaID.getText().trim() + "'");
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtBancoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBancoIDActionPerformed
        Banco banco = new Banco();
        Object o[][] = control.seekUniversal(banco.getVectorData(), "Banco", txtBancoID.getText());
        if (o != null) {
            banco=new Banco(o);
            lblBancoNombre.setText(banco.getNombre_Banco());
            b=true;
            txtMonedaID.grabFocus();
        }
    }//GEN-LAST:event_txtBancoIDActionPerformed

    private void txtMonedaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonedaIDActionPerformed
        Moneda moneda = new Moneda();
        Object o[][] = control.seekUniversal(moneda.getVectorData(), "Moneda", txtMonedaID.getText());
        if (o != null) {
            moneda=new Moneda(o);
            lblMonedaNombre.setText(moneda.getNombre());
            m=true;
            txtNombre.grabFocus();
        }
    }//GEN-LAST:event_txtMonedaIDActionPerformed

    private void txtCuentaIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaIDKeyTyped
        if(txtCuentaID.getText().length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_txtCuentaIDKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JComboBox cboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblBancoNombre;
    private javax.swing.JLabel lblMonedaNombre;
    private javax.swing.JTextField txtBancoID;
    private javax.swing.JTextField txtCuentaID;
    private javax.swing.JTextField txtMonedaID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
