package Vistax;
import Controller.ControlUniversal;
import Modelos.Empresa;
import Utilerias.interfacex;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author root4142
 */
public class frmEmpresa extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private boolean ins=true;
    private ControlUniversal control;
    private Empresa empresa;
    
    public frmEmpresa(ControlUniversal cont) {
        initComponents();
        control=cont;
        txtCampos.add(txtEmpresaID);
        txtCampos.add(txtNombre);
        txtCampos.add(txtAportacion);
        empresa=new Empresa();
        int auto = control.autoUniversal2("Empresa","EmpresaID");
        txtEmpresaID.setText(String.valueOf(auto));
        txtNombre.grabFocus();
    }
    private void Limpiar_Campos(){
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        ins=true;
        int auto = control.autoUniversal2("Empresa","EmpresaID");
        txtEmpresaID.setText(String.valueOf(auto));
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
        txtEmpresaID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAportacion = new javax.swing.JTextField();

        setTitle("Formulario de Mantenimiento de la tabla Empresa.");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistax/Iconos/icon.jpeg"))); // NOI18N
        setName("frmEmpresa"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre de la Empresa :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel2.setText("Codigo de la Empresa :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtNombre.setName("Nombre"); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 270, -1));

        txtEmpresaID.setBackground(java.awt.Color.white);
        txtEmpresaID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEmpresaID.setEnabled(false);
        txtEmpresaID.setName("Codigo"); // NOI18N
        txtEmpresaID.setOpaque(false);
        getContentPane().add(txtEmpresaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 130, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 80, -1));

        jButton2.setText("Recuperar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, -1));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 100, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, -1));

        jLabel3.setText("Aportacion (%) :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtAportacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAportacion.setName("Aportacion"); // NOI18N
        getContentPane().add(txtAportacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 120, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-536)/2, (screenSize.height-271)/2, 536, 271);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x=-1;
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Ingrese Codigo de la Empresa : ", "Ingrese", JOptionPane.INFORMATION_MESSAGE));
            empresa=new Empresa();
            Object o[][]=control.seekUniversal(empresa.getVectorData(), "Empresa",x+"");
            if(o!=null){
                empresa = new Empresa(o);
                txtEmpresaID.setText(empresa.getEmpresaID()+"");
                txtNombre.setText(empresa.getNombre());
                txtAportacion.setText(empresa.getAportacion()+"");
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
        if(inter.String_Int(txtAportacion.getText())<50 || inter.String_Int(txtAportacion.getText())>100){
            JOptionPane.showMessageDialog(rootPane, "Campo Aportacion debe de ser mayor de 49 y menor de 101", "Error", JOptionPane.ERROR_MESSAGE);
            txtAportacion.grabFocus();
            a = false;
        }
        if(a){
            empresa=new Empresa(inter.String_Int(txtEmpresaID.getText()), txtNombre.getText().toUpperCase(),inter.String_Int(txtAportacion.getText()));
            if(ins){
                control.insUniversal(empresa.getVectorData(), "Empresa");
            }
            else{
                control.updUniversal(empresa.getVectorData(),"Empresa",txtEmpresaID.getText().trim());
            }
            Limpiar_Campos();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!ins){
            int res = -1;
            res = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar este Registro?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                control.delUniversal(empresa.getVectorData(), "Empresa", txtEmpresaID.getText().trim());
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAportacion;
    private javax.swing.JTextField txtEmpresaID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}