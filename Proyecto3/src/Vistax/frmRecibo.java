package Vistax;
import Controller.ControlUniversal;
import Modelos.Anticipo;
import Modelos.Carga;
import Modelos.Cuota;
import Modelos.Factura;
import Modelos.FormaPago;
import Modelos.Prestamo;
import Modelos.Recibo;
import Modelos.Socio;
import Utilerias.interfacex;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author root4142
 */
public class frmRecibo extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private Date date,date2;
    private Calendar c1 = new GregorianCalendar();
    private ControlUniversal control;
    private boolean ins=true,b=false,c=false;
    private Anticipo anticipo;
    private Prestamo prestamo;
    private Cuota cuota;
    private Factura factura;
    private FormaPago formapago;
    private Recibo recibo;
    /**
     * Creates new form frmRecibo
     */
    public frmRecibo(ControlUniversal cont) {
        initComponents();
        control=cont;
        txtCampos.add(txtReciboID);
        txtCampos.add(txtRuta);
        txtCampos.add(txtCodigo);
        date=new Date();
        date=control.getFechaSistemaSql();
        cboFecha.setDate(date);
        int auto = control.autoUniversal2("Recibo","ReciboID");
        txtReciboID.setText(String.valueOf(auto));
        rd1.grabFocus();
    }
    private void Limpiar_Campos(){
        date=new Date();
        date=control.getFechaSistemaSql();
        cboFecha.setDate(date);
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        lblNombre.setText("");
        ins=true;
        b=false;c=false;
        int auto = control.autoUniversal2("Recibo","ReciboID");
        txtReciboID.setText(String.valueOf(auto));
        rd1.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtReciboID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboFecha = new com.toedter.calendar.JDateChooser();
        txtRuta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();

        setTitle("Formulario de Recibos.");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistax/Iconos/icon.jpeg"))); // NOI18N
        setName("frmRecibo"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("No. Recibo :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtReciboID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtReciboID.setEnabled(false);
        txtReciboID.setName("ReciboID"); // NOI18N
        getContentPane().add(txtReciboID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, -1));

        jLabel2.setText("Fecha :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        cboFecha.setDateFormatString("MMMMM d, yyyy");
        cboFecha.setEnabled(false);
        getContentPane().add(cboFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 220, -1));

        txtRuta.setEnabled(false);
        txtRuta.setName("Ruta"); // NOI18N
        txtRuta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutaKeyTyped(evt);
            }
        });
        getContentPane().add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 290, -1));

        jLabel6.setText("Ruta de Archivo TXT :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("¿Que desea Pagar?"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rd1);
        rd1.setSelected(true);
        rd1.setText("Anticipo");
        jPanel1.add(rd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        buttonGroup1.add(rd2);
        rd2.setText("Cuota de Prestamo");
        jPanel1.add(rd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        buttonGroup1.add(rd3);
        rd3.setText("Factura al Credito");
        jPanel1.add(rd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 510, 70));

        jLabel3.setText("Codigo del Producto Financiero : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodigo.setName("Codigo"); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, -1));

        jButton2.setText("Procesar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 120, -1));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 120, -1));

        lblNombre.setBackground(java.awt.Color.white);
        lblNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombre.setOpaque(true);
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 260, 30));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-629)/2, (screenSize.height-427)/2, 629, 427);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutaKeyTyped
        if(txtRuta.getText().length()>=200){
            evt.consume();
        }
    }//GEN-LAST:event_txtRutaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Solo Archivos *.TXT", "txt");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Seleccione un Archivo *.TXT");
        chooser.setApproveButtonText("Seleccionar");
        chooser.setMultiSelectionEnabled(false);
        int returnVal = chooser.showOpenDialog(rootPane);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().getAbsolutePath();
            String r="";
            if(ruta.indexOf(".")!=-1){
                r=ruta.substring(0, ruta.indexOf("."));
            }
            else{
                r=ruta;
            }
            ruta = r + ".txt";
            txtRuta.setText(ruta);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        c = false;
        for (JTextField o : txtCampos) {
            if (o.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Campo " + o.getName() + " se encuentra Vacio", "Error", JOptionPane.ERROR_MESSAGE);
                o.grabFocus();
                c = false;
                break;
            } else {
                c = true;
            }
        }
        if (c) {
            if (!b) {
                JOptionPane.showMessageDialog(rootPane, "Campo Codigo no esta validado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                txtCodigo.grabFocus();
            } else {
                int rec=inter.String_Int(txtReciboID.getText());
                Date d = cboFecha.getDate();
                String fecha = inter.Date_String(d);
                int auto = control.autoUniversal2("Carga","CargaID");
                Carga carga;
                if (rd1.isSelected()) {
                    Socio socio=new Socio();
                    Object[][] k=control.seekUniversal(socio.getVectorData(),"Socio",anticipo.getSocioID()+"");
                    if(k!= null) {
                        socio=new Socio(k);
                        carga=new Carga(auto,fecha,socio.getEmpresaID(),txtRuta.getText(),"D");
                        recibo=new Recibo(rec, fecha, anticipo.getAnticipoID()+"", "null", "null", "null", "null", "D", carga.getCargaID());
                        anticipo.setEstado("D");
                        
                        boolean y=control.insUniversal3(recibo.getVectorDataInsert(), "Recibo");
                        boolean x=control.updUniversal2(anticipo.getVectorData(),"Anticipo",anticipo.getAnticipoID()+"");
                        boolean z=control.insUniversal2(carga.getVectorData(), "Carga");
                        if ((y) && (x) && (z)) {
                            JOptionPane.showMessageDialog(rootPane, "OPERACION EFECTUADA CON EXITO");
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "OCURRIO UN ERROR EN EL PROCESO, CONSULTE A SU DBA MANAGER");
                        }
                    }
                } else if (rd2.isSelected()) {
                    Socio socio = new Socio();
                    Object[][] k = control.seekUniversal(socio.getVectorData(), "Socio", prestamo.getSocioID() + "");
                    if (k != null) {
                        socio = new Socio(k);
                        carga = new Carga(auto, fecha, socio.getEmpresaID(), txtRuta.getText(), "D");
                        recibo = new Recibo(rec, fecha, "null", cuota.getCuotaID() + "", prestamo.getPrestamoID() + "", "null", "null", "D", carga.getCargaID());
                        cuota.setEstado("D");
                        
                        boolean y=control.insUniversal3(recibo.getVectorDataInsert(), "Recibo");
                        boolean x=control.updUniversal2(cuota.getVectorData(),"Cuota",cuota.getPrestamoID()+" and CuotaID="+cuota.getCuotaID());
                        boolean z=control.insUniversal2(carga.getVectorData(), "Carga");
                        if ((y) && (x) && (z)) {
                            JOptionPane.showMessageDialog(rootPane, "OPERACION EFECTUADA CON EXITO");
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "OCURRIO UN ERROR EN EL PROCESO, CONSULTE A SU DBA MANAGER");
                        }
                    }
                } else if (rd3.isSelected()) {
                    Socio socio = new Socio();
                    Object[][] k = control.seekUniversal(socio.getVectorData(), "Socio", factura.getSocioID() + "");
                    if (k != null) {
                        socio = new Socio(k);
                        carga = new Carga(auto, fecha, socio.getEmpresaID(), txtRuta.getText(), "D");
                        recibo = new Recibo(rec, fecha, "null","null","null",factura.getFacturaID()+"",factura.getTiendaID()+"", "D", carga.getCargaID());
                        factura.setEstado("D");
                        
                        boolean y=control.insUniversal3(recibo.getVectorDataInsert(), "Recibo");
                        boolean x=control.updUniversal2(factura.getVectorData(),"Factura",factura.getFacturaID()+"");
                        boolean z=control.insUniversal2(carga.getVectorData(), "Carga");
                        if ((y) && (x) && (z)) {
                            JOptionPane.showMessageDialog(rootPane, "OPERACION EFECTUADA CON EXITO");
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "OCURRIO UN ERROR EN EL PROCESO, CONSULTE A SU DBA MANAGER");
                        }
                    }
                }
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        if(rd1.isSelected()){
            anticipo=new Anticipo();
            Object[][] kk =control.seekUniversal(anticipo.getVectorData(), "Anticipo",txtCodigo.getText());
            if (kk != null) {
                anticipo=new Anticipo(kk);
                lblNombre.setText(anticipo.getValor()+"");
                b=true;
            }
        }else if(rd2.isSelected()){
            cuota=new Cuota();
            Object[][] kk =control.seekUniversal(cuota.getVectorData(), "Cuota",txtCodigo.getText());
            if (kk != null) {
                cuota=new Cuota(kk);
                prestamo = new Prestamo();
                Object[][] kkk = control.seekUniversal(prestamo.getVectorData(), "Prestamo", cuota.getPrestamoID()+"");
                if (kkk != null) {
                    prestamo=new Prestamo(kkk);
                    lblNombre.setText((cuota.getCapital() + cuota.getInteres()) + "");
                    b = true;
                }
            }
        }else if(rd3.isSelected()){
            factura=new Factura();
            Object[][] kk =control.seekUniversal(factura.getVectorData(), "Factura",txtCodigo.getText());
            if (kk != null) {
                factura=new Factura(kk);
                formapago = new FormaPago();
                Object[][] kkk = control.seekUniversal(formapago.getVectorData(), "FormaPago", factura.getFacturaID()+"");
                if (kkk != null) {
                    formapago=new FormaPago(kkk);
                    lblNombre.setText((formapago.getValor()) + "");
                    b = true;
                }
            }
        }
    }//GEN-LAST:event_txtCodigoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser cboFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtReciboID;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}